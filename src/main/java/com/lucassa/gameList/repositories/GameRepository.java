package com.lucassa.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassa.gameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
