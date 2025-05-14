package com.sistemaDeColegio.entities.personas;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Docente extends Persona{

    public Docente(String nombre, String apellido, Integer numero_documento, LocalDate fecha_nacimiento, String direccion, String telefono, String email, Estado estado) {
        super(nombre, apellido, numero_documento, fecha_nacimiento, direccion, telefono, email, estado);
    }


}
