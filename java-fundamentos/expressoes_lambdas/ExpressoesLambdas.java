package expressoes_lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExpressoesLambdas {

  public static void main(String[] args) {

    Operacao soma = (a, b) -> a + b;
    Operacao subtracao = (a, b) -> a - b;
    Operacao multiplicacao = (a, b) -> a * b;

    System.out.println("Soma: " + soma.calcular(5, 3));
    System.out.println("Subtração: " + subtracao.calcular(5, 3));
    System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));

    List<String> frutas = Arrays.asList("laranja", "abacaxi", "maçã", "banana");
    
    Collections.sort(frutas, (a, b) -> a.length() - b.length());
    System.out.println("Frutas ordenadas por tamanho: " + frutas);
  }
}

@FunctionalInterface
interface Operacao {
    int calcular(int a, int b);
}