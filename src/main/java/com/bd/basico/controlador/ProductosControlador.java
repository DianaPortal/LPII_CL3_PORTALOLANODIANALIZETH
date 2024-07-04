package com.bd.basico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bd.basico.modelo.TBL_PRODUCTOCL3;
import com.bd.basico.servicio.IProductoServicio;



@Controller
public class productosControlador {
	
	//inyeccion de dependencia...

			@Autowired

			private IProductoServicio iproductoservicio;

			//creamos el metodo listado..

			@GetMapping("ListadoProductos")

			public String ListadoAuto(Model modelo) {

				//recuperamos el listado de autos..

				List<TBL_PRODUCTOCL3> listado=iproductoservicio.ListadoProductos();

				for(TBL_PRODUCTOCL3 lis:listado) {

			System.out.println("CODIGO "+lis.getIDPRODUCTOCL3()+" "+
								" NOMBRE "+lis.getNOMBRECL3()+" "+
								" PRECIO VENTA "+lis.getPRECIOVENTACL3()+" "+
								" STOCK "+lis.getSTOCK()+" "+
								" PRECIO COMPRA "+lis.getPRECIOCOMPCL3()+" "+
								" ESTADO "+lis.getDESCRIPCL3());

				}

				//enviamos la data hacia la vista..

				modelo.addAttribute("listado",listado);

				//retornamos

				return "/Vistas/ListadoAuto";

				

			}  //fin del metodo listado...
			
			
			//creamos los respectivos para metodos para registrar...

			@GetMapping("/RegistrarProducto")

			public String RegistrarProducto(Model modelo) {

				//realizamos la respectiva instancia...

				TBL_PRODUCTOCL3 producto=new TBL_PRODUCTOCL3();

				//enviamos a la vista...

				modelo.addAttribute("regproducto",producto);

				//retornamos

				return "/Vistas/FrmCrearProducto";
			}  //fin del metodo registrar.
			
			
			
			//realizamos el mapeo con postmapping

			@PostMapping("/GuardarProducto")

			public String GuardarAuto(@ModelAttribute TBL_PRODUCTOCL3  producto,Model modelo) {

				iproductoservicio.RegistrarProducto(producto);

				System.out.println("Producto registrado en la base de datos");

				//retornamos al listado...

				return "redirect:/Vistas/ListadoProductos";	

			}  //fin del metodo string...
			
			//*****************crearmos el metodo editar...

			@GetMapping("/editar/{id}")

			public String Editar(@PathVariable("id") Integer IDPRODUCTOCL3,Model modelo) {

				TBL_PRODUCTOCL3 producto=iproductoservicio.BuscarporId(IDPRODUCTOCL3);

				//enviamos hacia la vista...

				modelo.addAttribute("regproducto",producto);

				//retornamos el frmcrearcliente...

				return "/Vistas/FrmCrearProducto";	

			}  //fin del metodo editar...
		 
			public String eliminar(@PathVariable("id") Integer idProducto,Model modelo) {

				

				//aplicamos inyeccion de dependencia...

				iproductoservicio.Eliminar(idProducto);

				//actulizar el listado

				List<TBL_PRODUCTOCL3> listado=iproductoservicio.ListadoProductos();

				//enviamos a la vista

				modelo.addAttribute("listado",listado);

				//redireccionamos

				return "redirect:/Vistas/ListadoProductos";		

			}   //fin del metodo eliminar...

	
	
	}//fin del metodo 
	
