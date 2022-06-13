package com.uce.edu.demo.santamaria.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {
	private LocalDateTime fechaIngreso;
	private String numero;
	private List<Producto> producto;
	
	@Override
	public String toString() {
		return "Inventario [fechaIngreso=" + fechaIngreso   + ", producto=" + "\n"+ producto + "]";
	}
	
	//GET SET
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	

}
