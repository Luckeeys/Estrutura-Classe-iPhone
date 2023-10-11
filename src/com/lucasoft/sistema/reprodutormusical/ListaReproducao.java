package com.lucasoft.sistema.reprodutormusical;

import java.util.ArrayList;
import java.util.List;

public class ListaReproducao {

    private String titulo;
    private String autor;
    private List<Musica> listaMusica;

    public ListaReproducao(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.listaMusica = new ArrayList<>();
    }

    public void adicionarMusica() {
        System.out.println("Musica adicionada");
    }

    public void removerMusica() {
        System.out.println("Musica removida");
    }
}
