package br.com.leonndas.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.leonndas.baozistore.model.Cliente;

//<TipoDaEntidade, TipoDoID> 
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
