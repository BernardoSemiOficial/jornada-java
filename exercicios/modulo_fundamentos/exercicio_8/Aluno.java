package exercicios.modulo_fundamentos.exercicio_8;

public class Aluno {
  private String nome;
  private String matricula;
  private double nota;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double getNota() {
    return this.nota;
  }

  public void setNota(double nota) {
    if(nota >= 0 && nota <= 10) {
      this.nota = nota;
    } else {
      throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
    }
  }

  public void exibirInformacoes() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Matrícula: " + this.matricula);
    System.out.println("Nota: " + this.nota);
  }
}
