public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private boolean tocando;
    private String numeroAtual;
    private String paginaAtual;
    private int quantidadeAbas;

    public IPhone() {
        this.tocando = false;
        this.quantidadeAbas = 1;
    }

    // Implementação ReprodutorMusical
    @Override
    public void tocar() {
        this.tocando = true;
        System.out.println("Tocando música: " + this.musicaAtual);
    }

    @Override
    public void pausar() {
        this.tocando = false;
        System.out.println("Música pausada: " + this.musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada de: " + this.numeroAtual);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        this.quantidadeAbas++;
        System.out.println("Nova aba adicionada. Total de abas: " + this.quantidadeAbas);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + this.paginaAtual);
    }
}