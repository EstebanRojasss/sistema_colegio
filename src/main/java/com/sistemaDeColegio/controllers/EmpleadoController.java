package com.sistemaDeColegio.controllers;
import com.sistemaDeColegio.service.EmpleadoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpleadoController {

    private final EmpleadoService service;

    public EmpleadoController(EmpleadoService service){
        this.service = service;
    }

    @PostMapping("/empleados")
    public ResponseEntity<Void>agregarEmpleado(){
        service.crearEmpleado();
        return ResponseEntity.ok().build();
    }

}
