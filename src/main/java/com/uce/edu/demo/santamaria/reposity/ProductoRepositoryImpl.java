package com.uce.edu.demo.santamaria.reposity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.service.IInventarioService;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void actualizarProductos(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("productos actualizados" + p);
	}

	@Override
	public Producto buscarProducto(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca el producto:" + numero);
		Producto pro =  new Producto();
		pro.setNumero(numero);
		pro.setPrecioProducto(new BigDecimal(100));
		return pro;
	}

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el producto:" + p);
		
		
	}

	@Override
	public void eliminarProductos(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el producto:" + numero);
	}
	
	

}
