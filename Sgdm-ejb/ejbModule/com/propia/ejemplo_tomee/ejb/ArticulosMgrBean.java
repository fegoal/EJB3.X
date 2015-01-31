package com.propia.ejemplo_tomee.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.propia.sgdm.domain.Articulo;

@Stateless
@LocalBean
public class ArticulosMgrBean implements ArticulosMgr {

    /**
     * Default constructor. 
     */
    public ArticulosMgrBean() {
        // TODO Auto-generated constructor stub
    }
    
    
    public String getByRef(String ref){
    	
    	Articulo art = new Articulo();
    	art.setAnio("2010");
    	art.setConcepto("Concepto");
    	art.setRef("11111");
    	EntityManager em = Persistence.createEntityManagerFactory("sgdm-persistence").createEntityManager();
    	em.getTransaction().begin();
    	em.persist(art);
    	em.getTransaction().commit();
    	//Declaramos una TypedQuery 
    	//TypedQuery<Articulo> getByRef = em.createNamedQuery("getByRef", Articulo.class);
    	//getByRef.setParameter("ref", "1");
    	//List<Articulo> lstArticulos  = getByRef.getResultList();
    	System.out.println("Año del articulo=" + art.getAnio());
    	System.out.println("Write hola desde la rama AddTrans");
    	//return lstArticulos;
    	return "hola";
    }

}
