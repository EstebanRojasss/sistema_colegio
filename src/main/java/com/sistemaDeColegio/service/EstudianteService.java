package com.sistemaDeColegio.service;

import com.sistemaDeColegio.entities.personas.Estado;
import com.sistemaDeColegio.entities.personas.Estudiante;
import com.sistemaDeColegio.repository.EstudianteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository){
        this.repository = repository;
    }

    public void crearEstudiante(){
        Estudiante estudiante  = new Estudiante("Esteban",
                "Rojas",
                1313123,
                LocalDate.of(2000, 10,10),
                "Centro",
                "094112112",
                "esteban@proton.com",
                Estado.SUSPENDIDO,
                LocalDate.now());
        repository.save(estudiante);
    }
}
