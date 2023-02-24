package com.tutum.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutum.cursos.model.TAlumno;

@Repository
public interface AlumnosRepository extends JpaRepository<TAlumno, Long> {

}
