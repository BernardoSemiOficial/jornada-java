package modificadores;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println("Nome: " + pessoa.nome);
        pessoa.minhaIdade();
        pessoa.meuEndereco();

        // pessoa.idade = 35; // Isso causará um erro de compilação, pois idade é private
        // pessoa.endereco = "Rua A"; // Isso causará um erro de compilação, pois endereco é protected
        // pessoa.nome = "Maria"; // Isso é permitido, pois nome é public
    }
}
