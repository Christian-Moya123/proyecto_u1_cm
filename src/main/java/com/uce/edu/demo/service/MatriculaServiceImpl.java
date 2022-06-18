package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		System.out.println("rrrrrrrrrrrrr");
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM = new ProfesorMateria();
		profeM.setApellido("Tapia");
		profeM.setNombre("Jose");
		System.out.println("rrrrrrrrrrrrr");
		return profeM;
	}
	
	
	
	@Override
	public void ingresarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Q DI desde Service Singlenton " + this.profesorGeneral);
		System.out.println("Q DI desde Service Proptotipe" + this.profesorMateria);
		System.out.println("Q DI un metodo General: " + this.obtenerProfesorG());
		System.out.println("Q DI un metodo Materia: " + this.obtenerProfesorM());
		this.matriculaRepository.insertar(e);
	}

	@Override
	public Matricula buscarPorMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}

}
