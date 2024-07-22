package com.generation.farmaciavitalidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmaciavitalidade.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	

}
