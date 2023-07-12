package com.devaragao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devaragao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
