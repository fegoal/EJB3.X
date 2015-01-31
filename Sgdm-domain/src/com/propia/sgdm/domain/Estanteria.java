package com.propia.sgdm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="estanterias")
public class Estanteria implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	@OneToMany(mappedBy="estanteria")
	private List<Articulo> articulos;
	private String fecAlta;
	private String fecModif;
	
	public Estanteria() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public String getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(String fecAlta) {
		this.fecAlta = fecAlta;
	}

	public String getFecModif() {
		return fecModif;
	}

	public void setFecModif(String fecModif) {
		this.fecModif = fecModif;
	}


}
