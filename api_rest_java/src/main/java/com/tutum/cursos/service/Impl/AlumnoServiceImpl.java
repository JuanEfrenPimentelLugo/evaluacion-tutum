package com.tutum.cursos.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutum.cursos.model.TAlumno;
import com.tutum.cursos.repository.AlumnosRepository;
import com.tutum.cursos.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	private static final Logger logger = LoggerFactory.getLogger(AlumnoServiceImpl.class);
	
	@Autowired
	AlumnosRepository alumnoRepository;

	@Override
	public List<TAlumno> list() {
		return alumnoRepository.findAll();
	}

	@Override
	public TAlumno save(TAlumno alumno) {
		TAlumno nuevo_alumno = alumnoRepository.save(alumno);
		return nuevo_alumno;
	}
	
	
    @Override
	public void delete(TAlumno alumno) {
    	alumnoRepository.delete(alumno);
	}

}
