package com.sistemaDeColegio.entities.roles;

import com.sistemaDeColegio.entities.permisos.Permiso;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;
    @Enumerated(EnumType.STRING)
    private TipoRol tipoRol;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "rol_permiso",
            joinColumns = @JoinColumn(name = "rol_id"),
            inverseJoinColumns = @JoinColumn(name = "permiso_id")
    )
    private Set<Permiso>permisos;


    public Rol(TipoRol tipoRol, Set<Permiso> permisos) {
        this.tipoRol = tipoRol;
        this.permisos = permisos;
    }

    public Rol() {
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
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
