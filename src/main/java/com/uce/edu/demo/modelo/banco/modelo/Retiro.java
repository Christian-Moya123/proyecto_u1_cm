package com.uce.edu.demo.modelo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	private LocalDateTime fecha;
	private String numeroCuenta;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Retiro [fecha=" + fecha + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + "]";
	}
	
	//GET y Set 
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	
}
