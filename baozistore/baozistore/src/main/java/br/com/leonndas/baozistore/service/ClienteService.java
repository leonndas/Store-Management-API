package br.com.leonndas.baozistore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import br.com.leonndas.baozistore.model.Cliente;
import br.com.leonndas.baozistore.repository.ClienteRepository;

@Service //injeção de dependência por construtor
public class ClienteService {
	private final ClienteRepository clienteRepository;
	public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
	}
	
public Cliente salvar (Cliente cliente) {
	return clienteRepository.save(cliente);
	}

public List<Cliente> buscarTodos() {
	return clienteRepository.findAll();
}

public Cliente buscarId (Long id) {
	return clienteRepository.findById(id).orElse(null);
}

public void deletar (Long id) {
	clienteRepository.deleteById(id);
}

}