package com.tutum.cursos.dto;

import java.math.BigDecimal;
import java.util.List;

public class CalificacionResponseDto {

	private List<CalificacionesDto> calificaciones;
	private BigDecimal promedio;
	
	public List<CalificacionesDto> getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(List<CalificacionesDto> calificaciones) {
		this.calificaciones = calificaciones;
	}
	public BigDecimal getPromedio() {
		return promedio;
	}
	public void setPromedio(BigDecimal promedio) {
		this.promedio = promedio;
	}
	
}
