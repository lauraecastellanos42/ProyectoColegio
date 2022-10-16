package com.Proyecto.Colegio.persistence.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="profesor")
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProfesorEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;
    // Aca se debe implementar la relacion OneToMany con

    @OneToMany(mappedBy = "profesor",fetch = FetchType.LAZY) //<--"profesor" es el nombre del atributo que fue mapeado
    private List<AsignaturaEntity> asignaturas;

}
