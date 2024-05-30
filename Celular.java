package edu.Iphone;

public class Celular extends Iphone{
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica("dancing in the dark ");
        iphone.ligar("12333123");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
