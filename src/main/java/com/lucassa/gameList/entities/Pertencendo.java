package com.lucassa.gameList.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Pertencendo {
	
	@EmbeddedId
	private PertencendoPK id = new PertencendoPK();
	
	private Integer posicao;
	
	
	public Pertencendo() {
		
	}


	public Pertencendo(Game game, GameList gameList, Integer posicao) {
		id.setGame(game);
		id.setGameList(gameList);
		this.posicao = posicao;
	}


	public PertencendoPK getId() {
		return id;
	}


	public void setId(PertencendoPK id) {
		this.id = id;
	}


	public Integer getPosicao() {
		return posicao;
	}


	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertencendo other = (Pertencendo) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
