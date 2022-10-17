package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity,Long> {

    //JPAQL
    // busca todos los estudiantes que estan viendo una asignatura
    @Query(value = "SELECT A.estudiantes FROM AsignaturaEntity A WHERE A.id= :id")
    List<EstudianteEntity> findAllByEstudianteEntityList (Long id);

}
