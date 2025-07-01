package exercicios.modulo_excecoes.exercicio_2;

public class Main {
  
  public static void main(String[] args) {
    try {
      CadastroPessoa.cadastrarPessoa("Bernardo", 220);
    } catch (IdadeInvalidaException e) {
      System.out.println("Erro ao cadastrar pessoa: " + e.getMessage());
    }
  }
}
