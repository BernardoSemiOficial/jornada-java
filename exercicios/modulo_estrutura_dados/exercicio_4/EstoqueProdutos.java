package exercicios.modulo_estrutura_dados.exercicio_4;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  public static void main(String[] args) {
    Map<String, Integer> estoque = new HashMap<>();

    estoque.put("Arroz", 10);
    estoque.put("Feijão", 5);
    estoque.put("Macarrão", 8);
    estoque.put("Café", 3);

    estoque.put("Feijão", 7);
    estoque.remove("Café");
    System.out.println("Arroz existe no estoque? " + estoque.containsKey("Arroz"));

    for(Map.Entry<String, Integer> item : estoque.entrySet()) {
      System.out.println("Produto: " + item.getKey() + ", Quantidade: " + item.getValue());
    }
  }
}
