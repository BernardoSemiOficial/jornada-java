package busca_ordenacao;

public class InsertionSort {
  
  public static void main(String[] args) {
    /*
     * Insertion Sort é um algoritmo de ordenação que constrói a lista ordenada
     * um elemento de cada vez, inserindo cada novo elemento na posição correta
     * em relação aos elementos já ordenados.
     */
    int[] numeros = {64, 34, 25, 12, 22, 11, 90};
    
    System.out.println("Array original:");
    printArray(numeros);
    
    insertionSort(numeros);
    
    System.out.println("Array ordenado:");
    printArray(numeros);
  }

  public static void insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int chave = array[i];
      int j = i - 1;
      
      // Move os elementos do array[0..i-1], que são maiores que a chave,
      // para uma posição à frente de sua posição atual
      while (j >= 0 && array[j] > chave) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = chave;
    }
  }

  public static void printArray(int[] array) {
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
