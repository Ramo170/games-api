package com.terabits.api_jogos.dto;




public class JogoDTO {

    private String nome;
    private String categoria;
    private String plataforma;
    private Double nota;

    public JogoDTO(String nome, String categoria, String plataforma, Double nota) {
        this.nome = nome;
        this.categoria = categoria;
        this.plataforma = plataforma;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
