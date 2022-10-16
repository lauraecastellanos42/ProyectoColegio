package com.Proyecto.Colegio.service;

import com.Proyecto.Colegio.dto.EstudianteDto;
import com.Proyecto.Colegio.mapper.EstudianteMapper;
import com.Proyecto.Colegio.persistence.entity.EstudianteEntity;
import com.Proyecto.Colegio.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteMapper estudianteMapper;

    // permite listar todos los estudiantes existentes
    public List<EstudianteDto> findAll(){
        List<EstudianteDto> listarEstudiantes = estudianteMapper.toDoList(estudianteRepository.findAll());
        return listarEstudiantes;
    }

    // permite crear un nuevo estudiante
    public EstudianteEntity saveEntity(EstudianteDto estudianteInput){
        EstudianteEntity estudianteEntity = estudianteMapper.toEntity(estudianteInput);
        estudianteRepository.save(estudianteEntity);
        return estudianteEntity;
    }

    // permite buscar  un estudiante por id
    public EstudianteDto findById(Long id) {
        EstudianteDto estudianteEncontrado = estudianteMapper.toDto(estudianteRepository.findById(id).orElse(null));
        return estudianteEncontrado;
    }

}
