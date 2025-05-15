package com.sistemaDeColegio.service;

import com.sistemaDeColegio.entities.roles.Rol;
import com.sistemaDeColegio.entities.usuario.Usuario;
import com.sistemaDeColegio.repository.UsuarioRepositorio;
import com.sistemaDeColegio.security.HashPassword;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class UsuarioService {

    private final UsuarioRepositorio repositorio;

    private final HashPassword hashPassword;

    public UsuarioService(UsuarioRepositorio repositorio, HashPassword hashPassword){
        this.repositorio = repositorio;
        this.hashPassword = hashPassword;
    }

    public void crearUsuario(String nombre_usuario, String contrasenia, String email, Set<Rol> roles){
        Usuario usuario = new Usuario();
        usuario.setNombre_usuario(nombre_usuario);
        usuario.setContrasenia(hashPassword.hashearContrasenia(contrasenia));
        usuario.setEmail(email);
        usuario.setFecha_registro(LocalDate.now());
        usuario.setRoles(roles);
        repositorio.save(usuario);
    }

}
