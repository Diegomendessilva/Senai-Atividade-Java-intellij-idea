public class Imobiliaria {
    private String nome;
    private Endereco endereco;
    private String tipoImovel;
    private double valorImovel;
    private boolean statusLocacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public boolean isStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(boolean statusLocacao) {
        this.statusLocacao = statusLocacao;
    }

    public void mostrarDados(){
        System.out.println("Nome: "  + getNome());
        System.out.println("Tipo de imovel: " + getTipoImovel());
        System.out.println("Valor do imovel: " + getValorImovel());
        System.out.println("Status de locação: " + isStatusLocacao());
        System.out.println("Endereço: Rua - " + getEndereco().getRua() +
                "Bairro" + getEndereco().getBairro() + "Cidade - " + getEndereco().getCidade()

        );
    }
}
