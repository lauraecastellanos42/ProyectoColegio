package com.Proyecto.Colegio.mapper;

import com.Proyecto.Colegio.dto.AsignaturaDto;
import com.Proyecto.Colegio.persistence.entity.AsignaturaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AsignaturaMapper.class,CursoMapper.class,ProfesorMapper.class})
public interface AsignaturaMapper {

    AsignaturaDto toDto(AsignaturaEntity asignaturaEntity);
    List<AsignaturaDto> toDoList(List<AsignaturaEntity>asignaturas);

    @InheritInverseConfiguration
    AsignaturaEntity toEntity(AsignaturaDto asignaturaDto);
}
