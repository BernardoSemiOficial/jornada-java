package busca_ordenacao;

public class BuscaLinear {
  
  public static void main(String[] args) {
    int[] numeros = {5, 3, 8, 6, 2, 7, 4, 1};
    int elementoBuscado = 6;
    
    int indice = buscaLinear(numeros, elementoBuscado);
    
    if (indice != -1) {
      System.out.println("Elemento " + elementoBuscado + " encontrado no índice: " + indice);
    } else {
      System.out.println("Elemento " + elementoBuscado + " não encontrado.");
    }
  }

  public static int buscaLinear(int[] array, int elemento) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == elemento) {
        return i; // Retorna o índice do elemento encontrado
      }
    }
    return -1; // Retorna -1 se o elemento não for encontrado
  }
}
