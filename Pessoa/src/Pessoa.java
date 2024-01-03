public class Pessoa {
    String nome;
    String cpf;
    String enderco;
    int idade;
    char sexo;

    public void  seApresentar(){
        System.out.println("Olá, eu sou o(a) " + nome);
        System.out.println("Meu cpf é " + cpf);
        System.out.println("Minha idade é " + idade);
        if (sexo == 'M' || sexo == 'm'){
            System.out.println("Masculino");
        }else {
            System.out.println("Feminino");
        }
        System.out.println("Meu endereço " + enderco);


    }
}
