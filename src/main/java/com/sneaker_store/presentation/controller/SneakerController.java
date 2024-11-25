package com.sneaker_store.presentation.controller;

import com.sneaker_store.application.service.SneakerService;
import com.sneaker_store.domain.Sneaker;
import com.sneaker_store.domain.repository.SneakerRepository;
import com.sneaker_store.presentation.dto.SneakerDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.endpoints.internal.Value;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/sneakers")
@AllArgsConstructor
public class SneakerController {
    private SneakerService sneakerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SneakerDTO>> getSneakers() {
        return ResponseEntity.ok(sneakerService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Long> createSneaker(@RequestBody SneakerDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(sneakerService.create(dto));
    }

    @PostMapping(value = "/{id}/upload-image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
         if(file.isEmpty()){
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O arquivo está vazio.");
         }
        sneakerService.addImageToSneaker(id, file);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteSneaker(@PathVariable Long id){
        sneakerService.deleteSneaker(id);
       return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
