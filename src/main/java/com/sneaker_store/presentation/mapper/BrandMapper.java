package com.sneaker_store.presentation.mapper;

import com.sneaker_store.domain.Brand;
import com.sneaker_store.presentation.dto.BrandDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BrandMapper {
    BrandDTO toDTO(Brand brand);
    List<BrandDTO> toDTOList(List<Brand> brand);
}
