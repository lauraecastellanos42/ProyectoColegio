package com.Proyecto.Colegio.service;

import com.Proyecto.Colegio.dto.AsignaturaDto;
import com.Proyecto.Colegio.dto.EstudianteDto;
import com.Proyecto.Colegio.mapper.AsignaturaMapper;
import com.Proyecto.Colegio.mapper.EstudianteMapper;
import com.Proyecto.Colegio.persistence.entity.AsignaturaEntity;
import com.Proyecto.Colegio.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Autowired
    private AsignaturaMapper asignaturaMapper;

    @Autowired
    private EstudianteMapper estudianteMapper;

    // permitira listar todas las asignaturas existentes
    public List<AsignaturaDto> findAll(){
        List<AsignaturaDto> listarAsignaturas = asignaturaMapper.toDoList(asignaturaRepository.findAll());
        return listarAsignaturas;
    }

    //permite crear una nueva asignatura
    public AsignaturaEntity saveEntity (AsignaturaDto asignaturaInput){
        AsignaturaEntity asignaturaEntity = asignaturaMapper.toEntity(asignaturaInput);
        asignaturaRepository.save(asignaturaEntity);
        return asignaturaEntity;
    }


    //permite buscar una asignatura por id
    public AsignaturaDto findById (Long id){
        AsignaturaDto asignaturaEncontrada = asignaturaMapper.toDto(asignaturaRepository.findById(id).orElse(null));
        return asignaturaEncontrada;
    }

    // permite obtener todas las asignaturas impartidas por un proferos
    public List<AsignaturaDto>asignatureByProfesor(Long idProfesor){
        List<AsignaturaDto> asignaturasDeProfesor = asignaturaMapper.toDoList(asignaturaRepository.asignatureByProfesor(idProfesor));
        return asignaturasDeProfesor;
    }
}
