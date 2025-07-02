package estruturaderepeticao;

public class Enquanto {
    
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }

        // Exemplo de do-while
        int numero = 0;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 5);
    }
}
