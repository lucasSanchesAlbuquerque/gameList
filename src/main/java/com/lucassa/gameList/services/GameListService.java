package com.lucassa.gameList.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucassa.gameList.dto.GameListDTO;
import com.lucassa.gameList.dto.GameMinDTO;
import com.lucassa.gameList.entities.GameList;
import com.lucassa.gameList.projections.GameMinProjection;
import com.lucassa.gameList.repositories.GameListRepository;
import com.lucassa.gameList.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> list = gameListRepository.findAll();
		return list.stream().map(x -> new GameListDTO(x)).toList();
		 
	}
	
	@Transactional
	public void mover(Long listID, int origemIndex, int destinoIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listID);
		
		GameMinProjection obj =  list.remove(origemIndex);
		list.add(destinoIndex, obj);
		
		int min = origemIndex < destinoIndex ? origemIndex : destinoIndex;
		int max = origemIndex <  destinoIndex ? destinoIndex : origemIndex;
		
		for(int i = min; i <= max; i++) {
			gameListRepository.updatePosicao(listID, list.get(i).getId(), i);
		}
	}
	
	
	
	
}
