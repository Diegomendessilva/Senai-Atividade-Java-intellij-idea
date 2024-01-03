
import java.util.Scanner;

    public class AnoBissexto {

        public static void main(String[] args) {
            // Solicitar ao usuário que insira um ano
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um ano: ");
            int ano = scanner.nextInt();

            // Calcular se o ano é bissexto de acordo com as regras
            boolean bissexto = verificaAnoBissexto(ano);

            // Exibir na tela a resposta
            if (bissexto) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }

            // Fechar o scanner
            scanner.close();
        }

        // Função para verificar se um ano é bissexto
        private static boolean verificaAnoBissexto(int ano) {
            // Regra 1: Anos múltiplos de 400 são bissextos
            // Regra 2: Anos múltiplos de 4 e não múltiplos de 100 também são bissextos
            return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
        }
    }


