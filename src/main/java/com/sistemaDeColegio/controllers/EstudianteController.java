package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {


    private final EstudianteService service;

    public EstudianteController(EstudianteService estudianteService){
        this.service = estudianteService;
    }

    @PostMapping("/estudiantes")
    public ResponseEntity<Void> crearEstudiante(){
        service.crearEstudiante();
        return ResponseEntity.ok().build();
    }
}
