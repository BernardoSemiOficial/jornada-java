package exercicios.modulo_estrutura_dados.exercicio_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaDeCompras {
  
  public static void main(String[] args) {
    ArrayList<String> comprasArray = new ArrayList<>();
    LinkedList<String> comprasLinked = new LinkedList<>();
    
    long inicioArray = System.nanoTime();
    comprasArray.add("Arroz");
    comprasArray.add("Feijão");
    comprasArray.add("Macarrão");
    comprasArray.add("Leite");
    comprasArray.add("Café");
    for (int i = 0; i < 10000; i++) {
      comprasArray.add("Item " + i);
    }
    long fimArray = System.nanoTime();
    long tempoArray = fimArray - inicioArray;
    
    long inicioLinked = System.nanoTime();
    comprasLinked.add("Arroz");
    comprasLinked.add("Feijão");
    comprasLinked.add("Macarrão");
    comprasLinked.add("Leite");
    comprasLinked.add("Café");
    for (int i = 0; i < 10000; i++) {
      comprasLinked.add("Item " + i);
    }
    long fimLinked = System.nanoTime();
    long tempoLinked = fimLinked - inicioLinked;

    long inicioArrayRemover = System.nanoTime();
    comprasArray.remove("Macarrão");
    for (int i = 0; i < 10000; i++) {
      comprasArray.remove("Item " + i);
    }
    long fimArrayRemover = System.nanoTime();
    
    long inicioLinkedRemover = System.nanoTime();
    comprasLinked.remove("Macarrão");
    for (int i = 0; i < 10000; i++) {
      comprasLinked.remove("Item " + i);
    }
    long fimLinkedRemover = System.nanoTime();

    long tempoArrayRemover = fimArrayRemover - inicioArrayRemover;
    long tempoLinkedRemover = fimLinkedRemover - inicioLinkedRemover;

    long inicioArrayLeitura = System.nanoTime();
    for (String item : comprasArray) {
      // Simula leitura dos itens
    }
    long fimArrayLeitura = System.nanoTime();

    long inicioLinkedLeitura = System.nanoTime();
    for (String item : comprasLinked) {
      // Simula leitura dos itens
    }
    long fimLinkedLeitura = System.nanoTime();
    
    long tempoArrayLeitura = fimArrayLeitura - inicioArrayLeitura;
    long tempoLinkedLeitura = fimLinkedLeitura - inicioLinkedLeitura;
    
    System.out.println("Tempo para adicionar 10005 itens no ArrayList: " + tempoArray + " nanosegundos");
    System.out.println("Tempo para adicionar 10005 itens no LinkedList: " + tempoLinked + " nanosegundos");
    System.out.println("Tempo para remover 10005 itens no ArrayList: " + tempoArrayRemover + " nanosegundos");
    System.out.println("Tempo para remover 10005 itens no LinkedList: " + tempoLinkedRemover + " nanosegundos");
    System.out.println("Tempo para ler 10005 itens no ArrayList: " + tempoArrayLeitura + " nanosegundos");
    System.out.println("Tempo para ler 10005 itens no LinkedList: " + tempoLinkedLeitura + " nanosegundos");
  }
}
