package com.felipe.ramos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.ramos.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
	

}
