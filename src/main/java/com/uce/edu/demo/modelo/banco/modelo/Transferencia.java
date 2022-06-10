package com.uce.edu.demo.modelo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {
	private String numeroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;
	private String numero;
	
	@Override
	public String toString() {
		return "Transferencia [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", montoTransferir=" + montoTransferir + ", fechaTransferencia="
				+ fechaTransferencia + ", numero=" + numero + "]";
	}
	
	//SET GET
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}
	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	
	
	
	
	
}
