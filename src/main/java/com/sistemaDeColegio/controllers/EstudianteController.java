package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.entities.personas.Estado;
import com.sistemaDeColegio.entities.personas.Estudiante;
import com.sistemaDeColegio.repository.EstudianteRepository;
import com.sistemaDeColegio.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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
