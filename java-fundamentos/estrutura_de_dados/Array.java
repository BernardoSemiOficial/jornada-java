package estrutura_de_dados;

public class Array {
    
    public static void main(String[] args) {
        // Exemplo de uso de arrays em Java
        int[] numeros = new int[5]; // Criação de um array de inteiros com tamanho 5
        
        // Atribuindo valores ao array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        // Imprimindo os elementos do array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }
        
        // Verificando o tamanho do array
        System.out.println("Tamanho do array: " + numeros.length);
        
        // Modificando um elemento do array
        numeros[2] = 35;
        
        // Imprimindo os elementos após a modificação
        System.out.println("Após modificação:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
