package com.sistemaDeColegio.entities;

import com.sistemaDeColegio.entities.personas.Estado;

import java.time.LocalDate;

public class Usuario {
    private Integer id;
    private String nombre_usuario;
    private String contrasenhia;
    private String email;
    private LocalDate fecha_registro;
    private Estado estado;

    public Usuario(Integer id, String nombre_usuario, String contrasenhia, String email, LocalDate fecha_registro, Estado estado) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.contrasenhia = contrasenhia;
        this.email = email;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setContrasenhia(String contrasenhia) {
        this.contrasenhia = contrasenhia;
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

    public String getContrasenhia() {
        return contrasenhia;
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
