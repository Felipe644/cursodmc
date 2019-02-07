package com.felipe.ramos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.ramos.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
	

}
