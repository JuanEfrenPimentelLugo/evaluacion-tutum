package com.tutum.cursos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalificacionesDto {
	
	private Long id_t_usuario;
	private String nombre;
	private String apellido;
	private Long materia;
	private BigDecimal calificacion;
	private LocalDate fecha_registro;
	
	
	public Long getId_t_usuario() {
		return id_t_usuario;
	}
	public void setId_t_usuario(Long id_t_usuario) {
		this.id_t_usuario = id_t_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getMateria() {
		return materia;
	}
	public void setMateria(Long materia) {
		this.materia = materia;
	}
	public BigDecimal getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(BigDecimal calificacion) {
		this.calificacion = calificacion;
	}
	public LocalDate getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(LocalDate localDate) {
		this.fecha_registro = localDate;
	}

}
