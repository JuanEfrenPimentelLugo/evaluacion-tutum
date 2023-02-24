package com.tutum.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutum.cursos.model.TCalificacione;

@Repository
public interface CalificacionesRepository extends JpaRepository<TCalificacione, Long> {

	List<TCalificacione> findByIdTUsuarios(Long idTUsuarios);
	
}
