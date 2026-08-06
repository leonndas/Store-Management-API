package br.com.leonndas.baozistore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leonndas.baozistore.model.Pedido;
import br.com.leonndas.baozistore.service.PedidoService;

@RestController
@RequestMapping ("/pedidos")
public class PedidoController {//injetar
	private final PedidoService pedidoService;
	
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

@PostMapping //salvar
public Pedido salvar(@RequestBody Pedido pedido) {
	return pedidoService.salvar(pedido);
	}

@GetMapping //pegar todos
public List<Pedido> listarTodos() {
	return pedidoService.listarTodos();
	}

@GetMapping("/{id}")
public Pedido buscarId(@PathVariable Long id) {
	return pedidoService.buscarId(id);
	}

@DeleteMapping("/{id}")
public void apagar(@PathVariable Long id) {
	pedidoService.apagar(id);
	}

}