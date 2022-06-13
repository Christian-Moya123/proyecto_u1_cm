package com.uce.edu.demo.santamaria.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	private String nombreProducto;
	private BigDecimal precioProducto;
	private String numero;
	private int cantidad;
	private LocalDateTime fecha;
	
	@Override
	public String toString() {
		return " - " + nombreProducto + ", " + cantidad + " - "+ precioProducto +" - " + fecha + " \n";
	}
	
	//GET SET
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public BigDecimal getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(BigDecimal precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
}
