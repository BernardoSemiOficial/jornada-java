package exececoes;

public class ExececaoPrincipal {
    
    public static void main(String[] args) {
        // Exemplo de uso de exceções em Java
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }

        // Exemplo de uso de exceções lançadas para a chamada de método
        try {
            verificarIdade(15);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        return a / b; // Pode lançar ArithmeticException se b for zero
    }

    public static void verificarIdade(int idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Idade deve ser maior ou igual a 18.");
        }
        System.out.println("Idade válida: " + idade);
    }
}
