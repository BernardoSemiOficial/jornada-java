package exercicios.modulo_poo.exercicio_1;

public class Gato extends Animal{
  
  public Gato() {
    super();
  }

  @Override
  public void fazerSom() {
    super.fazerSom();
    System.out.println("O gato mia: Miau Miau!");
  }
}
