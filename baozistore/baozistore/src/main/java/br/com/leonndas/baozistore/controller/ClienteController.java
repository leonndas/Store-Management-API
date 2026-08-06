package br.com.leonndas.baozistore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.leonndas.baozistore.model.Cliente;
import br.com.leonndas.baozistore.service.ClienteService;

@RestController
@RequestMapping("/clientes") //organizar
public class ClienteController {
	private final ClienteService clienteService;
	
public ClienteController(ClienteService clienteService) {this.clienteService = clienteService;
	}

@PostMapping
public Cliente salvar (@RequestBody Cliente cliente) {
	return clienteService.salvar(cliente);
	}

@GetMapping
public List<Cliente> buscarTodos() {
	return clienteService.buscarTodos();
}

@GetMapping("/{id}")
public Cliente buscarId (@PathVariable Long id) {
	return clienteService.buscarId(id); 
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
	clienteService.deletar(id);
}

}

