package com.sistemaDeColegio.service;

import com.sistemaDeColegio.entities.personas.Empleado;
import com.sistemaDeColegio.entities.personas.estado.Estado_Persona;
import com.sistemaDeColegio.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class EmpleadoService {
    private final EmpleadoRepository repository;

    public EmpleadoService(EmpleadoRepository repository){
        this.repository = repository;
    }

    public void crearEmpleado(){
        Empleado empleado = new Empleado("Esteban",
                "Rojas",
                23423423,
                LocalDate.of(2004, 10,10),
                "Requejo",
                "0984555444",
                "esteban@proton.com",
                Estado_Persona.SUSPENDIDO);
        repository.save(empleado);
    }
}
