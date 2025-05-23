package com.sistemaDeColegio.entities.personas;

import com.sistemaDeColegio.entities.personas.estado.Estado_Persona;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Estudiante extends Persona{

    private LocalDate fecha_inscripcion;

    public Estudiante(String nombre, String apellido, Integer numero_documento, LocalDate fecha_nacimiento, String direccion, String telefono, String email, Estado_Persona estadoPersona, LocalDate fecha_inscripcion) {
        super(nombre, apellido, numero_documento, fecha_nacimiento, direccion, telefono, email, estadoPersona);
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(LocalDate fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
}
