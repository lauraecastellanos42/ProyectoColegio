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

    @Query(value = "SELECT new com.Proyecto.Colegio.persistence.dto.CursoDto(C.id,C.grado,C.salon)" +
            "FROM CursoEntity C WHERE C.colegio.id = :id")
    List<CursoDto> getAllCurses(@Param("id") Long id);

}
