package estrutura_de_dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AulaIterator {
    
    public static void main(String[] args) {
        /*
         * O Iterator é uma interface em Java que permite percorrer elementos de uma coleção de forma sequencial.
         * Ele fornece métodos para verificar se há mais elementos, obter o próximo elemento e remover o elemento atual.
         * * O Iterator é útil quando você precisa percorrer uma coleção sem expor sua estrutura interna.
         * * Ele é usado em várias coleções do Java, como List, Set e Map
         */
        
        // Exemplo de uso de Iterator em Java
        ArrayList<String> lista = new ArrayList<>();
        
        // Adicionando elementos à lista
        lista.add("Elemento 3");
        lista.add("Elemento 2");
        lista.add("Elemento 1");
        
        // Usando Iterator para percorrer a lista
        Iterator<String> iterator = lista.iterator();
        
        System.out.println("Elementos da lista:");
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }
        
        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
        
        // Removendo um elemento usando Iterator
        iterator = lista.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals("Elemento 2")) {
                iterator.remove(); // Remove o elemento atual
            }
        }
        
        // Imprimindo os elementos após a remoção
        System.out.println("Após remoção:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        ListIterator<String> listIterator = lista.listIterator();
        System.out.println("Percorrendo a lista com ListIterator:");

        // Usando ListIterator para percorrer a lista
        while (listIterator.hasNext()) {
            String elemento = listIterator.next();
            System.out.println(elemento);
        }
        System.out.println("Percorrendo a lista de trás para frente com ListIterator:");
        // Percorrendo a lista de trás para frente
        while (listIterator.hasPrevious()) {
            String elemento = listIterator.previous();
            System.out.println(elemento);
        }

        /*
         * O ListIterator é uma interface que estende Iterator e permite percorrer uma lista em ambas as direções (para frente e para trás).
         * Ele também fornece métodos adicionais para adicionar, remover e substituir elementos na lista.
         */
    }
}
