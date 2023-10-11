package com.lucasoft.sistema.telefone;

public interface Telefone {

    public void ligar(Contato contato);

    public void atender();

    public void iniciarCorreioVoz(Contato contato);

    public void ligarAgenda(Contato contato);
}
