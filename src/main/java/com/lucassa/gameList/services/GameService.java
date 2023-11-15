package com.lucassa.gameList.services;


import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucassa.gameList.dto.GameDTO;
import com.lucassa.gameList.dto.GameMinDTO;
import com.lucassa.gameList.entities.Game;
import com.lucassa.gameList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> list = gameRepository.findAll();
		List<GameMinDTO> dto = list.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	} 
	
	
}
