package com.uce.edu.demo.santamaria.reposity;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println(" inventario actualizado: " + i);
	}

	@Override
	public Inventario buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println(" se busca el inventario:" + numero);
		System.out.println("se busca el producto:" + numero);
		Inventario inv =  new Inventario();
		inv.setNumero(numero);
		return inv;
	}

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println(" se ha insertado en la base el inventario:" + i);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println(" se a eliminado de la abse el inventario" + numero);
	}

}
