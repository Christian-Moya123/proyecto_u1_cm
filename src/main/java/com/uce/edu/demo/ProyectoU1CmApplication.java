package com.uce.edu.demo;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private ITransferenciaService iTranferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		//iTranferenciaService.realizarTranferencia("12", "13", new BigDecimal(20));
		System.out.println("");
		this.depositoService.realizarDeposito("14", new BigDecimal(50));
	}

}
