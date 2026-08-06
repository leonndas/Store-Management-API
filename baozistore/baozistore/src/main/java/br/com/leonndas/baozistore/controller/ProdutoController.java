package br.com.leonndas.baozistore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leonndas.baozistore.model.Produto;
import br.com.leonndas.baozistore.service.ProdutoService;

@RestController
@RequestMapping ("/produtos")
public class ProdutoController {//injetar service
	private final ProdutoService produtoService;
	
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}	
	
@PostMapping //salvar
	public Produto salvar(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}	
		
@GetMapping //listar todos
	public List<Produto> buscarTodos() {
		return produtoService.buscarTodos();
	}

@GetMapping ("/{id}") //buscar por id
	public Produto buscarId(@PathVariable Long id) {
		return produtoService.buscarId(id);
	}

@DeleteMapping("/{id}") 
	public void deletar(@PathVariable Long id) {
		produtoService.apagar(id);
}


}
