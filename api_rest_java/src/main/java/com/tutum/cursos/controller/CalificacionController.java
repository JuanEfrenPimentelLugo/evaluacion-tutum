package com.tutum.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutum.cursos.dto.CalificacionResponseDto;
import com.tutum.cursos.dto.ResponseDto;
import com.tutum.cursos.model.TCalificacione;
import com.tutum.cursos.service.CalificacionService;
import com.tutum.cursos.util.ResponseType;

@Controller
@RestController
@RequestMapping("/calificaciones")
@CrossOrigin(origins = "*")
public class CalificacionController {
	
	@Autowired
	CalificacionService calificacionService; 
	
	@GetMapping("/alumno/{idTUsuarios}")
	public CalificacionResponseDto obtenerCalificacionesAlumno(@PathVariable("idTUsuarios") Long idTUsuarios) {
		return calificacionService.obtenerCalificacionesAlumno(idTUsuarios);
	}
	
	
	@GetMapping("/listar")
	public List<TCalificacione> listarCalificaciones() {
		return calificacionService.list();
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/guardar")
	public HttpEntity guardarCalificacion(@RequestBody(required = true) TCalificacione calificacion) {
		try {
			calificacionService.save(calificacion);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(
					ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
		}
		return ResponseEntity.ok().header("").body(
				new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/eliminar")
	public HttpEntity eliminarCalificacion(TCalificacione calificacion) {
		try {
			calificacionService.delete(calificacion);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(
					ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
		}
		return ResponseEntity.ok().header("").body(
				new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));

	}

}
