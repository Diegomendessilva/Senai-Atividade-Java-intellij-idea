import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoaUm = new Pessoa();
        System.out.print("Digite seu nome: ");
        pessoaUm.nome = sc.nextLine();

        System.out.print("Digite seu cpf: ");
        pessoaUm.cpf = sc.nextLine();

        System.out.print("Digite sua idade: ");
        pessoaUm.idade = sc.nextInt();

        System.out.print("Digite seu genero: ");
        pessoaUm.sexo = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Digite seu endereço: ");
        pessoaUm.enderco = sc.nextLine();







        System.out.println("______________");
        pessoaUm.seApresentar();
        System.out.println("_______________");







    }

}