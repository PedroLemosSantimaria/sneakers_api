package com.sneaker_store.presentation.controller;

import com.sneaker_store.application.service.BrandService;
import com.sneaker_store.presentation.dto.BrandDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brands")
@AllArgsConstructor
public class BrandController {
    private BrandService brandService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BrandDTO>> getBrands() {
        return ResponseEntity.ok(brandService.findAll());
    }
//
//    @GetMapping(value = "resource")
//    public String getResource(@AuthenticationPrincipal Jwt jwt){
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("<p>JWT Token: %s</p>".formatted(jwt.getTokenValue()));
//        stringBuilder.append("<p>JWT Headers: %s</p>".formatted(jwt.getHeaders()));
//        stringBuilder.append("<p>JWT Claims: %s</p>".formatted(jwt.getClaims()));
//        stringBuilder.append("<p>Resource accessed by: %s (with subject: %s)</p>".formatted(jwt.getSubject(),
//                jwt.getSubject()));
//
//        return stringBuilder.toString();
//    }
}
