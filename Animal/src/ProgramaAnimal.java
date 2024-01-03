import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaAnimal {
    static ArrayList<Animal> animais = new ArrayList<>();



    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("CADASTRAR ANIMAIS\n" +
                    "[1]Cadastrar Cachorro\n" +
                    "[2]Cadastrar Gato\n" +
                    "[3]Listar Animais\n" +
                    "[0]Sair");
            System.out.print("\tOpção: ");
            opcao = sc.nextInt();


            if (opcao == 1){
                cadastrarCachorro();
            }
            if (opcao ==2){
                cadastrarGato();
            }
            if (opcao == 3){
                listarAnimais();
            }


        }while (opcao != 0);

    }//fim do main

    public static void cadastrarCachorro(){
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String raca = "";

        System.out.print("\tInforme o nome do cachorro: ");
        nome = sc.nextLine();
        System.out.print("\tInforme a raça: ");
        raca = sc.nextLine();

        Cachorro cachorro = new Cachorro(nome,raca);


        animais.add(cachorro);
        System.out.println("\tCachorro cadastrado com sucesso!");

    }
    public static void cadastrarGato(){
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String raca = "";

        System.out.print("\tInforme o nome do gato: ");
        nome = sc.nextLine();
        System.out.print("\tInforme a raça: ");
        raca = sc.nextLine();

        Gato gato = new Gato (nome,raca);


        animais.add(gato);
        System.out.println("\tGato cadastrado com sucesso!");

    }

    public static void listarAnimais(){
        for (int i = 0; i < animais.size(); i++){
            System.out.println(animais.get(i));
        }
    }




}//fim da classe
