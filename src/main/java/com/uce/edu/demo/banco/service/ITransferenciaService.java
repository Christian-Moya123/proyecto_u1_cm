package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTranferencia(String ctaOrigen, String ctaDestino, BigDecimal monto ); 
}
