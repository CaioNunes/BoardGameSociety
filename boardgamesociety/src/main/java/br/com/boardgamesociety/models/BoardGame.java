package br.com.boardgamesociety.models;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BoardGame {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private Double preco;
	private LocalTime duracao;
	private Integer qntJogadores;
	
	@OneToMany
	private Set<Genero> generos;
	
	@ManyToOne
	private Jogador dono;
	
	@ManyToOne
	private Jogador atual;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalTime getDuracao() {
		return duracao;
	}

	public void setDuracao(LocalTime duracao) {
		this.duracao = duracao;
	}

	public Integer getQntJogadores() {
		return qntJogadores;
	}

	public void setQntJogadores(Integer qntJogadores) {
		this.qntJogadores = qntJogadores;
	}

	public Set<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(Set<Genero> genero) {
		this.generos = genero;
	}

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}

	public Jogador getAtual() {
		return atual;
	}

	public void setAtual(Jogador atual) {
		this.atual = atual;
	}

	
	
}
