package com.uce.edu.demo.libreria.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class LibreriaPrivada {
	private  String numero;
	private String nombre;
	private int nLibros;
	
	@Override
	public String toString() {
		return "LibreriaPrivada [numero=" + numero + ", nombre=" + nombre + ", nLibros=" + nLibros + "]";
	}
	
	//GET SET 
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getnLibros() {
		return nLibros;
	}
	public void setnLibros(int nLibros) {
		this.nLibros = nLibros;
	}
	
	

}
