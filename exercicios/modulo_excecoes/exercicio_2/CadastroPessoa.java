package exercicios.modulo_excecoes.exercicio_2;

public class CadastroPessoa {
  
  public static void cadastrarPessoa(String nome, int idade) throws IdadeInvalidaException {
    if(idade < 0 || idade > 130) throw new IdadeInvalidaException(nome + " - Idade inválida: " + idade);
    System.out.println("Pessoa cadastrada com sucesso: " + nome + ", Idade: " + idade);
  }
}
