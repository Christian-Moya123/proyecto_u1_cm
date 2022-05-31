package com.uce.edu.demo.tarea;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Editorial {

	private String nombre;
	private LocalDateTime fechaPublicacion;
	
	//GET y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", fechaPublicacion=" + fechaPublicacion + "]";
	}
	
	
	
	
}
