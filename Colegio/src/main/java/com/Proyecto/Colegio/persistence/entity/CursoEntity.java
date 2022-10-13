package com.Proyecto.Colegio.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CURSO")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CursoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer grado;

    @Column
    private String salon;

    @ManyToOne
    @JoinColumn(name="id_colegio")
    @JsonIgnoreProperties("cursos")
    private ColegioEntity colegio;
}
