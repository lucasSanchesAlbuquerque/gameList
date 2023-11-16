package com.lucassa.gameList.dto;

import com.lucassa.gameList.entities.Game;
import com.lucassa.gameList.projections.GameMinProjection;

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
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		titulo = projection.getTitulo();
		ano = projection.getAno();
		imagem = projection.getImgUrl();
		descricao = projection.getDescricao();
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
