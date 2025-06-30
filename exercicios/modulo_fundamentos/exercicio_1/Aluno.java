package exercicios.modulo_fundamentos.exercicio_1;

public class Aluno {
  String nome;
  int idade;
  double nota1;
  double nota2;

  public Aluno(String nome, int idade, double nota1, double nota2) {
    this.nome = nome;
    this.idade = idade;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public double calcularMedia() {
    return (nota1 + nota2) / 2;
  }

  public String exibirInformacoes() {
    return "Nome: " + nome + "\n" +
           "Idade: " + idade + "\n" +
           "Nota 1: " + nota1 + "\n" +
           "Nota 2: " + nota2 + "\n" +
           "Média: " + calcularMedia();
  }
}