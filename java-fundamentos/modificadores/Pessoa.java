package modificadores;

public class Pessoa {
    /* Modificadores
     * 
     * public: Acesso irrestrito, pode ser acessado de qualquer lugar.
     * private: Acesso restrito à própria classe, não pode ser acessado de fora
     * protected: Acesso restrito à própria classe e subclasses, além do pacote.
     */

    public String nome; // Atributo público, acessível de qualquer lugar
    private int idade; // Atributo privado, acessível apenas dentro da classe Pessoa
    protected String endereco; // Atributo protegido, acessível dentro da classe, subclasses e pacote

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome; // Atribui o nome passado como parâmetro ao atributo nome
        this.idade = idade; // Atribui a idade passada como parâmetro ao atributo idade
        this.endereco = "Desconhecido"; // Atribui um valor padrão ao atributo endereco
    }

    public void minhaIdade() {
        System.out.println("Minha idade é: " + idade);
    }

    public void meuEndereco() {
        System.out.println("Meu endereço é: " + endereco);
    }

}
