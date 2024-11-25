package com.sneaker_store.presentation.mapper;

import com.sneaker_store.domain.Sneaker;
import com.sneaker_store.presentation.dto.SneakerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

import java.util.List;
import java.util.Objects;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SneakerMapper {
    SneakerDTO toDTO(Sneaker sneaker);
    List<SneakerDTO> toDTOList(List<Sneaker> sneakers);

    @Mapping(source = "imagePath", target = "imagePath", qualifiedByName = "mapImagePath")
    Sneaker toEntity(SneakerDTO sneakerDTO);

    @Named("mapImagePath")
    default String mapDefaultImagePath(String imagePath){
        return Objects.isNull(imagePath) ? "" : imagePath;
    }
}
