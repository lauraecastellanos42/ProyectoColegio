package com.Proyecto.Colegio.controller;

import com.Proyecto.Colegio.persistence.dto.CursoDto;
import com.Proyecto.Colegio.service.ColegioService;
import com.Proyecto.Colegio.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Curso")
public class CursoController {

    @Autowired
    private CursoService curso;

    @GetMapping(value = "/colegio/{id}")
    public List<CursoDto> getAllCurses (@PathVariable("id") Long id){
        return curso.getAllCurses(id);
    }
}
