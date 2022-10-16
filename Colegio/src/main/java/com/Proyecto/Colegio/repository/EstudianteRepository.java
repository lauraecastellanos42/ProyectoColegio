package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity,Long> {

}
