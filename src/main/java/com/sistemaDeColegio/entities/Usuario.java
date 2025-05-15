package com.sistemaDeColegio.entities;

import com.sistemaDeColegio.entities.personas.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_usuario;
    private String contrasenia;
    private String email;
    private LocalDate fecha_registro;
    private Estado estado;

    public Usuario(Integer id, String nombre_usuario, String contrasenia, String email, LocalDate fecha_registro, Estado estado) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
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

    public void setEstado(Estado estado) {
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }
}
