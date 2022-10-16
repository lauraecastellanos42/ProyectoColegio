package com.Proyecto.Colegio.controller;

import com.Proyecto.Colegio.dto.ProfesorDto;
import com.Proyecto.Colegio.persistence.entity.ProfesorEntity;
import com.Proyecto.Colegio.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/profesor")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @GetMapping(value="/listarProfesores")
    public List<ProfesorDto> findAll(){return profesorService.findAll();}

    @GetMapping(value="buscar/{id}")
    public ProfesorDto findById(@PathVariable Long id){
        return profesorService.findById(id);
    }

    @PostMapping("guardarProfesor")
    public ProfesorEntity saveTeacher(@RequestBody ProfesorDto profesorInput){
        return profesorService.saveEntity(profesorInput);
    }
}
