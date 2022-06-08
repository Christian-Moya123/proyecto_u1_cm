package com.uce.edu.demo.banco.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoReposity{
	
	@Override
	public void insertar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se creo el deposito " + d);
	}

}
