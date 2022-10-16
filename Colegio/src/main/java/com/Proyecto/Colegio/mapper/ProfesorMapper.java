package com.Proyecto.Colegio.mapper;

import com.Proyecto.Colegio.dto.ProfesorDto;
import com.Proyecto.Colegio.persistence.entity.ProfesorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring", uses = {com.Proyecto.Colegio.mapper.ProfesorMapper.class})
public interface ProfesorMapper {

        ProfesorDto toDto(ProfesorEntity profesorEntity);
        List<ProfesorDto> toDoList(List<ProfesorEntity>profesores);

        @InheritInverseConfiguration
        ProfesorEntity toEntity(ProfesorDto profesorDto);

    }
