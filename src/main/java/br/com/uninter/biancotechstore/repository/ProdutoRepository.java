package br.com.uninter.biancotechstore.repository;

import br.com.uninter.biancotechstore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
