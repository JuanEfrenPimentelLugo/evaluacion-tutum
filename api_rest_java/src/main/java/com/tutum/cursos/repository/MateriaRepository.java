package com.tutum.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutum.cursos.model.TMateria;

@Repository
public interface MateriaRepository extends JpaRepository<TMateria, Long> {

}
