package com.terabits.api_jogos.service;

import com.terabits.api_jogos.dto.JogoDTO;
import com.terabits.api_jogos.entity.Jogo;

import com.terabits.api_jogos.repository.JogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {


    private final JogoRepository repository;

    public JogoService(JogoRepository repository) {
        this.repository = repository;
    }



    public JogoDTO salvar(JogoDTO dto){
        Jogo jogo = new Jogo();

        jogo.setNome(dto.getNome());
        jogo.setCategoria(dto.getCategoria());
        jogo.setPlataforma(dto.getPlataforma());
        jogo.setNota(dto.getNota());

        repository.save(jogo);

        return dto;
    }

    public List<JogoDTO> listar(){
        return repository.findAll()
                .stream()
                .map(jogo -> new JogoDTO(
                        jogo.getNome(),
                        jogo.getCategoria(),
                        jogo.getPlataforma(),
                        jogo.getNota()
                )).toList();
    }
}
