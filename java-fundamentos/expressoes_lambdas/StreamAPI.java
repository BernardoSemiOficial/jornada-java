package expressoes_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
  
  public static void main(String[] args) {
    
    List<String> produtos = Arrays.asList("Notebook", "Smartphone", "Tablet", "Monitor", "Teclado");
    ArrayList<String> produtosFiltrados = new ArrayList<>();

    for(String produto : produtos) {
      if(produto.startsWith("N")) {
        produtosFiltrados.add(produto);
      }
    }

    System.out.println(produtosFiltrados);

    produtos.stream().forEach(System.out::println);

    List<String> produtosFiltrados2 = produtos.stream().filter(p -> p.startsWith("N")).collect(Collectors.toList());
    System.out.println(produtosFiltrados2);

    List<Integer> produtosCaracteres = produtos.stream().map(p -> p.length()).collect(Collectors.toList());
    System.out.println(produtosCaracteres);

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    Integer produtosQuantidade = numeros.stream().reduce(0, Integer::sum);
    System.out.println(produtosQuantidade);
    
    
    List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 9, 10, 10);
    List<Integer> filtrados = numeros1.stream().distinct().collect(Collectors.toList());
    System.out.println(filtrados);

    boolean temNotebook = produtos.stream().anyMatch(p -> p.startsWith("N"));
    boolean todosTemA = produtos.stream().allMatch(p -> p.contains("a"));
    boolean nenhumBernardo = produtos.stream().noneMatch(p -> p.startsWith("Bernardo"));
    System.out.println("Tem notebook? " + temNotebook);
    System.out.println("Todos tem a? " + todosTemA);
    System.out.println("Nenhum bernardo? " + nenhumBernardo);
  }
}
