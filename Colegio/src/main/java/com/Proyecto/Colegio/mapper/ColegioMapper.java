package com.Proyecto.Colegio.mapper;

import com.Proyecto.Colegio.dto.ColegioDto;
import com.Proyecto.Colegio.persistence.entity.ColegioEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ColegioMapper.class})
public interface ColegioMapper {

    ColegioDto toDto(ColegioEntity colegioEntity);
    List<ColegioDto> toDoList(List<ColegioEntity>colegios);

    @InheritInverseConfiguration
    ColegioEntity toEntity(ColegioDto colegioDto);
}
