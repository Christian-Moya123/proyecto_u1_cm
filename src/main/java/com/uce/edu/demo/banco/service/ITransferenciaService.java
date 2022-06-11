package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Retiro;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTranferencia(String ctaOrigen, String ctaDestino, BigDecimal monto ); 
	public void actualizar(String ctaOrigen, String ctaDestino, BigDecimal monto);
	public Transferencia buscar(String numero);
	public void borrarTransferencia(String numero);
	
	public List<Transferencia> consultar(String cuentaa, LocalDateTime fechaInico, LocalDateTime fechaFin);
}
