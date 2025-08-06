package busca_ordenacao;

public class BuscaBinaria {
  
  public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
    int elementoBuscado = 6;
    
    int indice = buscaBinaria(numeros, elementoBuscado);
    
    if (indice != -1) {
      System.out.println("Elemento " + elementoBuscado + " encontrado no índice: " + indice);
    } else {
      System.out.println("Elemento " + elementoBuscado + " não encontrado.");
    }
  }

  public static int buscaBinaria(int[] array, int elemento) {
    int contador = 0;
    int esquerda = 0;
    int direita = array.length - 1;
    
    while (esquerda <= direita) {
      contador++;
      int meio = esquerda + (direita - esquerda) / 2;
      
      if (array[meio] == elemento) {
        System.out.println("Número de iterações: " + contador);
        return meio; // Retorna o índice do elemento encontrado
      }
      
      if (array[meio] < elemento) {
        esquerda = meio + 1; // Busca na metade direita
      } else {
        direita = meio - 1; // Busca na metade esquerda
      }
    }

    System.out.println("Número de iterações: " + contador);
    
    return -1; // Retorna -1 se o elemento não for encontrado
  }
}
