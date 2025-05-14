package com.sistemaDeColegio.service;

import com.sistemaDeColegio.entities.personas.Empleado;
import com.sistemaDeColegio.entities.personas.Estado;

import java.time.LocalDate;

public class EmpleadoService {
    public void crearEmpleado(){
        Empleado empleado = new Empleado("Esteban",
                "Rojas",
                23423423,
                LocalDate.of(2004, 10,10),
                "Requejo",
                "0984555444",
                "esteban@proton.com",
                Estado.SUSPENDIDO);
        repository.save(empleado);
    }
}
