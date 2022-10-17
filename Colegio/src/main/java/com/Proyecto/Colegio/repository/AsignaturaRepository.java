package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.entity.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaRepository extends JpaRepository <AsignaturaEntity,Long> {

    // permitira obtener todas las asignaturas impartidas por un profesor
    @Query(value = "SELECT A FROM AsignaturaEntity A WHERE A.profesor.id= :idProfesor")
    public List<AsignaturaEntity> asignatureByProfesor  (@Param("idProfesor")Long id);

    //insert into asignatura_estudiante (id_asignatura, id_estudiante) values (101,1000)
//    @Query(value = "insert into asignatura_estudiante (id_asignatura, id_estudiante) values (?1,?2)"
//            ,nativeQuery = true)
//    public Void insertAsignatureStudent (Long idAsignatura,Long idProfesor);
}
