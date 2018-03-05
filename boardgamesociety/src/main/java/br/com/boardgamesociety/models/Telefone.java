package br.com.boardgamesociety.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long numero;
	
}
