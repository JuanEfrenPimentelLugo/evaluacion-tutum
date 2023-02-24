package com.tutum.cursos.service;

import java.util.List;


import com.tutum.cursos.model.TAlumno;

public interface AlumnoService {
	
	List<TAlumno> list();
	TAlumno save(TAlumno alumno);
	void delete(TAlumno alumno);

}
