package com.Proyecto.Colegio.dto;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class CursoDto {
   Long id;
   Integer grado;
   String salon;
   ColegioDto colegio;
}
