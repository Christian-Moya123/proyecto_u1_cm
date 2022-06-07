package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.tarea.Administracion;
import com.uce.edu.demo.tarea.Administracion2;
import com.uce.edu.demo.tarea.Administracion3;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e = new Estudiante();
		e.setNombre("Christian");
		e.setApellido("Moya");
		e.setCedula("1720466488");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Alex");
		e1.setApellido("Charro");
		e1.setCedula("1231230466488");
		this.estudianteService.ingresarEstudiante(e1);
		
		
		//usar los 3 metodos restantes
		e.setCedula("123123124555555");
		this.estudianteService.actualizarEstudiante(e1);
		
		this.estudianteService.buscarPorApellido("Moya");
		
		this.estudianteService.borrarEstdiante("1720466488");
	}

}
