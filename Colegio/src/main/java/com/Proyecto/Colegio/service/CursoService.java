package com.Proyecto.Colegio.service;

import com.Proyecto.Colegio.mapper.CursoMapper;
import com.Proyecto.Colegio.dto.CursoDto;
import com.Proyecto.Colegio.persistence.entity.CursoEntity;
import com.Proyecto.Colegio.persistence.entity.EstudianteEntity;
import com.Proyecto.Colegio.repository.CursoRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private CursoMapper cursoMapper;

    // permite listar todos los cursos existentes en un colegio específico
    public List<CursoDto> getAllCurses (Long id){
        return cursoMapper.toDoList(cursoRepository.getAllCurses(id));
    }

    // permite listar todos los cursos existentes
    public List<CursoDto> findAll(){
        List<CursoDto> listaCursos = cursoMapper.toDoList(cursoRepository.findAll());
        return listaCursos;
    }

    // permite crear un nuevo curso
    public CursoEntity saveEntity(CursoDto cursoInput){
        CursoEntity cursoEntity = cursoMapper.toEntity(cursoInput);
        cursoRepository.save(cursoEntity);
        return cursoEntity;
    }

    // permite buscar  un curso por id
    public CursoDto findById(Long id) {
        CursoDto cursoEncontrado = cursoMapper.toDto(cursoRepository.findById(id).orElse(null));
        return cursoEncontrado;
    }
    @ManyToMany(mappedBy = "asignaturas",fetch = FetchType.LAZY)
    @JsonIgnoreProperties("asignaturas")
    private List<EstudianteEntity> estudiantes;
}
