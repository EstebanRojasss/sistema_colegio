package com.sistemaDeColegio.controllers;

import com.sistemaDeColegio.dto.UsuarioDto;
import com.sistemaDeColegio.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService usuarioService){
        this.service = usuarioService;
    }

    @PostMapping()
    public ResponseEntity<Void> nuevoUsuario(@RequestBody UsuarioDto dto){
        service.crearUsuario(dto);
        return ResponseEntity.ok().build();
    }
}
