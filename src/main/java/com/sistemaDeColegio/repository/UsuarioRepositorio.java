package com.sistemaDeColegio.repository;

import com.sistemaDeColegio.entities.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
