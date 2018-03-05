package br.com.boardgamesociety.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.com.boardgamesociety.jpautil.JPAUtil;
import br.com.boardgamesociety.models.Genero;

public class GeneroDAO implements Serializable{

	public void salvar(Genero genero) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.merge(genero);
	}

}
