public class AparelhoTelefonico {

    private String numero;
    private Boolean telefoneTocando;
    private Boolean telefoneLigando;


    AparelhoTelefonico() {
        numero = "";
        telefoneTocando = Boolean.FALSE;
        telefoneLigando = Boolean.FALSE;
    }

    public void ligar(String numero) {
        if (this.numero.isEmpty()) {
            System.out.println("LIGANDO PARA O NÚMERO " + numero);
            this.numero = numero;
            this.telefoneLigando = Boolean.TRUE;
        } else {
            System.out.println("TELEFONE INDISPONÍVEL PARA FAZER LIGAÇÕES");
        }
    }

    public void confirmarAtendimento() {
        if (!this.numero.isEmpty() && telefoneLigando) {
            System.out.println("TELEFONE ATENDIDO PELO NÚMERO " + numero);
            telefoneLigando = Boolean.FALSE;
        } else {
            System.out.println("TELEFONE NÃO ESTÁ LIGANDO");
        }
    }

    public void iniciarCorreioDeVoz() {
        if (!this.numero.isEmpty() && telefoneLigando) {
            System.out.println("INICIANDO CORREIO DE VOZ " + numero);
            telefoneLigando = Boolean.FALSE;
        } else {
            System.out.println("TELEFONE NÃO ESTÁ LIGANDO");
        }
    }

    public void tocar(String numero) {
        if (this.numero.isEmpty()) {
            System.out.println("TELEFONE TOCANDO: NÚMERO " + numero);
            this.numero = numero;
            telefoneTocando = Boolean.TRUE;
        } else {
            System.out.println("TELEFONE INDISPONÍVEL PARA TOCAR");
        }
    }

    public void atender() {
        if (!this.numero.isEmpty() && telefoneTocando) {
            System.out.println("ATENDENDO NÚMERO " + numero);
            telefoneTocando = Boolean.FALSE;
        } else {
            System.out.println("TELEFONE NÃO ESTÁ TOCANDO");
        }
    }

    public void desligar() {
        if (!this.numero.isEmpty()) {
            System.out.println("DESLIGANDO LIGAÇÃO. NÚMERO " + numero);
            this.numero = "";
        } else {
            System.out.println("NÃO HÁ LIGAÇÃO");
        }
    }

}
