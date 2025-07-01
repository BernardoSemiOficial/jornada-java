package exercicios.modulo_poo.exercicio_3;

public class Pessoa {
  protected String cidade;
  private int idade;
  public String nome;
  String documento;

  public void exibirNome() {
    System.out.println("Nome: " + nome);
  }

  protected void exibirCidade() {
    System.out.println("Cidade: " + cidade);
  }

  void exibirDocumento() {
    System.out.println("Documento: " + documento);
  }

  private void exibirIdade() {
    System.out.println("Idade: " + idade);
  }
}
