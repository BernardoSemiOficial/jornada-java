package exercicios.modulo_excecoes.exercicio_1;

import java.util.Scanner;

public class DivisaoSegura {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    String num1 = scan.nextLine();
    System.out.print("Digite o segundo número: ");
    String num2 = scan.nextLine();
    scan.close();

    try {
      double resultado = Integer.parseInt(num1) / Integer.parseInt(num2);
      System.out.println("Resultado da divisão: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Não é possível realizar uma divisão por zero");
    } catch(NumberFormatException e) {
      System.out.println("Erro de formato numérico: " + e.getMessage());
    } 
    finally {
      System.out.println("Operação finalizada.");
    }
  }
}
