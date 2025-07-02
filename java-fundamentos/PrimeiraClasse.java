/**
 * O nome da classe deve começar com letra maiúscula.
 * 
 * 123PrimeiraClasse.java
 * O nome da classe não pode começar com número.
 * 
 * Não pode conter palavas reservadas do java (ex: class, public, static, void, int, etc).
 * Não deve conter caracteres especiais (ex: @, #, $, %, &, *, etc).
 */

 public class PrimeiraClasse {
    
    // Atributos
    String nome;
    int idade;

    // Método construtor
    public PrimeiraClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
 }