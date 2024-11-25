package com.sneaker_store.application.service;

import com.sneaker_store.domain.Category;
import com.sneaker_store.domain.repository.CategoryRepository;
import com.sneaker_store.presentation.dto.CategoryDTO;
import com.sneaker_store.presentation.mapper.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public List<CategoryDTO> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categoryMapper.toDTOList(categories);
    }
}
