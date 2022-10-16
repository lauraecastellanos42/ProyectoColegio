package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.entity.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AsignaturaRepository extends JpaRepository <AsignaturaEntity,Long> {
}
