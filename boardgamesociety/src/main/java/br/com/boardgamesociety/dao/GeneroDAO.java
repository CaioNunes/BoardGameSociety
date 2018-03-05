package br.com.boardgamesociety.dao;

import java.io.Serializable;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.boardgamesociety.models.Genero;

public class GeneroDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void salvar(Genero genero) {
		manager.merge(genero);
	}

}
