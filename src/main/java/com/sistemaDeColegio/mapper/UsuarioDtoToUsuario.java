package com.sistemaDeColegio.mapper;

import com.sistemaDeColegio.dto.UsuarioDto;
import com.sistemaDeColegio.entities.usuario.Usuario;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class UsuarioDtoToUsuario implements IMapper<UsuarioDto, Usuario>{


    @Override
    public Usuario map(UsuarioDto in) {
        return new Usuario(in.nombre_usuario(),
                in.contrasenia(),
                in.email(),
                LocalDate.now(),
                in.roles()
                );
    }
}
