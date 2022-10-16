package com.Proyecto.Colegio.service;

import com.Proyecto.Colegio.dto.ProfesorDto;
import com.Proyecto.Colegio.mapper.ProfesorMapper;
import com.Proyecto.Colegio.persistence.entity.ProfesorEntity;
import com.Proyecto.Colegio.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;
    @Autowired
    private ProfesorMapper profesorMapper;


    // permite listar todos los profesores existentes
    public List<ProfesorDto> findAll(){
        List<ProfesorDto> listarProfesores = profesorMapper.toDoList(profesorRepository.findAll());
        return listarProfesores;
    }

    // permite crear un nuevo profesor
    public ProfesorEntity saveEntity(ProfesorDto profesorInput){
        ProfesorEntity profesorEntity = profesorMapper.toEntity(profesorInput);
        profesorRepository.save(profesorEntity);
        return profesorEntity;
    }

    // permite buscar  un profesor por id
    public ProfesorDto findById(Long id) {
        ProfesorDto profesorEncontrado = profesorMapper.toDto(profesorRepository.findById(id).orElse(null));
        return profesorEncontrado;
    }
}
