package entradaSaida;

import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\bDigite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("\bDigite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        System.out.print("Resultado da soma: " + soma);

    }
}
