package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService usuarioService){
        this.service = usuarioService;
    }

    @PostMapping("/usuario/{}")
    public String nuevoUsuario(){
        service.crearUsuario();
    }
}
