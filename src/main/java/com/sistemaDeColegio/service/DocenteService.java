package com.sistemaDeColegio.service;

import com.sistemaDeColegio.entities.personas.Docente;
import com.sistemaDeColegio.entities.personas.estado.Estado_Persona;
import com.sistemaDeColegio.repository.DocenteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DocenteService {

    private final DocenteRepository repository;

    public DocenteService(DocenteRepository repository){
        this.repository = repository;
    }

    public void crearDocente(){
        Docente docente = new Docente("moncholo",
                "empanadero",
                1,
                LocalDate.of(1, 1, 1),
                "Moncholo´s bar",
                "0981111111",
                "moncholoempanadero@gmail.com",
                Estado_Persona.SUSPENDIDO);
        repository.save(docente);
    }

}
