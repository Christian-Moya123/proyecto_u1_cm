package com.uce.edu.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
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
		System.out.println("");
		
		//////////////////////////////////////////////////////MATERIA
		Materia mat1 = new Materia();
		mat1.setNombre("Programacion");
		mat1.setSemestre("6");
		this.materiaService.ingresarMateria(mat1);
		
		Materia mat2 = new Materia();
		mat2.setNombre("Estadistica");
		mat2.setSemestre("quinto");
		this.materiaService.ingresarMateria(mat2);
		
		mat1.setSemestre("9");
		this.materiaService.actualizarMaateria(mat2);
		this.materiaService.buscarPorMateria("Programacion");
		this.materiaService.borrarMateria("Programacion");
		System.out.println("");
		
		///////////////////////////////////////////////////MATRICULA
		List<Materia> materia1;
		materia1 = new ArrayList<>();
		materia1.add(mat1);
		materia1.add(mat2);
		
		List<Materia> materia2;
		materia2 = new ArrayList<>();
		materia2.add(mat2);
			
		Matricula matri1 = new Matricula();
		matri1.setEstudiante(e);
		matri1.setMateria(materia1);
		matri1.setNumero("111");
		this.matriculaService.ingresarMatricula(matri1);
	
		Matricula matri2 = new Matricula();
		matri2.setEstudiante(e1);
		matri2.setMateria(materia2);
		matri2.setNumero("222");
		
		matri1.setEstudiante(e1);
		this.matriculaService.actualizarMatricula(matri2);
		this.matriculaService.buscarPorMatricula("111");
		this.matriculaService.borrarMatricula("111");
		System.out.println("");
	}

}
