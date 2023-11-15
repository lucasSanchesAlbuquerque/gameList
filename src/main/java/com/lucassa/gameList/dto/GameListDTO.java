package com.lucassa.gameList.dto;

import org.springframework.beans.BeanUtils;

import com.lucassa.gameList.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String nome;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList gameList) {
		BeanUtils.copyProperties(gameList, this);
	}

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
	
	

}
