package com.Proyecto.Colegio.mapper;

import com.Proyecto.Colegio.dto.EstudianteDto;
import com.Proyecto.Colegio.persistence.entity.EstudianteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {com.Proyecto.Colegio.mapper.EstudianteMapper.class})
public interface EstudianteMapper {
    EstudianteDto toDto(EstudianteEntity estudianteEntity);
    List<EstudianteDto> toDoList(List<EstudianteEntity>estudiantes);

    @InheritInverseConfiguration
    EstudianteEntity toEntity(EstudianteDto estudianteDto);
}
