package com.lucassa.gameList.dto;

import com.lucassa.gameList.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String imagem;
	private String descricao;
	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entidade) {
		id = entidade.getId();
		titulo = entidade.getTitulo();
		ano = entidade.getAno();
		imagem = entidade.getImagem();
		descricao = entidade.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImagem() {
		return imagem;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	
	
}
