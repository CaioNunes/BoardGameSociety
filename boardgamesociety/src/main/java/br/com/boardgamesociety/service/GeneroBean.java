package br.com.boardgamesociety.service;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.boardgamesociety.dao.GeneroDAO;
import br.com.boardgamesociety.models.Genero;

@Stateless
public class GeneroBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2752401965534697149L;
	
	@Inject
	private GeneroDAO generoDao;
	
	public void salvar(Genero genero) {
		generoDao.salvar(genero);
	}
	
}
