public class ReprodutorMusical {
    private String musica;

    ReprodutorMusical() {
        musica = "";
    }

    private void escolherMusica (String musica) {
        this.musica = musica;
        System.out.println("ESCOLHENDO A MÚSICA " + musica);
    }

    public void tocarMusica(String musica) {
        escolherMusica(musica);
        System.out.println("TOCANDO A MÚSICA " + musica);
    }

    public void pausar() {
        if (musica.isEmpty()) {
            System.out.println("NÃO HÁ MÚSICA TOCANDO PARA PAUSAR");
        } else {
            System.out.println("PAUSANDO A MÚSICA " + musica);
        }
    }

    public void continuar() {
        if (musica.isEmpty()) {
            System.out.println("NÃO HÁ MÚSICA SELECIONADA PARA CONTINUAR");
        } else {
            System.out.println("CONTINUANDO A MÚSICA " + musica);
        }
    }

    public void parar() {
        if (musica.isEmpty()) {
            System.out.println("NÃO HÁ MÚSICA TOCANDO PARA PARAR");
        } else {
            System.out.println("PARANDO A MÚSICA " + musica);
            musica = "";
        }
    }

}
