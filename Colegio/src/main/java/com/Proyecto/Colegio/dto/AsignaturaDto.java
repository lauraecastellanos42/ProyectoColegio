package com.Proyecto.Colegio.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class AsignaturaDto {
    private Long id;
    private String nombre;
    private ProfesorDto profesor;
    private CursoDto curso;
}
