package com.sistemaDeColegio.entities.personas;

import com.sistemaDeColegio.entities.personas.estado.Estado_Persona;
import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity
public class Empleado extends Persona{


    public Empleado(String nombre, String apellido, Integer numero_documento, LocalDate fecha_nacimiento, String direccion, String telefono, String email, Estado_Persona estadoPersona) {
        super(nombre, apellido, numero_documento, fecha_nacimiento, direccion, telefono, email, estadoPersona);
    }

    public Empleado() {

    }

}
