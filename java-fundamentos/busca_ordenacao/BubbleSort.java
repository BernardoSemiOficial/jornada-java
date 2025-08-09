package busca_ordenacao;

public class BubbleSort {
  
  public static void main(String[] args) {
    /*
     * Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista,
     * compara elementos adjacentes e os troca se estiverem na ordem errada.
     * O processo é repetido até que a lista esteja ordenada.
     */
    int[] numeros = {64, 34, 25, 12, 22, 11, 90};
    
    System.out.println("Array original:");
    printArray(numeros);
    
    bubbleSort(numeros);
    
    System.out.println("Array ordenado:");
    printArray(numeros);
  }

  public static void bubbleSort(int[] array) {
    int n = array.length;
    boolean trocado;
    
    for (int i = 0; i < n - 1; i++) {
      trocado = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // Troca os elementos
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          trocado = true;
        }
      }
      // Se não houve troca, o array já está ordenado
      if (!trocado) {
        break;
      }
    }
  }

  public static void printArray(int[] array) {
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
