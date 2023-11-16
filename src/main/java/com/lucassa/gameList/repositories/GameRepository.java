package com.lucassa.gameList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lucassa.gameList.entities.Game;
import com.lucassa.gameList.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
	@Query(nativeQuery = true, value = """
			SELECT Game.id, Game.titulo, Game.ano, Game.imagem AS imgUrl,
			Game.descricao, Pertencendo.posicao
			FROM Game
			INNER JOIN Pertencendo ON Game.id = Pertencendo.game_id
			WHERE Pertencendo.list_id = :listId
			ORDER BY Pertencendo.posicao
				""")
	List<GameMinProjection> searchByList(Long listId);

}
