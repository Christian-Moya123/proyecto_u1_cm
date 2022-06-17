package com.uce.edu.demo.libreria.modelo;

public class Registro {
	private String numero;
	private LibreriaPrivada lPrivada;
	private LibreriaPublica lPublica;
	
	@Override
	public String toString() {
		return "Registro [numero=" + numero + ", lPrivada=" + lPrivada + ", lPublica=" + lPublica + "]";
	}
	
	//GET SET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LibreriaPrivada getlPrivada() {
		return lPrivada;
	}
	public void setlPrivada(LibreriaPrivada lPrivada) {
		this.lPrivada = lPrivada;
	}
	public LibreriaPublica getlPublica() {
		return lPublica;
	}
	public void setlPublica(LibreriaPublica lPublica) {
		this.lPublica = lPublica;
	}
	
	
}
