package exercicios.modulo_estrutura_dados.exercicio_8;

public class ConversaoWrapper {
  public static void main(String[] args) {
    Integer numero = 42;
    Double preco = 19.99;
    Boolean ativo = true;

    System.out.println("Número: " + String.valueOf(numero));
    System.out.println("Preço: " + preco.intValue());
    System.out.println("Ativo: " + String.valueOf(ativo));

    Integer soma = numero + 10;
    System.out.println("Soma: " + soma);

    System.out.println("42 igual a 10? " + numero.equals(10));
  }
}
