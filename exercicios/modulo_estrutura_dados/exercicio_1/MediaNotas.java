package exercicios.modulo_estrutura_dados.exercicio_1;

import java.util.Scanner;

public class MediaNotas {
  public static void main(String[] args) {
    double[] notas = new double[5];

    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Digite a nota " + (i + 1) + ": ");
      notas[i] = scan.nextDouble();
    }
    scan.close();

    double maiorNota = notas[0];
    double menorNota = notas[0];
    for (double nota : notas) {
      if(nota > maiorNota) {
        maiorNota = nota;
      }
      if(nota < menorNota) {
        menorNota = nota;
      }
    }
    System.out.printf("A maior nota é: %.2f%n", maiorNota);
    System.out.printf("A menor nota é: %.2f%n", menorNota);
    System.out.println("Notas digitadas:");
    for (double nota : notas) {
      System.out.printf("%.2f ", nota);
    }

    double soma = 0;
    for(int i = 0; i < notas.length; i++) {
      soma += notas[i];
    }
    double media = soma / notas.length;
    System.out.printf("A média das notas é: %.2f%n", media);


  }
}
