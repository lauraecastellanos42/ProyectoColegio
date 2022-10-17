package com.Proyecto.Colegio.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="CURSO")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "curso",fetch = FetchType.LAZY)
    private List<AsignaturaEntity> asignaturas;
}
