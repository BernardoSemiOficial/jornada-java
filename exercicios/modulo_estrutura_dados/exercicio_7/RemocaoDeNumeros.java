package exercicios.modulo_estrutura_dados.exercicio_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemocaoDeNumeros {
  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    Collections.addAll(numeros, 2, 5, 8, 3, 10, 1, 7, 4);
    // numeros.add(2);
    // numeros.add(5);
    // numeros.add(8);
    // numeros.add(3);
    // numeros.add(10);
    // numeros.add(1);
    // numeros.add(7);
    // numeros.add(4);

    Iterator<Integer> it = numeros.iterator();

    while(it.hasNext()) {
      Integer numero = it.next();
      if (numero < 5) {
        it.remove();
      }
    }

    System.out.println("Números após remoção: ");
    for (Integer numero : numeros) {
      System.out.println(numero);
    }
  }
}
