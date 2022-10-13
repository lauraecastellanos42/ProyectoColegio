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
   Long id;
   Integer grado;
   String salon;


   public CursoDto(Long id, Integer grado, String salon) {
      this.id = id;
      this.grado = grado;
      this.salon = salon;
   }
}
