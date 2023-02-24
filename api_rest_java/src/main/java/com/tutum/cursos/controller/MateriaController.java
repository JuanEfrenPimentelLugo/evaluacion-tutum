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
import com.tutum.cursos.model.TMateria;
import com.tutum.cursos.service.MateriaService;
import com.tutum.cursos.util.ResponseType;

@Controller
@RestController
@RequestMapping("/materias")
@CrossOrigin(origins = "*")
public class MateriaController {
	
	@Autowired
	MateriaService materiaService;
	
	@GetMapping("/listar")
	public List<TMateria> listarMateria() {
		return materiaService.list();
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/guardar")
	public HttpEntity guardarMateria(TMateria materia) {
		try {
			materiaService.save(materia);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(
					ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
		}
		return ResponseEntity.ok().header("").body(
				new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/eliminar")
	public HttpEntity eliminarMateria(TMateria materia) {
		try {
			materiaService.delete(materia);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(
					ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
		}
		return ResponseEntity.ok().header("").body(
				new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));

	}

}
