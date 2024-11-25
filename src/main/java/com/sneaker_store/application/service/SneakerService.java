package com.sneaker_store.application.service;

import com.sneaker_store.domain.Sneaker;
import com.sneaker_store.domain.repository.SneakerRepository;
import com.sneaker_store.presentation.dto.SneakerDTO;
import com.sneaker_store.presentation.mapper.SneakerMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;


@Service
@AllArgsConstructor
public class SneakerService {

    private final SneakerRepository sneakerRepository;

    private final SneakerMapper sneakerMapper;

    private final S3Service s3Service;

    public List<SneakerDTO> findAll(){
        List<Sneaker> sneakers = sneakerRepository.findAllOrderByImagePathDesc();
        return sneakerMapper.toDTOList(sneakers);
    }

    public Long create(SneakerDTO dto) {
        Sneaker sneakerToSave = sneakerMapper.toEntity(dto);
        Sneaker sneakerSaved = sneakerRepository.save(sneakerToSave);
        return sneakerSaved.getId();
    }

    public void addImageToSneaker(Long id, MultipartFile file) {
        try {
            String imagePath = s3Service.uploadFile(file);

            Sneaker sneaker = sneakerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
            sneaker.setImagePath(imagePath);

            sneakerRepository.save(sneaker);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteSneaker(Long id) {
        Sneaker sneaker = sneakerRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        if(Boolean.FALSE.equals(sneaker.getImagePath().isEmpty())){
            s3Service.deleteFile(sneaker.getImagePath());
        }

        sneakerRepository.delete(sneaker);
    }
}
