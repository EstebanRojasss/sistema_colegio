package com.sistemaDeColegio.entities.permisos;


import jakarta.persistence.*;

@Entity
public class Permiso {

    @Id
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private TipoPermiso tipoPermiso;



    public Permiso(Integer id, TipoPermiso tipoPermiso) {
        this.id = id;
        this.tipoPermiso = tipoPermiso;
    }

    public Permiso() {
    }

    public Integer getId() {
        return id;
    }

    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
}
