package com.tutum.cursos.service.Impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutum.cursos.dto.CalificacionResponseDto;
import com.tutum.cursos.dto.CalificacionesDto;
import com.tutum.cursos.model.TCalificacione;
import com.tutum.cursos.repository.CalificacionesRepository;
import com.tutum.cursos.service.CalificacionService;

@Service
public class CalificacionServiceImpl implements CalificacionService {
	
	private static final Logger logger = LoggerFactory.getLogger(CalificacionServiceImpl.class);
	
	@Autowired
	CalificacionesRepository calificacionesRepository;

	@Override
	public List<TCalificacione> list() {
		return calificacionesRepository.findAll();
	}

	@Override
	public TCalificacione save(TCalificacione calificacion) {
		return calificacionesRepository.save(calificacion);
	}

	@Override
	public void delete(TCalificacione calificacion) {
		calificacionesRepository.delete(calificacion);
	}

	@Override
	public CalificacionResponseDto obtenerCalificacionesAlumno(Long idTUsuarios) {
		List<TCalificacione> calificaciones =  calificacionesRepository.findByIdTUsuarios(idTUsuarios);
		List<CalificacionesDto> calificacionesDto = new ArrayList<CalificacionesDto>();
		CalificacionResponseDto calResp = new CalificacionResponseDto();
		
		int count=0;
		BigDecimal suma = new BigDecimal(0);
		
		for (TCalificacione cal : calificaciones) {
			
			suma = suma.add(cal.getCalificacion());
			count++;
			
			CalificacionesDto resp = new CalificacionesDto();
			
			resp.setId_t_usuario(cal.getIdTUsuarios());
			resp.setNombre(cal.getTAlumno().getNombre());
			resp.setApellido(cal.getTAlumno().getApPaterno());
			resp.setMateria(cal.getIdTMaterias());
			resp.setFecha_registro(cal.getFechaRegistro());
			resp.setCalificacion(cal.getCalificacion());
			calificacionesDto.add(resp);
			
		}
			
		calResp.setCalificaciones(calificacionesDto);
		calResp.setPromedio(suma.divide(new BigDecimal(count),RoundingMode.FLOOR));
		
		return calResp;
	}

}
