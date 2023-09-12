public class iphone {

    public static void main(String[] args) {
        //Reprodutor Musical
        System.out.println("-----------REPRODUTOR MUSICAL-----------");
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.pausar();
        reprodutorMusical.continuar();
        reprodutorMusical.parar();
        reprodutorMusical.tocarMusica("TODO SEU");
        reprodutorMusical.pausar();
        reprodutorMusical.continuar();
        reprodutorMusical.parar();
        reprodutorMusical.continuar();
        reprodutorMusical.tocarMusica("DÓI");
        reprodutorMusical.tocarMusica("ENTÃO VALEU");

        System.out.println("-----------APARELHO TELEFONICO-----------");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("(99)99999-9999");
        aparelhoTelefonico.confirmarAtendimento();
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.ligar("(99)99999-8888");
        aparelhoTelefonico.iniciarCorreioDeVoz();
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.tocar("(99)99999-7777");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.desligar();

        System.out.println("-----------NAVEGADOR-----------");
        Navegador navegador = new Navegador();
        navegador.adicionarNovaAba();
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.exibirPagina("www.google.com");
        navegador.exibirPagina("www.google.com", 1);
        navegador.fecharAba(0);
        navegador.atualizarPagina();

    }
}
