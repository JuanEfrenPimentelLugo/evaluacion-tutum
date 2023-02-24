package com.tutum.cursos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_materias database table.
 * 
 */
@Entity
@Table(name="t_materias", schema="cursos")
public class TMateria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_MATERIAS_IDTMATERIAS_GENERATOR", sequenceName="cursos.t_materias_id_t_materias_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_MATERIAS_IDTMATERIAS_GENERATOR")
	@Column(name="id_t_materias")
	private Long idTMaterias;

	private Integer activo;

	private String nombre;

	public TMateria() {
	}

	public Long getIdTMaterias() {
		return this.idTMaterias;
	}

	public void setIdTMaterias(Long idTMaterias) {
		this.idTMaterias = idTMaterias;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}