package com.sistemaDeColegio.entities.usuario;

import com.sistemaDeColegio.entities.personas.estado.Estado_Persona;
import com.sistemaDeColegio.entities.roles.Rol;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_usuario;
    private String contrasenia;
    @Column(name = "email", unique = true)
    private String email;
    private LocalDate fecha_registro;
    private Estado_Persona estadoPersona;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_rol",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    private Set<Rol>roles;

    public Usuario(String nombre_usuario, String contrasenia, String email, LocalDate fecha_registro, Set<Rol> roles) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.fecha_registro = fecha_registro;
        this.roles = roles;
    }

    public Usuario(String nombre_usuario, String contrasenia, String email, LocalDate fecha_registro) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.fecha_registro = fecha_registro;
    }

    public Usuario() {
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public void setEstado(Estado_Persona estadoPersona) {
        this.estadoPersona = estadoPersona;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public Estado_Persona getEstado() {
        return estadoPersona;
    }
}
