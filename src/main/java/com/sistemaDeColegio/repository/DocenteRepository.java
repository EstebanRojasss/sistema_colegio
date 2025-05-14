package com.sistemaDeColegio.repository;

import com.sistemaDeColegio.entities.personas.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {

}
