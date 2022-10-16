package com.Proyecto.Colegio.controller;

import com.Proyecto.Colegio.dto.EstudianteDto;
import com.Proyecto.Colegio.persistence.entity.EstudianteEntity;
import com.Proyecto.Colegio.service.EstudianteService;
import com.Proyecto.Colegio.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping(value="/listarEstudiantes")
    public List<EstudianteDto> findAll(){return estudianteService.findAll();}

    @GetMapping(value="buscar/{id}")
    public EstudianteDto findById (@PathVariable Long id){
        return estudianteService.findById(id);
    }

    @PostMapping("guardarEstudiante")
    public EstudianteEntity saveStudent(@RequestBody EstudianteDto estudianteInput){
        return estudianteService.saveEntity(estudianteInput);
    }
}
