package com.sistemaDeColegio.repository;

import com.sistemaDeColegio.entities.roles.Rol;
import com.sistemaDeColegio.entities.roles.TipoRol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByTipoRol(TipoRol tipoRol);
}
