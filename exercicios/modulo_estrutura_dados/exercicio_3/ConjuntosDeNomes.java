package exercicios.modulo_estrutura_dados.exercicio_3;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntosDeNomes {
  public static void main(String[] args) {
    HashSet<String> nomesHash = new HashSet<String>();
    TreeSet<String> nomesTree = new TreeSet<String>();


    nomesHash.add("Ana");
    nomesHash.add("Carlos");
    nomesHash.add("Beatriz");
    nomesHash.add("Ana");
    nomesHash.add("Eduardo");
    nomesHash.add("Daniela");
    
    nomesTree.add("Ana");
    nomesTree.add("Carlos");
    nomesTree.add("Beatriz");
    nomesTree.add("Ana");
    nomesTree.add("Eduardo");
    nomesTree.add("Daniela");

    for(String nome : nomesHash) {
      System.out.println("Nome no HashSet: " + nome);
    }
    System.out.println("---------------------");
    for(String nome : nomesTree) {
      System.out.println("Nome no TreeSet: " + nome);
    }
    System.out.println("---------------------");


  }
}
