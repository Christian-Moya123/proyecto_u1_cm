package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.reposity.IProductoRepository;



@Service
public class ProductoServiceImpl implements IProductoService{
	
	List<Producto> listaProducto = new ArrayList<Producto>();

	@Autowired
	private IProductoRepository  iproductoRepository;
	
	@Autowired
	private IInventarioService  iInventarioService;
	
	
	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.iproductoRepository.actualizarProductos(p);
	}

	@Override
	public Producto buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.iproductoRepository.buscarProducto(null);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.iproductoRepository.eliminarProductos(numero);
	}

	@Override
	public void insertar(String nombre, int cantidad, BigDecimal valor, LocalDateTime fechaIngreso, String numero) {
		
		GestorInventarioImpl gestor = new GestorInventarioImpl();
		
		Producto pro1 = new Producto();
		pro1.setNombreProducto(nombre);
		pro1.setCantidad(cantidad);
		pro1.setFecha(fechaIngreso);
		pro1.setPrecioProducto(gestor.calcularPrecio(valor));
		pro1.setNumero(numero);
		this.iproductoRepository.insertarProducto(pro1);
		listaProducto.add(pro1);
		
	}
	
	public void ingresarInventario(String numero, LocalDateTime fecha) {
		this.iInventarioService.insertar(listaProducto, numero, fecha);
	}

	public void consultar(LocalDateTime fecha) {
		
		List<Producto> listaConsultaF = new ArrayList<Producto>();
				
		for(Producto pro: this.listaProducto) {
			if(pro.getFecha().isAfter(fecha)) {
				listaConsultaF.add(pro);
				
			}
		}
		
		this.iInventarioService.insertar(listaConsultaF, null, fecha);
	}

}
