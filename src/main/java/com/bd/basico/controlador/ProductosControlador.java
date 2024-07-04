package com.bd.basico.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosControlador {
	//Metodo
	@GetMapping("/producto")
	public String producto() {
		
		
		//retornamos haci la vista
		return "producto";
	}//fin del metodo

}//fin de la clase
