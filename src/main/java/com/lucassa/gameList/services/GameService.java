package com.lucassa.gameList.services;


import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucassa.gameList.dto.GameMinDTO;
import com.lucassa.gameList.entities.Game;
import com.lucassa.gameList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> list = gameRepository.findAll();
		List<GameMinDTO> dto = list.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
