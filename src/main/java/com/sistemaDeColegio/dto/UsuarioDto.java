package com.sistemaDeColegio.dto;

import com.sistemaDeColegio.entities.roles.Rol;

import java.util.Set;

public record UsuarioDto(String nombre_usuario,
                         String contrasenia,
                         String email,
                         Set<Rol> roles) {
}
