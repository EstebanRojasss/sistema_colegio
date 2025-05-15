package com.sistemaDeColegio.entities;

import jakarta.persistence.Entity;

@Entity
public class Permiso {

    private Integer id;
    private TipoPermiso tipoPermiso;
}
