package com.Proyecto.Colegio.persistence.dto;

import com.Proyecto.Colegio.persistence.entity.CursoEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ColegioDto {
    Long id;
    String nombre;
    List<CursoDto> cursos;

    public ColegioDto(Long id, String nombre,List<CursoDto> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = cursos;
    }
}
