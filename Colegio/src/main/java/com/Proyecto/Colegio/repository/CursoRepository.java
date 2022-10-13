package com.Proyecto.Colegio.repository;

import com.Proyecto.Colegio.persistence.dto.CursoDto;
import com.Proyecto.Colegio.persistence.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository <CursoEntity,Long> {

    @Query(value = "SELECT C FROM CursoEntity C WHERE C.colegioEntity.id = :paramId")
    public List<CursoDto> listarCursos(@Param("paramId") Long id);
}
