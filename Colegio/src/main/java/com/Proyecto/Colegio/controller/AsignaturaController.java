package com.Proyecto.Colegio.controller;

import com.Proyecto.Colegio.dto.AsignaturaDto;
import com.Proyecto.Colegio.dto.EstudianteDto;
import com.Proyecto.Colegio.persistence.entity.AsignaturaEntity;
import com.Proyecto.Colegio.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/asignatura")
public class AsignaturaController {
    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping(value = "listarAsignaturas")
    public List<AsignaturaDto> findAll(){
        return  asignaturaService.findAll();
    }

    @GetMapping(value = "buscar/{id}")
    public AsignaturaDto findById (@PathVariable Long id){
        return asignaturaService.findById(id);
    }

    // permitira obtener todas las asignaturas impartidas por un profesor
    @GetMapping(value ="profesor/{id}")
    public List <AsignaturaDto> findSignatureOfTeacher (@PathVariable Long id){
        return asignaturaService.asignatureByProfesor(id);
    }

    @PostMapping("guardarAsignatura")
    public AsignaturaEntity saveAsignature (@RequestBody AsignaturaDto asignaturaInput){
        return asignaturaService.saveEntity(asignaturaInput);
    }

}
