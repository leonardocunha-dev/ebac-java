import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Inválido!, Digite um número maior que zero.");
            }

        } while (numero <= 0);

        System.out.println("\n^^^ CONTAGEM CRESCENTE ^^^");

        for (int contador = 0; contador <= numero; contador++) {
            System.out.println(contador);
        }


        System.out.println("\nVVV CONTAGEM DECRESCENTE VVV");

        int contador = numero;

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }


        int quantidadeRepeticoes;

        if (nome.length() > 6) {
            quantidadeRepeticoes = numero;
        } else {
            quantidadeRepeticoes = 1;
        }


        System.out.println("\nNome do usuário:");

        for (int i = 0; i < quantidadeRepeticoes; i++) {
            System.out.println(nome);
        }

        scanner.close();
    }
}