package com.rmfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmfashion.domain.ProdutoMasculino;

@Repository
public interface ProdutoMasculinoRepository extends JpaRepository<ProdutoMasculino, Integer>{
	
	

}
