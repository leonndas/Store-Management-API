package br.com.leonndas.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.leonndas.baozistore.model.Produto;

//puxar JPA
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
