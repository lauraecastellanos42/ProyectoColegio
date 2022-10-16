package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.entity.ColegioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColegioRepository extends JpaRepository <ColegioEntity,Long> {

}
