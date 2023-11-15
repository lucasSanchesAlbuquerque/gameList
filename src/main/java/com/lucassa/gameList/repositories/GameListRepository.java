package com.lucassa.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassa.gameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
