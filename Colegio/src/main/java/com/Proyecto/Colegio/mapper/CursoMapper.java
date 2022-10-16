package com.Proyecto.Colegio.mapper;

import com.Proyecto.Colegio.dto.CursoDto;
import com.Proyecto.Colegio.persistence.entity.CursoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring", uses = {CursoMapper.class,ColegioMapper.class})
public interface CursoMapper {

    CursoDto toDto(CursoEntity cursoEntity);
    List<CursoDto> toDoList(List<CursoEntity>cursos);

    @InheritInverseConfiguration
    CursoEntity toEntity(CursoDto cursoDto);
}
