package br.com.boardgamesociety.managedbeans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.boardgamesociety.models.Genero;
import br.com.boardgamesociety.service.GeneroBean;

@Named
@ViewScoped
public class GeneroMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Genero genero;
	
	@Inject
	private GeneroBean generoBean;
	
	public Genero getGenero() {
		return this.genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String salvar(Genero genero) {
		generoBean.salvar(genero);
	
		return "cadastrarGenero?faces-redirect=true";
	}
	
}
