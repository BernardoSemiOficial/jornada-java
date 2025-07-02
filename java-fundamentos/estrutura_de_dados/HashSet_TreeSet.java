package estrutura_de_dados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_TreeSet {
    
    public static void main(String[] args) {
        
        Set<String> conjuntoHashSet = new HashSet<String>();
        conjuntoHashSet.add(null);
        conjuntoHashSet.add("Elemento 4");
        conjuntoHashSet.add("Elemento 3");
        conjuntoHashSet.add("Elemento 2");
        conjuntoHashSet.add("Elemento 2");
        conjuntoHashSet.add("Elemento 1");
        conjuntoHashSet.add("Elemento 1");
        conjuntoHashSet.remove("Elemento 1");
        System.out.println("Conjunto Set: " + conjuntoHashSet);
        System.out.println(conjuntoHashSet.contains("Elemento 1"));

        /*
         * O Set é uma coleção que não permite elementos duplicados e não mantém a ordem de inserção.
         * Ele é útil quando você precisa garantir que não haja duplicatas em sua coleção.
         * 
         */


        Set<String> conjuntoTreeSet = new TreeSet<String>();
        // conjuntoTreeSet.add(null); // TreeSet não permite elementos nulos
        // A TreeSet é uma implementação do Set que mantém os elementos ordenados de acordo com
        // a ordem natural dos elementos ou de acordo com um comparador fornecido.
        // Ela não permite elementos duplicados e não aceita valores nulos.
        conjuntoTreeSet.add("Elemento 5");
        conjuntoTreeSet.add("Elemento 4");
        conjuntoTreeSet.add("Elemento 3");
        conjuntoTreeSet.add("Elemento 3");
        conjuntoTreeSet.add("Elemento 2");
        conjuntoTreeSet.add("Elemento 2");
        conjuntoTreeSet.add("Elemento 1");
        conjuntoTreeSet.add("Elemento 1");
        conjuntoTreeSet.remove("Elemento 1");
        System.out.println("Tamanho: " + conjuntoTreeSet.size());
        System.out.println("Conjunto TreeSet: " + conjuntoTreeSet);
    }
}
