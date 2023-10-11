package com.lucasoft.sistema.reprodutormusical;

public interface ReprodutorMusical {
    public void tocar(Musica musica);

    public void pausar(Musica musica);

    public void selecionarMusica(Musica musica);
    public void tocarMusicaListaReproducao(ListaReproducao listaReproducao);

}
