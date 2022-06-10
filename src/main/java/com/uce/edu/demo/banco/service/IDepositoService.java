package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.banco.modelo.Deposito;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;

public interface IDepositoService {
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	public void actualizarDeposito(String numeroCtaDestino, BigDecimal monto);
	public Deposito buscarDeposito(String numeroCuentaDestino);
	public void borrarDeposito(String numeroCuentaDestino);
	
}
