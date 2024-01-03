public class ProgramaImobiliaria {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.setNome("Imobiaria do seu Jorge");
        imobiliaria.setTipoImovel("Apartamento");
        imobiliaria.setStatusLocacao(true);
        imobiliaria.setValorImovel(3800);
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setCep("555555-55");
        endereco.setBairro("Brás");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setComplemento("Proximo a igreja do bras");
        imobiliaria.setEndereco(endereco);

        imobiliaria.mostrarDados();


    }
}
