package com.terabits.api_jogos.repository;

import com.terabits.api_jogos.entity.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
