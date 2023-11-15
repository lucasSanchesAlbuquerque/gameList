package com.lucassa.gameList.dto;

import org.springframework.beans.BeanUtils;

import com.lucassa.gameList.entities.Game;

public class GameDTO {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private String imagem;
	private String descricao;
	private String descricao_completa;
	private Double nota;  
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game game) {
		BeanUtils.copyProperties(game, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao_completa() {
		return descricao_completa;
	}

	public void setDescricao_completa(String descricao_completa) {
		this.descricao_completa = descricao_completa;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	

}
