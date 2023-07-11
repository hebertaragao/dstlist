package com.devaragao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devaragao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
