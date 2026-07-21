package com.terabits.api_jogos.controller;

import com.terabits.api_jogos.dto.JogoDTO;
import com.terabits.api_jogos.service.JogoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin(origins = "*")
public class JogoController {

    private final JogoService service;

    public JogoController(JogoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<JogoDTO> salvar(@RequestBody JogoDTO dto){

        JogoDTO jogo = service.salvar(dto);

        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(jogo);
    }

    @GetMapping
    public ResponseEntity<List<JogoDTO>> listar(){

        return ResponseEntity.ok(service.listar());
    }
}
