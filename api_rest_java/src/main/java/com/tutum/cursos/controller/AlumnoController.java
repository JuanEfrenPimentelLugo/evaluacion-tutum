package com.tutum.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutum.cursos.dto.ResponseDto;
import com.tutum.cursos.model.TAlumno;
import com.tutum.cursos.model.TCalificacione;
import com.tutum.cursos.service.AlumnoService;
import com.tutum.cursos.util.ResponseType;

@Controller
@RestController
@RequestMapping("/alumnos")
@CrossOrigin(origins = "*")
public class AlumnoController {

	@Autowired
	AlumnoService alumnoService;


	@GetMapping("/listar")
	public List<TAlumno> listarAlumnos() {
		return alumnoService.list();
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/guardar")
	public HttpEntity guardarAlumno(TAlumno alumno) {
		try {
			alumnoService.save(alumno);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(
					ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
		}
		return ResponseEntity.ok().header("").body(
				new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/eliminar")
	public HttpEntity eliminarAlumno(TAlumno alumno) {
		try {
			alumnoService.delete(alumno);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(
					ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
		}
		return ResponseEntity.ok().header("").body(
				new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));

	}

}
