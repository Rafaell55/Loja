package com.rmfashion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmfashion.domain.CategoriaFeminino;
import com.rmfashion.repositories.CategoriaFemininoRepository;
import com.rmfashion.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaFemininoService {
	
	@Autowired
	private CategoriaFemininoRepository repo;
	
	public CategoriaFeminino buscar(Integer id) {
		Optional<CategoriaFeminino> obj = repo.findById(id);	
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + CategoriaFeminino.class.getName()));
		
	}

}
