package com.uce.edu.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl  implements ICuentaBancariaService{
	@Autowired
	ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}

}
