package com.propia.ejemplo_tomee.ejb;

import javax.ejb.Remote;

@Remote
public interface ArticulosMgr {
	
	public String getByRef(String ref);

}