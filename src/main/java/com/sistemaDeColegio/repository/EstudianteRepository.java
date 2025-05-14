package com.sistemaDeColegio.repository;

import com.sistemaDeColegio.entities.personas.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {


}
