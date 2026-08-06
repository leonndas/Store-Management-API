package br.com.leonndas.baozistore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.leonndas.baozistore.model.Pedido;
import br.com.leonndas.baozistore.repository.PedidoRepository;

@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;
	//injetar 
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
public Pedido salvar(Pedido pedido) {
	return pedidoRepository.save(pedido);
	}
 
public List<Pedido> listarTodos (){
	return pedidoRepository.findAll();
	}

public Pedido buscarId(@PathVariable Long id) {
	return pedidoRepository.findById(id).orElse(null);
	}

public void apagar(Long id) {
	pedidoRepository.deleteById(id);
	}
}
