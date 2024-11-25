package com.sneaker_store.presentation.mapper;

import com.sneaker_store.domain.Category;
import com.sneaker_store.presentation.dto.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    CategoryDTO toDTO(Category category);
    List<CategoryDTO> toDTOList(List<Category> category);
}
