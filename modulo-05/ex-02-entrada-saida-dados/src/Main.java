import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" Bem-vindo ao sistema de cadastro!");
        System.out.println("=======================================\n");

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); // Limpa o buffer do teclado para não dar erro

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.println("\n=======================================");
        System.out.println("Dados informados:");
        System.out.println("=======================================");
        System.out.println("Nome Completo : " + nomeCompleto);
        System.out.println("CPF           : " + cpf);
        System.out.println("Idade         : " + idade + " anos");
        System.out.println("Peso          : " + peso + " kg");
        System.out.println("Altura        : " + altura + " m");
        System.out.println("Estado Civil  : " + estadoCivil);

        scanner.close();
    }
}