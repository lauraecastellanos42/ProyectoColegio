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
    String nombre;
    List<CursoEntity> cursos;
}
