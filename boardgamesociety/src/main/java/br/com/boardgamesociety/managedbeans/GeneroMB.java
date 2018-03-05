package br.com.boardgamesociety.managedbeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.boardgamesociety.dao.GeneroDAO;
import br.com.boardgamesociety.models.Genero;

@Named
@ViewScoped
public class GeneroMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init() {
		genero = new Genero();
		System.out.println(genero);
	}
	
	private Genero genero;
	
	@Inject
	private GeneroDAO generoDao;
	
	public Genero getGenero() {
		return this.genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String salvar(Genero genero) {
		System.out.println("===========================\n"+genero.getDescricao());
//		generoDao.salvar(genero);
	
		return "cadastrarGenero?faces-redirect=true";
	}
	
}
