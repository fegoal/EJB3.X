package com.propia.sgdm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iva")
public class Iva implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String imposition;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Iva(){
		
	}

	public String getImposition() {
		return imposition;
	}

	public void setImposition(String imposition) {
		this.imposition = imposition;
	}
	


}
