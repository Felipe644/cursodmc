package com.felipe.ramos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.ramos.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
	

}
