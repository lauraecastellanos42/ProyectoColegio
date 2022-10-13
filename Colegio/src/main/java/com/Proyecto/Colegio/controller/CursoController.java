package com.Proyecto.Colegio.controller;

import com.Proyecto.Colegio.persistence.dto.CursoDto;
import com.Proyecto.Colegio.service.ColegioService;
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

}
