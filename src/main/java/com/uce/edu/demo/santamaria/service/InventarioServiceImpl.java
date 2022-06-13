package com.uce.edu.demo.santamaria.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.reposity.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{
	

	private Inventario inventario = new Inventario();
	
	
	
	@Autowired
	private IInventarioRepository iinventarioRepository;
	
	
	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.iinventarioRepository.actualizar(i);
	}

	@Override
	public Inventario buscar(String numero) {
		// TODO Auto-generated method stub
		return this.iinventarioRepository.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.eliminar(numero);
	}

	@Override
	public void insertar(List<Producto> producto, String numero, LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		
		inventario.setFechaIngreso(fechaIngreso);
		inventario.setNumero(numero);
		inventario.setProducto(producto);
		//this.iinventarioRepository.insertar(inventario);
	}
	
	public void imprimirInventario() {
		System.out.println(this.inventario.toString());
	}
	
	
	
}
