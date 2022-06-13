package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestorInventarioImpl implements IGestorInventarioService{

	
	public BigDecimal calcularPrecio(BigDecimal pc) {
		 
		BigDecimal g =  pc.multiply(new BigDecimal(0.10));
		BigDecimal iva = pc.multiply(new BigDecimal(0.12));
		BigDecimal pv = pc.add(g).add(iva).setScale(2,RoundingMode.UP);
		return pv;
		
	}

}
