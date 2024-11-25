package com.sneaker_store.presentation.dto;

import com.sneaker_store.domain.Brand;
import com.sneaker_store.domain.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SneakerDTO {

    private Long id;

    private String name;

    private double price;

    private String unityMeasure;

    private double size;

    private String color;

    private String imagePath;

    private CategoryDTO category;

    private BrandDTO brand;
}
