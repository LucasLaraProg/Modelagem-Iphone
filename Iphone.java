package edu.Iphone;

public class Iphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet {
    @Override
    public void tocarMusica() {

        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música:"+musica);

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número :"+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina com a url: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }
}
