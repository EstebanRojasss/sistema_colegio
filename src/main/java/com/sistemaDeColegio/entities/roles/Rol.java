package com.sistemaDeColegio.entities.roles;

import jakarta.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;
    @Enumerated(EnumType.STRING)
    private TipoRol tipoRol;

    public Rol(Integer idRol, TipoRol tipoRol) {
        this.idRol = idRol;
        this.tipoRol = tipoRol;
    }

    public Rol() {
    }

    public Integer getIdRol() {
        return idRol;
    }

    public TipoRol getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(TipoRol tipoRol) {
        this.tipoRol = tipoRol;
    }
}
