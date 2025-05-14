package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.service.DocenteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocenteController {

    private final DocenteService service;


    public DocenteController(DocenteService docenteService){
        this.service = docenteService;
    }
    @PostMapping
    public void mostrarDatosDocente(){

    }

}
