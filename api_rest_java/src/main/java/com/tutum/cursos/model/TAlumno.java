package com.tutum.cursos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_alumnos database table.
 * 
 */
@Entity
@Table(name="t_alumnos", schema="cursos")
public class TAlumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_ALUMNOS_IDTUSUARIOS_GENERATOR", sequenceName="cursos.t_alumnos_id_t_usuarios_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ALUMNOS_IDTUSUARIOS_GENERATOR")
	@Column(name="id_t_usuarios")
	private Long idTUsuarios;

	private Integer activo;

	@Column(name="ap_materno")
	private String apMaterno;

	@Column(name="ap_paterno")
	private String apPaterno;

	private String nombre;

	public TAlumno() {
	}

	public Long getIdTUsuarios() {
		return this.idTUsuarios;
	}

	public void setIdTUsuarios(Long idTUsuarios) {
		this.idTUsuarios = idTUsuarios;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getApMaterno() {
		return this.apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getApPaterno() {
		return this.apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}