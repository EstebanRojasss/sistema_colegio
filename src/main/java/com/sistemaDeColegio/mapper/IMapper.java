package com.sistemaDeColegio.mapper;

import com.sistemaDeColegio.dto.UsuarioDto;
import com.sistemaDeColegio.entities.usuario.Usuario;

public interface IMapper <I, O>{

    public O map(I in);
}
