package exercicios.modulo_fundamentos.exercicio_2;

public class VerificadorIdade {
  
  public static void main(String[] args) {
    int idade = 20;

    if(idade < 18) {
      System.err.println("Você é menor de idade.");
    } else if(idade >= 18 && idade <= 59) {
      System.out.println("Você é maior de idade.");
    } else {
      System.out.println("Você é idoso.");
    }
  }
}
