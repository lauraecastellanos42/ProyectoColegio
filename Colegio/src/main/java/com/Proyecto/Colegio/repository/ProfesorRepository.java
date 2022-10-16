package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.entity.ProfesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<ProfesorEntity,Long> {
}
