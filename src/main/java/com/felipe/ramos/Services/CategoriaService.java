package com.felipe.ramos.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.ramos.Repository.CategoriaRepository;
import com.felipe.ramos.Services.exception.ObjectNotFoundException;
import com.felipe.ramos.domain.Categoria;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj= repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: "+id+", Tipo: "+Categoria.class.getName());
		}
		return obj.orElse(null);

		
	}

}
