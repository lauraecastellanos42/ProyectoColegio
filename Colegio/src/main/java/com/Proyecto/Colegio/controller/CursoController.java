package com.Proyecto.Colegio.controller;

import com.Proyecto.Colegio.dto.CursoDto;
import com.Proyecto.Colegio.persistence.entity.CursoEntity;
import com.Proyecto.Colegio.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping(value = "/listarCursosColegio/{id}")
    public List<CursoDto> getAllCurses (@PathVariable Long id){
        return cursoService.getAllCurses(id);
    }

    @GetMapping(value = "/listarCursos")
    public List<CursoDto> findAll(){
        return cursoService.findAll();
    }
    @GetMapping(value = "buscar/{id}")
    public CursoDto findById(@PathVariable Long id){
        return cursoService.findById(id);
    }

    @PostMapping("guardarCurso")
    public CursoEntity saveCurso(@RequestBody CursoDto cursoInput){
        return cursoService.saveEntity(cursoInput);
    }


}
