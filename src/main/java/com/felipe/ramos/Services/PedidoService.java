package com.felipe.ramos.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.ramos.Repository.PedidoRepository;
import com.felipe.ramos.Services.exception.ObjectNotFoundException;
import com.felipe.ramos.domain.Pedido;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj= repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: "+id+", Tipo: "+Pedido.class.getName());
		}
		return obj.orElse(null);

		
	}

}
