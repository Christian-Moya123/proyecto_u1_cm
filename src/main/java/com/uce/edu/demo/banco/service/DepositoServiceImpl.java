package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.repository.IDepositoReposity;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;

@Service
public class DepositoServiceImpl implements IDepositoService{
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IDepositoReposity depositoRepository;

	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Deposito depositivo = new Deposito();
		depositivo.setFecha(LocalDateTime.now());
		depositivo.setNumeroCuentaDestino(numeroCtaDestino);
		depositivo.setMonto(monto);
		this.depositoRepository.insertar(depositivo);
	}

	@Override
	public void actualizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Deposito depositivo = new Deposito();
		depositivo.setFecha(LocalDateTime.now());
		depositivo.setNumeroCuentaDestino(numeroCtaDestino);
		depositivo.setMonto(monto);
		this.depositoRepository.insertar(depositivo);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numeroCuentaDestino);
	}

	@Override
	public void borrarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(numeroCuentaDestino);
	}

}
