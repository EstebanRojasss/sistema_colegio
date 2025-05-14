package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.entities.personas.Empleado;
import com.sistemaDeColegio.entities.personas.Estado;
import com.sistemaDeColegio.repository.EmpleadoRepository;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class EmpleadoController {

    private final EmpleadoRepository repository;

    public EmpleadoController(EmpleadoRepository repository){
        this.repository = repository;
    }


}
