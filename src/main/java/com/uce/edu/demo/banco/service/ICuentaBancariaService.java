package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	public void actualizar(CuentaBancaria c);
	public CuentaBancaria buscar(String numero);
	public void ingresarCuentaBancaria(CuentaBancaria c);
	public void borrarCuentaBancaria(String numero);
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo);
}
