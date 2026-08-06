package br.com.leonndas.baozistore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import br.com.leonndas.baozistore.model.Produto;
import br.com.leonndas.baozistore.repository.ProdutoRepository;

@Service
public class ProdutoService { 
	private final ProdutoRepository produtoRepository;
	
	//injetar dependência
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

		public Produto salvar (Produto produto) {
			return produtoRepository.save(produto);
	}

		public List<Produto> buscarTodos() {
			return produtoRepository.findAll();
		}

		public Produto buscarId (Long id) {
			return produtoRepository.findById(id).orElse(null);
		}
		
		public void apagar (Long id) {
			produtoRepository.deleteById(id);
		}
		
		
}