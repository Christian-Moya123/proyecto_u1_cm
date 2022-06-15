package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorrosfuturo")
public class AhorrosFuturoServiceImpl implements ICuentaBancariaService {

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ingresarCuentaBancaria(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCuentaBancaria(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		//Codigo duplicado se soluciona con una fachada
		//CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
		//BigDecimal saldo = null;
		BigDecimal interes =  new BigDecimal(360).multiply(new BigDecimal(20)).divide(new BigDecimal(100));
		interes = interes.add(saldo.divide(new BigDecimal(50)));
		return interes;
	}

}