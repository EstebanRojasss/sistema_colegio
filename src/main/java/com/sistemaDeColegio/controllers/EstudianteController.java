package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.entities.personas.Estado;
import com.sistemaDeColegio.entities.personas.Estudiante;
import com.sistemaDeColegio.repository.EstudianteRepository;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class EstudianteController {


    private final EstudianteRepository repository;

    public EstudianteController(EstudianteRepository repository){
        this.repository = repository;
    }

    public void crearEstudiante(){
        Estudiante estudiante = new Estudiante("Esteban",
                "Alberto",
                6944521,
                LocalDate.of(2002, 5, 10),
                "Centro",
                "098341231",
                "Hola@gmail.com",
                Estado.ACTIVO,LocalDate.now());

        repository.save(estudiante);
    }
}
