package exercicios.modulo_fundamentos.exercicio_1;

public class Main {

  public static void main(String[] args) {
    Aluno aluno = new Aluno("Bernardo", 20, 8.5, 9.0);

    System.out.println(aluno.exibirInformacoes());
    System.out.println("Média: " + aluno.calcularMedia());
  }
}