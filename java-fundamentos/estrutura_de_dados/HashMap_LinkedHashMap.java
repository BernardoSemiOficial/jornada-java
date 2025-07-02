package estrutura_de_dados;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_LinkedHashMap {
    
    public static void main(String[] args) {
        // Exemplo de uso de Map em Java
        Map<String, Integer> mapa = new HashMap<>();
        
        // Adicionando elementos ao mapa
        mapa.put("D", 30);
        mapa.put("C", 30);
        mapa.put("B", 20);
        mapa.put("A", 10);
        
        // Imprimindo os elementos do mapa
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Verificando o tamanho do mapa
        System.out.println("Tamanho do mapa: " + mapa.size());
        
        // Removendo um elemento do mapa
        mapa.remove("B");
        
        // Imprimindo os elementos após a remoção
        System.out.println("Após remoção:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /*
         * O HashMap é uma implementação do Map que não mantém a ordem de inserção dos elementos.
         * Ele é útil quando você precisa de uma estrutura de dados que permita acesso rápido aos elementos
         * baseado em chaves, mas não se importa com a ordem em que os elementos foram inseridos.
         */

        // Exemplo de uso de LinkedHashMap
        Map<String, Integer> linkedMapa = new LinkedHashMap<>();
        linkedMapa.put("D", 400);
        linkedMapa.put("C", 300);
        linkedMapa.put("B", 200);
        linkedMapa.put("A", 100);

        // Imprimindo os elementos do LinkedHashMap
        System.out.println("LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedMapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /*
         * o LinkedHashMap mantém a ordem de inserção dos elementos, enquanto o HashMap não garante
         * nenhuma ordem específica. Isso significa que, ao iterar sobre um LinkedHashMap,
         * os elementos serão retornados na ordem em que foram inseridos,
         * enquanto a ordem de iteração de um HashMap pode ser diferente a cada execução.
         */
    }
}
