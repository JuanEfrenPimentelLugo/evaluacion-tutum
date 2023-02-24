package com.tutum.cursos.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tutum.cursos.dto.ResponseDto;
import com.tutum.cursos.model.TMateria;
import com.tutum.cursos.repository.MateriaRepository;
import com.tutum.cursos.service.MateriaService;
import com.tutum.cursos.util.ResponseType;

@Service
public class MateriaServiceImpl implements MateriaService {
	
	private static final Logger logger = LoggerFactory.getLogger(MateriaServiceImpl.class);
	
	@Autowired
	MateriaRepository materiaRepository;

	@Override
	public List<TMateria> list() {
		return materiaRepository.findAll();
	}

	@Override
	public TMateria save(TMateria materia) {
		return materiaRepository.save(materia);
	}

	@Override
	public ResponseEntity<?> delete(TMateria materia) {
        try {
        	materiaRepository.delete(materia);
        } catch (Exception ex) {
            logger.error("Error al eliminar materia", ex);
            return ResponseEntity.status(HttpStatus.CONFLICT).header("").body(new ResponseDto(ResponseType.UI_PROCESS_ERROR.getEstatus(), ResponseType.UI_PROCESS_ERROR.getDescripcion()));
        }
		return ResponseEntity.ok().header("").body(new ResponseDto(ResponseType.UI_PROCESS_OK.getEstatus(), ResponseType.UI_PROCESS_OK.getDescripcion()));

	}

}
