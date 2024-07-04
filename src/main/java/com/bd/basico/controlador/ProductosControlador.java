package com.bd.basico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.basico.modelo.TBL_PRODUCTOCL3;
import com.bd.basico.servicio.IProductoServicio;



@Controller
@RequestMapping("/vistas")

public class productosControlador {
	
	//inyeccion de dependencia...

			@Autowired

			private IProductoServicio iproductoservicio;

			//creamos el metodo listado..

			@GetMapping("/ListadoProductos")

			public String ListadoProductos(Model modelo) {

				//recuperamos el listado de autos..

				List<TBL_PRODUCTOCL3> listado=iproductoservicio.ListadoProductos();

				for(TBL_PRODUCTOCL3 lis:listado) {

			System.out.println("CODIGO "+lis.getIDPRODUCTOCL3()+" "+
								" NOMBRE "+lis.getNOMBRECL3()+" "+
								" PRECIO VENTA "+lis.getPRECIOVENTACL3()+" "+
								" STOCK "+lis.getSTOCK()+" "+
								" PRECIO COMPRA "+lis.getPRECIOCOMPCL3()+" "+
								" ESTADO "+lis.getESTADOCL3()+" "+
								" DESCRIPCION "+lis.getDESCRIPCL3()
								);

				}

				//enviamos la data hacia la vista..

				modelo.addAttribute("listado",listado);

				//retornamos

				return "/vistas/ListadoProductos";

				

			}  //fin del metodo listado...
			
			
			//creamos los respectivos para metodos para registrar...

			@GetMapping("/RegistrarProducto")

			public String RegistrarProducto(Model modelo) {

				//realizamos la respectiva instancia...

				TBL_PRODUCTOCL3 producto=new TBL_PRODUCTOCL3();

				//enviamos a la vista...

				modelo.addAttribute("regproducto",producto);

				//retornamos

				return "/vistas/RegistrarProducto";

			}  //fin del metodo registrar.
			
			
			
			//realizamos el mapeo con postmapping

			@PostMapping("/GuardarProducto")

			public String GuardarProducto(@ModelAttribute TBL_PRODUCTOCL3  producto,Model modelo) {

				iproductoservicio.RegistrarProducto(producto);

				System.out.println("Producto registrado en la base de datos");

				//retornamos al listado...

				return "redirect:/vistas/ListadoProductos";

			}  //fin del metodo string...
			
			//*****************crearmos el metodo editar...

			@GetMapping("/editar/{id}")

			public String Editar(@PathVariable("id") Integer IDPRODUCTOCL3,Model modelo) {

				TBL_PRODUCTOCL3 producto=iproductoservicio.BuscarporId(IDPRODUCTOCL3);

				//enviamos hacia la vista...

				modelo.addAttribute("regproducto",producto);

				//retornamos el frmcrearcliente...

				return "/vistas/RegistrarProducto";


			}  //fin del metodo editar...
			
			@GetMapping("/eliminar/{id}")
		    public String eliminar(@PathVariable("id") Integer idProducto, Model modelo) {
		        iproductoservicio.Eliminar(idProducto);
		        return "redirect:/vistas/ListadoProductos";
		    }
	
	
	}//fin del metodo 
	
