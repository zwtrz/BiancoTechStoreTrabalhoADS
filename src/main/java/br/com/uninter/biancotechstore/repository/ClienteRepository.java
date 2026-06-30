package br.com.uninter.biancotechstore.repository;

import br.com.uninter.biancotechstore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
