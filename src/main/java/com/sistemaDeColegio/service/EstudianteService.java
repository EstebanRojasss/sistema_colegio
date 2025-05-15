package com.sistemaDeColegio.service;

import com.sistemaDeColegio.entities.personas.estado.Estado_Persona;
import com.sistemaDeColegio.entities.personas.Estudiante;
import com.sistemaDeColegio.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

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
                Estado_Persona.SUSPENDIDO,
                LocalDate.now());
        repository.save(estudiante);
    }
}
