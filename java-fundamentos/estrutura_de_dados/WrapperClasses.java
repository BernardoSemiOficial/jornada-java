package estrutura_de_dados;

import java.util.ArrayList;

public class WrapperClasses {
    
    public static void main(String[] args) {
        /*
         * As Wrapper Classes em Java são classes que encapsulam tipos primitivos,
         * permitindo que eles sejam tratados como objetos. Isso é útil quando você
         * precisa usar tipos primitivos em contextos que exigem objetos, como em coleções
         * (por exemplo, ArrayList, HashMap) ou quando você precisa de funcionalidades adicionais
         * como comparação, conversão e manipulação de valores primitivos.
         * int - Integer
         * double - Double
         * char - Character
         * boolean - Boolean
         * byte - Byte
         * short - Short
         * long - Long
         */
        // Exemplo de uso de Wrapper Classes em Java
        
        // Integer - classe wrapper para o tipo primitivo int
        Integer numero = 42; // Autoboxing
        System.out.println("Número: " + numero);
        
        // Double - classe wrapper para o tipo primitivo double
        Double decimal = 3.14; // Autoboxing
        System.out.println("Decimal: " + decimal);
        
        // Character - classe wrapper para o tipo primitivo char
        Character letra = 'A'; // Autoboxing
        System.out.println("Letra: " + letra);
        
        // Boolean - classe wrapper para o tipo primitivo boolean
        Boolean verdadeiro = true; // Autoboxing
        System.out.println("Verdadeiro: " + verdadeiro);
        
        // Convertendo de String para Wrapper Classes
        String numeroString = "100";
        Integer numeroConvertido = Integer.valueOf(numeroString); // Conversão de String para Integer
        System.out.println("Número convertido de String: " + numeroConvertido);

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        // Adicionando números à lista usando Wrapper Class Integer
        listaNumeros.add(10); // Autoboxing
        listaNumeros.add(20);
        listaNumeros.add(30);

        // Imprimindo os números da lista
        System.out.println("Números na lista:");
        for (Integer num : listaNumeros) {
            System.out.println(num);
        }
        
    }
}
