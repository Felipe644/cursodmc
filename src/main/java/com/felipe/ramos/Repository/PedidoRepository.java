package com.felipe.ramos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.ramos.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
	

}
