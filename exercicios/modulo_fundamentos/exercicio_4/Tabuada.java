package exercicios.modulo_fundamentos.exercicio_4;

public class Tabuada {
  
  public static void main(String[] args) {
    int numero = 7;

    for(int i = 0; i < 10; i++) {
      int mult = numero * (i+1);
      System.out.println(numero + " x " + (i+1) + " = " + mult);
    }
  }
}
