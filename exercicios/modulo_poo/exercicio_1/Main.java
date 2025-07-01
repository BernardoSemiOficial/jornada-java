package exercicios.modulo_poo.exercicio_1;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    
    Animal[] animais = new Animal[2];
    ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
  
    animais[0] = new Cachorro();
    animais[0].nome = "Rex";
    animais[0].idade = 5;
  
    animais[1] = new Gato();
    animais[1].nome = "Mia";
    animais[1].idade = 3;
  
    for (Animal animal : animais) {
      System.out.println("Nome: " + animal.nome);
      System.out.println("Idade: " + animal.idade + " anos");
      animal.fazerSom();
    }

    Cachorro dog = new Cachorro();
    dog.nome = "Buddy";
    dog.idade = 4;

    Gato cat = new Gato();
    cat.nome = "Whiskers";
    cat.idade = 2;

    listaAnimais.add(dog);
    listaAnimais.add(cat);

    System.out.println("\nLista de Animais:");
    for (Animal animal : listaAnimais) {
      System.out.println("Nome: " + animal.nome);
      System.out.println("Idade: " + animal.idade + " anos");
      animal.fazerSom();
    }
  }
}
