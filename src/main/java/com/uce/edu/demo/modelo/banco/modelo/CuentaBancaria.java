package com.uce.edu.demo.modelo.banco.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {
	public String numero;
	private BigDecimal saldo;
	
	//SET GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	
	
}