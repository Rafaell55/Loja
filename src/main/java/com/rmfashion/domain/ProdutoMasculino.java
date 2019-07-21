package com.rmfashion.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ProdutoMasculino implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cor;
	private String tamanho;
	private Double preco;
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA_MASCULINO",
		joinColumns = @JoinColumn(name = "produto_masculino_id"),
		inverseJoinColumns = @JoinColumn(name = "categoria_masculino_id")
	)
	private List<CategoriaMasculino> categoriasMasc = new ArrayList<>();
	
	public ProdutoMasculino() {		
	}

	public ProdutoMasculino(Integer id, String nome, String cor, String tamanho, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<CategoriaMasculino> getCategoriasMasc() {
		return categoriasMasc;
	}

	public void setCategoriasMasc(List<CategoriaMasculino> categoriasMasc) {
		this.categoriasMasc = categoriasMasc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoMasculino other = (ProdutoMasculino) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
