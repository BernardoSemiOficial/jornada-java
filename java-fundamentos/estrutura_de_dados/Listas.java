package estrutura_de_dados;

import java.util.ArrayList;

public class Listas {
    // A diferença entre ArrayList e LinkedList em Java é que o ArrayList é baseado em um array dinâmico, enquanto o LinkedList é baseado em uma lista encadeada. O ArrayList oferece acesso rápido aos elementos, mas pode ser menos eficiente para inserções e remoções frequentes, enquanto o LinkedList é mais eficiente para essas operações, mas tem acesso mais lento aos elementos.

    // Desenho do ArrayList:
    // +-------------------+
    // | ArrayList         |
    // +-------------------+
    // | Elemento 1        |
    // | Elemento 2        |    
    // | Elemento 3        |
    // +-------------------+
    // Desenho do LinkedList:
    // +-------------------+
    // | LinkedList        |
    // +-------------------+
    // | Elemento A        |
    // +-------------------+
    // | Elemento B        |
    // +-------------------+
    // | Elemento C        |
    // +-------------------+
    // | Elemento D        |
    // +-------------------+
    // | Elemento E        |
    // +-------------------+
    // Cada elemento do LinkedList aponta para o próximo elemento, formando uma cadeia.
    
    public static void main(String[] args) {

        // Exemplo de uso de listas em Java
        ArrayList<String> lista = new ArrayList<>();
        
        // Adicionando elementos à lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        
        // Imprimindo os elementos da lista
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        
        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
        
        // Removendo um elemento da lista
        lista.remove("Elemento 2");
        
        // Imprimindo os elementos após a remoção
        System.out.println("Após remoção:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

         // Exemplo de uso de listas em Java com LinkedList
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Adicionando elementos à LinkedList
        linkedList.add("Elemento A");
        linkedList.add("Elemento B");
        linkedList.add("Elemento C");

        // Imprimindo os elementos da LinkedList
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }

        // Verificando o tamanho da LinkedList
        System.out.println("Tamanho da LinkedList: " + linkedList.size());

        // Removendo um elemento da LinkedList
        linkedList.remove("Elemento B");

        // Imprimindo os elementos após a remoção
        System.out.println("Após remoção da LinkedList:");  
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }


    }
}
