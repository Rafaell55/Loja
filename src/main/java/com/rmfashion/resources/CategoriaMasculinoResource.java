package com.rmfashion.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rmfashion.domain.CategoriaMasculino;
import com.rmfashion.services.CategoriaMasculinoService;

@RestController
@RequestMapping(value = "/categoria-masculino")
public class CategoriaMasculinoResource {
		
	@Autowired
	private CategoriaMasculinoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		CategoriaMasculino obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
	}

}
