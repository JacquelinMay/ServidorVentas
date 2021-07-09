package com.init.pea.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.pea.interfacesservices.ICliente;
import com.init.pea.interfacesservices.IDocVenta;
import com.init.pea.interfacesservices.IPedidoInterno;
import com.init.pea.modelo.Cliente;
import com.init.pea.modelo.Docventa;
import com.init.pea.modelo.PedidoInterno;


@RestController
@RequestMapping("/ventas")
public class ventaRest {


	@Autowired
	private ICliente cliService;
	
	@Autowired
	private IDocVenta docVenService;
	
	@Autowired
	private IPedidoInterno pedidoService;
	
	/*---CLIENTE---*/
	
	@PostMapping("/guardarCliente")
	public void guardarProveedor(@RequestBody Cliente cli) {
		int estado = cliService.Guardar(cli);
	}
	
	@PutMapping("/actualizarCliente")
	public void actualizarProveedor(@RequestBody Cliente cli) {
		int estado = cliService.Actualizar(cli);
	}
	
	@GetMapping("/listarCliente")
	public List<Cliente> listarCliente() {
		return cliService.ListarTodo();
	}
	
	
	
/*---DocVenta---*/
	
	@PostMapping("/guardarDocVenta")
	public void guardarDocVenta(@RequestBody Docventa docV) {
		int estado = docVenService.Guardar(docV);
	}
	
	@PutMapping("/actualizarDocVenta")
	public void actualizarDocVenta(@RequestBody Docventa docV) {
		int estado = docVenService.Actualizar(docV);
	}
	
	@GetMapping("/listarDocVenta")
	public List<Docventa> listarDocVenta() {
		return docVenService.ListarTodo();
	}
	
	
/*---PedidoInterno---*/
	
	@PostMapping("/guardarPedidoIn")
	public void guardarDocVenta(@RequestBody PedidoInterno pedidoInt) {
		int estado = pedidoService.Guardar(pedidoInt);
	}
	
	@PutMapping("/actualizarPedidoIn")
	public void actualizarDocVenta(@RequestBody PedidoInterno pedidoInt) {
		int estado = pedidoService.Actualizar(pedidoInt);
	}
	
	@GetMapping("/listarPedidoIn")
	public List<PedidoInterno> listarPedidoIn() {
		return pedidoService.ListarTodo();
	}
}
