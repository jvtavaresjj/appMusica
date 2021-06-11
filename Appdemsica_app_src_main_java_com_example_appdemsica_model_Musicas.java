package com.example.appdemsica.model;

import android.media.Image;

public class Musicas {

    private String nomeMusica;
    private String cantor;
    private String genero;
    private String duracao;


    public Musicas(String nomeMusica, String cantor, String genero, String duracao) {
        this.nomeMusica = nomeMusica;
        this.cantor = cantor;
        this.genero = genero;
        this.duracao = duracao;

    }


    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }


}


