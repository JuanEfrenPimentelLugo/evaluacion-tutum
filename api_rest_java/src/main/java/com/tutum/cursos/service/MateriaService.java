package com.tutum.cursos.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tutum.cursos.model.TMateria;

public interface MateriaService {

	List<TMateria> list();
	TMateria save(TMateria materia);
	ResponseEntity<?> delete(TMateria materia);
	
}
