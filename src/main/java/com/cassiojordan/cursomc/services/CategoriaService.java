package com.cassiojordan.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassiojordan.cursomc.domain.Categoria;
import com.cassiojordan.cursomc.repositories.CategoriaRepository;
import com.cassiojordan.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> find(Integer id){
		Optional<Categoria> obj = repo.findById(id);
		if( obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}

}
