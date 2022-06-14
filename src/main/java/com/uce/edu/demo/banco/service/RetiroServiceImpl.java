package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.repository.IDepositoReposity;
import com.uce.edu.demo.banco.repository.IRetiroReposity;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;
import com.uce.edu.demo.modelo.banco.modelo.Retiro;

@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroReposity retiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.subtract(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Retiro retiro = new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCta);
		retiro.setMonto(monto);
		this.retiroRepository.insertar(retiro);
		
	}
	@Override
	public void actualizarRetiro(String numeroCta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.subtract(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Retiro retiro = new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCta);
		retiro.setMonto(monto);
		this.retiroRepository.insertar(retiro);
	}
	@Override
	public Retiro buscarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		
		return this.retiroRepository.buscar(numeroCuenta);
	}
	@Override
	public void borrarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCuenta);
	}

}
