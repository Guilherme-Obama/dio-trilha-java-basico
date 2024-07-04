package negocio;

public class IPhone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    public String exibirPagina(String url) {
        System.out.println("Exibindo página");
        return url;
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public String ligar(String numero) {
        System.out.println("Ligando...");
        return numero;
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void inicarConversa() {
        System.out.println("Alô");
    }

    public String selecionarMusica(String musica) {
        System.out.println("Selecionando música");
        return musica;
    }

    public void tocar() {
        System.out.println("Tocando");        
    }

    public void pausar() {
        System.out.println("Pausando");
    }

}
