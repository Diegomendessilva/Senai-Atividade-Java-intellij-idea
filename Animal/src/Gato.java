public class Gato extends Animal{
    public Gato (String nome, String raca) {
        setNome(nome);
        setRaca(raca);
    }

    public String mia(){
        return "Eu sou "+getNome()+
                " da raça "+getRaca()+
                " e estou miando.";
    }
}
