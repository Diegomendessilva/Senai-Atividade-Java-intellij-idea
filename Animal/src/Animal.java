public class Animal {
    private String nome;
    private String raca;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String caminha() {
        return "Eu sou " + getNome() +
                " da raça " + getRaca() +
                " e estou caminhando.";
    }

    @Override
    public String toString() {
        return "\t\t_________" +
                "\n\t\tNOME: " + getNome() +
                "\n\t\tRAÇA: " + getRaca();
    }
}
