package com.sneaker_store.application.service;

import com.sneaker_store.domain.Brand;
import com.sneaker_store.domain.repository.BrandRepository;
import com.sneaker_store.presentation.dto.BrandDTO;
import com.sneaker_store.presentation.mapper.BrandMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandService {
    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    public List<BrandDTO> findAll(){
        List<Brand> brands = brandRepository.findAll();
        return brandMapper.toDTOList(brands);
    }
}
