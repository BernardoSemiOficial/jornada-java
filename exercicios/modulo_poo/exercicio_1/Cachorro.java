package exercicios.modulo_poo.exercicio_1;

public class Cachorro extends Animal {

  public Cachorro() {
    super();
  }
  
  @Override
  public void fazerSom() {
    super.fazerSom();
    System.out.println("O cachorro late: Au Au!");
  }
}
