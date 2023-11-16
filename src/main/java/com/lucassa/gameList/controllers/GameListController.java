package com.lucassa.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucassa.gameList.dto.GameListDTO;
import com.lucassa.gameList.dto.GameMinDTO;
import com.lucassa.gameList.services.GameListService;
import com.lucassa.gameList.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private  GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	
	
	@GetMapping(value = "/{listID}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listID){
		return gameService.findByListGames(listID);
	}
	

}
