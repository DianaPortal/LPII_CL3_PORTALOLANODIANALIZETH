package com.bd.basico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bd.basico.modelo.TBL_PRODUCTOCL3;
import com.bd.basico.repositorio.IProductoRepositorio;

public class ClassProductoImp implements IProductoServicio{
	//aplicamos la inyeccion de dependencia 
	@Autowired
	private IProductoRepositorio iproductorepository;

	@Override
	public List<TBL_PRODUCTOCL3> ListadoProductos() {
		// Devuelve Listado de Productos 
		return (List<TBL_PRODUCTOCL3>)iproductorepository.findAll();
	}

	@Override
	public void RegistrarProducto(TBL_PRODUCTOCL3 producto) {
		// Registra Productos
		iproductorepository.save(producto);
		
	}

	@Override
	public TBL_PRODUCTOCL3 BuscarporId(Integer id) {
		// Buscar por cod
		return iproductorepository.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(Integer id) {
		// Elimina por Cod
		iproductorepository.deleteById(id);	
		
	}
	

} //fin de la clase
