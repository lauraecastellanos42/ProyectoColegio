package com.Proyecto.Colegio.service;

import com.Proyecto.Colegio.persistence.dto.CursoDto;
import com.Proyecto.Colegio.repository.ColegioRepository;
import com.Proyecto.Colegio.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoDto> getAllCurses (Long id){
        return cursoRepository.listarCursos(id);
    }
}
