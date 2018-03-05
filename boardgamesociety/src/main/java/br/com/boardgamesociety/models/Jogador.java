package br.com.boardgamesociety.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Jogador {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
    	
	private Integer idade;
	
	@OneToMany
	private List<Telefone> telefones;

	@ManyToMany
	@JoinTable(name="Jogador_Genero", 
	joinColumns= @JoinColumn(name="JOGADOR_PK"),
	inverseJoinColumns= @JoinColumn(name="GENERO_PK"))
	private List<Genero> generosFavoritos;
	
	@ManyToMany
	@JoinTable(name="Jogador_BoardGame", 
	joinColumns= @JoinColumn(name="Jogador_id"),
	inverseJoinColumns= @JoinColumn(name="BoardGame_id"))
	private List<BoardGame> boardGamesFavoritos;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
