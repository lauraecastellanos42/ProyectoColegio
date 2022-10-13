package com.Proyecto.Colegio.persistence.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CursoDto {

   Integer grado;
   String salon;
   ColegioDto colegio;
}
