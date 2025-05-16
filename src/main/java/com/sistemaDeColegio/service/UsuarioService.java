package com.sistemaDeColegio.service;

import com.sistemaDeColegio.dto.UsuarioDto;
import com.sistemaDeColegio.entities.roles.Rol;
import com.sistemaDeColegio.entities.usuario.Usuario;
import com.sistemaDeColegio.mapper.UsuarioDtoToUsuario;
import com.sistemaDeColegio.repository.UsuarioRepositorio;
import com.sistemaDeColegio.security.HashPassword;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class UsuarioService {

    private final UsuarioRepositorio repositorio;

    private final HashPassword hashPassword;

    private final UsuarioDtoToUsuario mapper;

    public UsuarioService(UsuarioRepositorio repositorio, HashPassword hashPassword, UsuarioDtoToUsuario dtoMapper){
        this.repositorio = repositorio;
        this.hashPassword = hashPassword;
        this.mapper = dtoMapper;
    }

    public void crearUsuario(UsuarioDto usuarioDto){
        Usuario usuario = mapper.map(usuarioDto);
        String hash = hashPassword.hashearContrasenia(usuarioDto.contrasenia());
        usuario.setContrasenia(hash);
        this.repositorio.save(usuario);
    }

}
