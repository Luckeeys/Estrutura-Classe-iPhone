package com.lucasoft.sistema;

import com.lucasoft.sistema.navegador.Navegador;
import com.lucasoft.sistema.reprodutormusical.ListaReproducao;
import com.lucasoft.sistema.reprodutormusical.Musica;
import com.lucasoft.sistema.reprodutormusical.ReprodutorMusical;
import com.lucasoft.sistema.telefone.Contato;
import com.lucasoft.sistema.telefone.Telefone;

public class Dispositivo implements Navegador, ReprodutorMusical, Telefone {

    //Métodos do navegador
    @Override
    public void exibirPaginar() {
        System.out.println("Exibindo pagina no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova pagina no iPhone");
    }

    @Override
    public void atualizarPagina() { System.out.println("Atualizando a pagina no iPhone"); }

    //Métodos do reprodutor de música
    @Override
    public void tocar(Musica musica) {
        System.out.println("Tocando musica no iPhone");
    }

    @Override
    public void pausar(Musica musica) {
        System.out.println("Pausando a musica no iPhone");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Musica selecionada no iPhone");
    }

    @Override
    public void tocarMusicaListaReproducao(ListaReproducao listaReproducao) {
        System.out.println("Tocando musica da playlist do iPhone");
    }

    //Métodos do telefone
    @Override
    public void ligar(Contato contato) {
        System.out.println("Ligando para o contato no iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no iPhone");
    }

    @Override
    public void iniciarCorreioVoz(Contato contato) {
        System.out.println("Iniciando correio de voz no iPhone");
    }

    @Override
    public void ligarAgenda(Contato contato) {
        System.out.println("Ligando para o contato da agenda do iPhone");
    }

    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();

        dispositivo.adicionarNovaAba();
        dispositivo.exibirPaginar();
        dispositivo.atualizarPagina();
    }

}
