package com.propia.sgdm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="articulos")

@NamedQueries({
@NamedQuery(name="getByRef", query="select a from Articulo a where a.ref=:ref")
})

public class Articulo implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String ref;
	private String concepto;
	private String modelo;
	private String cc;
	private String anio;
	private String nota;
	private String nota2;
	private double pvp;
	private String anioDesde;
	private String anioHasta;
	private String fecAlta;
	private String fecModif;
	@ManyToOne
	private Estanteria estanteria;
	
	public Articulo(){
		
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getNota2() {
		return nota2;
	}

	public void setNota2(String nota2) {
		this.nota2 = nota2;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public String getAnioDesde() {
		return anioDesde;
	}

	public void setAnioDesde(String anioDesde) {
		this.anioDesde = anioDesde;
	}

	public String getAnioHasta() {
		return anioHasta;
	}

	public void setAnioHasta(String anioHasta) {
		this.anioHasta = anioHasta;
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

	public Estanteria getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(Estanteria estanteria) {
		this.estanteria = estanteria;
	}

	
	



}
