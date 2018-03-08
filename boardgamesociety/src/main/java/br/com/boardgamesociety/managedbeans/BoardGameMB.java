package br.com.boardgamesociety.managedbeans;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.boardgamesociety.models.BoardGame;

@Named
@ViewScoped
public class BoardGameMB {
	
	@Inject
	private BoardGame boardGame;
	
	public BoardGame getBoardGame() {
		return boardGame;
	}
	
	public void setBoardGame(BoardGame boardGame) {
		this.boardGame = boardGame;
	}
}
