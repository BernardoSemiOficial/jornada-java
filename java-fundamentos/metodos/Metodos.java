package metodos;

public class Metodos {
    String nome = "Bernardo";
    int idade = 20;

    public static void main(String[] args) {
        exibirNomeLog();
        exibirNomeLog("João");
        System.out.println(exibirNome());
        exibirNomeIdade("Maria", 25);
    }

    private static void exibirNomeLog() {
        System.out.println("Meu nome é Bruno");
    }

    private static void exibirNomeLog(String nome) {
        System.out.println("Meu nome é " + nome);
    }

    private static String exibirNome() {
        return "Meu nome é Paulo";
    }

    private static void exibirNomeIdade(String nome, int idade) {
        System.out.println("Meu nome é " + nome);
        exibirIdade(idade);
    }

    private static void exibirIdade(int idade) {
        System.out.println("Minha idade é " + idade + " anos.");
    }
}
