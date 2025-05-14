package com.sistemaDeColegio;

import com.sistemaDeColegio.controllers.DocenteController;
import com.sistemaDeColegio.controllers.EmpleadoController;
import com.sistemaDeColegio.controllers.EstudianteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaDeColegioApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SistemaDeColegioApplication.class, args);

		EstudianteController estudianteController = context.getBean(EstudianteController.class);
		estudianteController.crearEstudiante();
		EmpleadoController empleadoController = context.getBean(EmpleadoController.class);
		empleadoController.crearEmpleado();
		DocenteController docenteController = context.getBean(DocenteController.class);
		docenteController.crearDcoente();
	}

}
