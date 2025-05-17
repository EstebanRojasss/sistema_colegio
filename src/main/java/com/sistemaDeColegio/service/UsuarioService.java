package com.sistemaDeColegio.service;

import com.sistemaDeColegio.dto.UsuarioDto;
import com.sistemaDeColegio.entities.roles.Rol;
import com.sistemaDeColegio.entities.roles.TipoRol;
import com.sistemaDeColegio.entities.usuario.Usuario;
import com.sistemaDeColegio.mapper.UsuarioDtoToUsuario;
import com.sistemaDeColegio.repository.RolRepository;
import com.sistemaDeColegio.repository.UsuarioRepositorio;
import com.sistemaDeColegio.security.HashPassword;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;

    private final HashPassword hashPassword;

    private final UsuarioDtoToUsuario mapper;

    private final RolRepository rolRepository;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio, HashPassword hashPassword, UsuarioDtoToUsuario dtoMapper, RolRepository rolRepository){
        this.usuarioRepositorio = usuarioRepositorio;
        this.hashPassword = hashPassword;
        this.mapper = dtoMapper;
        this.rolRepository = rolRepository;
    }

    public void crearUsuario(UsuarioDto usuarioDto){
        Usuario usuario = mapper.map(usuarioDto);
        String hash = hashPassword.hashearContrasenia(usuarioDto.contrasenia());
        usuario.setContrasenia(hash);
        Set<Rol> roles = usuarioDto.roles().
                stream().
                map(rol -> rolRepository.findByTipoRol(rol.getTipoRol()).
                orElseThrow(() -> new RuntimeException("Rol no encontrado" + rol))).collect(Collectors.toSet());
        usuario.setRoles(roles);
        this.usuarioRepositorio.save(usuario);
    }

}
