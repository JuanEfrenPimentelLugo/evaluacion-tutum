package com.tutum.cursos.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * The persistent class for the t_calificaciones database table.
 * 
 */
@Entity
@Table(name="t_calificaciones", schema="cursos")
public class TCalificacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_CALIFICACIONES_IDTCALIFICACIONES_GENERATOR", sequenceName="cursos.t_calificaciones_id_t_calificaciones_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_CALIFICACIONES_IDTCALIFICACIONES_GENERATOR")
	@Column(name="id_t_calificaciones")
	private Long idTCalificaciones;

	private BigDecimal calificacion;

	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	@Column(name="fecha_registro")
	private LocalDate fechaRegistro;

	@Column(name="id_t_usuarios")
	private Long idTUsuarios;

	@Column(name="id_t_materias")
	private Long idTMaterias;
	
	//bi-directional many-to-one association to TAlumno
	@ManyToOne
	@JoinColumn(name="id_t_usuarios",insertable = false, updatable = false)
	private TAlumno TAlumno;

	//bi-directional many-to-one association to TMateria
	@ManyToOne
	@JoinColumn(name="id_t_materias",insertable = false, updatable = false)
	private TMateria TMateria;

	public TCalificacione() {
	}

	public Long getIdTCalificaciones() {
		return this.idTCalificaciones;
	}

	public void setIdTCalificaciones(Long idTCalificaciones) {
		this.idTCalificaciones = idTCalificaciones;
	}

	public BigDecimal getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(BigDecimal calificacion) {
		this.calificacion = calificacion;
	}

	public LocalDate getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Long getIdTUsuarios() {
		return idTUsuarios;
	}

	public void setIdTUsuarios(Long idTUsuarios) {
		this.idTUsuarios = idTUsuarios;
	}

	public Long getIdTMaterias() {
		return idTMaterias;
	}

	public void setIdTMaterias(Long idTMaterias) {
		this.idTMaterias = idTMaterias;
	}
	

	public TAlumno getTAlumno() {
		return this.TAlumno;
	}

	public void setTAlumno(TAlumno TAlumno) {
		this.TAlumno = TAlumno;
	}

	public TMateria getTMateria() {
		return this.TMateria;
	}

	public void setTMateria(TMateria TMateria) {
		this.TMateria = TMateria;
	}


}