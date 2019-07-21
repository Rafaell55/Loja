package com.rmfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmfashion.domain.CategoriaFeminino;

@Repository
public interface CategoriaFemininoRepository extends JpaRepository<CategoriaFeminino, Integer>{
	
	

}
