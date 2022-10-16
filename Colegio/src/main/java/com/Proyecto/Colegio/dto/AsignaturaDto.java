package com.Proyecto.Colegio.dto;

import com.Proyecto.Colegio.persistence.entity.ProfesorEntity;
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
    private ProfesorEntity profesor;
}
