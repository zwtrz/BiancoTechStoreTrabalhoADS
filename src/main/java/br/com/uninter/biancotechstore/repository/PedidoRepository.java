package br.com.uninter.biancotechstore.repository;

import br.com.uninter.biancotechstore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
