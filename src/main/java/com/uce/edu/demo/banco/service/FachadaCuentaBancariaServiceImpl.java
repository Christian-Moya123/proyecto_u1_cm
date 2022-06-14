package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	
	@Autowired
	@Qualifier("ahorrosfuturo")
	private ICuentaBancariaService bancariaServiceFuturo;

	@Autowired
	private ICuentaBancariaRepository bancaariaReposity;

	@Override
	public BigDecimal calcularInteres(String numeroCuenta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cta = this.bancaariaReposity.buscar(numeroCuenta);
		if (cta.getTipo().equals("A")) {

			// Ahorro
			interes = this.bancariaServiceA.calcularInteres(numeroCuenta, cta.getSaldo());
		} else if(cta.getTipo().equals("AF")){

			// Ahorros futuros
			interes = this.bancariaServiceFuturo.calcularInteres(numeroCuenta, cta.getSaldo());
		}else {
			//coriente
			interes = this.bancariaService.calcularInteres(numeroCuenta, cta.getSaldo());
		}

		return interes;
	}

}
