package com.lucassa.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lucassa.gameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE Pertencendo SET posicao = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updatePosicao(Long listId, Long gameId, Integer newPosition);

}
