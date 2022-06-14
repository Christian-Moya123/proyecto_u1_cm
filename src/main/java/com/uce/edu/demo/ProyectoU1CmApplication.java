package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;
import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.reposity.IInventarioRepository;
import com.uce.edu.demo.santamaria.service.IInventarioService;
import com.uce.edu.demo.santamaria.service.IProductoService;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
	
		BigDecimal interes =  this.bancaria.calcularInteres("1234");
		System.out.println(interes);
		
	
	}

}
