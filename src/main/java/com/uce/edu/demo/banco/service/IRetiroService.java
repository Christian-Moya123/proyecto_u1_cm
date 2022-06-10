package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.banco.modelo.Deposito;
import com.uce.edu.demo.modelo.banco.modelo.Retiro;

public interface IRetiroService {
	
	public void realizarRetiro(String numeroCta, BigDecimal monto);
	public void actualizarRetiro(String numeroCta, BigDecimal monto);
	public Retiro buscarRetiro(String numeroCuenta);
	public void borrarRetiro(String numeroCuenta);
}
