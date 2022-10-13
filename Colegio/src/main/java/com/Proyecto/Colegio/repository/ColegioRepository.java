package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.dto.CursoDto;
import com.Proyecto.Colegio.persistence.entity.ColegioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColegioRepository extends JpaRepository <ColegioEntity,Long> {

}
