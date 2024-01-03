public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        setNome(nome);
        setRaca(raca);
    }

    public String late(){
        return "Eu sou "+getNome()+
                " da raça "+getRaca()+
                " e estou latindo.";
    }
}
