import java.util.ArrayList;
import java.util.List;

public class Navegador {

    private List<String> paginas;
    private Integer abaAberta;

    public Navegador() {
        paginas = new ArrayList<>();
        adicionarNovaAba();
    }

    public void adicionarNovaAba() {
        paginas.add("");
        abaAberta = paginas.size() - 1;
        System.out.println("ADICIONANDO ABA");
    }

    public void fecharAba(int index) {
        if (paginas.size() == 0) {
            System.out.println("NÃO HÁ ABA ADICIONADA");
            return;
        }

        if (index >= paginas.size()) {
            System.out.println("NÃO HÁ ABA COM ESSE INDEX");
            return;
        }

        paginas.remove(index);
        if (paginas.size() == 0) abaAberta = null;
        System.out.println("REMOVENDO ABA DE INDEX " + index);
    }

    public void exibirPagina(String pagina) {
        exibirPagina(pagina, null);
    }

    public void exibirPagina(String pagina, Integer index) {
        if (paginas.size() == 0) {
            adicionarNovaAba();
        }

        if (index != null) {
            if (index >= paginas.size()) {
                System.out.println("NÃO HÁ ABA COM ESSE INDEX");
                return;
            }
            abaAberta = index;
        }
        if (pagina != null) {
            paginas.set(abaAberta, pagina);
        }
        System.out.println("EXIBINDO PÁGINA " + paginas.get(abaAberta) +" NA ABA " + abaAberta);
    }

    public void atualizarPagina() {
        if (abaAberta == null) {
            System.out.println("NÃO HÁ ABA ABERTA");
            return;
        }

        System.out.println("ATUALIZANDO PÁGINA " + paginas.get(abaAberta) +" NA ABA " + abaAberta);
    }

}
