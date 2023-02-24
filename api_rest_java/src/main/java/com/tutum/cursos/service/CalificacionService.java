package com.tutum.cursos.service;

import java.util.List;

import com.tutum.cursos.dto.CalificacionResponseDto;
import com.tutum.cursos.model.TCalificacione;

public interface CalificacionService {
	
	List<TCalificacione> list();
	TCalificacione save(TCalificacione calificacion);
	void delete(TCalificacione calificacion);
	CalificacionResponseDto obtenerCalificacionesAlumno(Long idTUsuarios);

}
