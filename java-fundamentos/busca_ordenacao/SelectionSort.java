package busca_ordenacao;

public class SelectionSort {
  
  public static void main(String[] args) {
    int[] numeros = {64, 34, 25, 12, 22, 11, 90};
    
    System.out.println("Array original:");
    printArray(numeros);
    
    selectionSort(numeros);
    
    System.out.println("Array ordenado:");
    printArray(numeros);
  }

  public static void selectionSort(int[] array) {
    int n = array.length;
    
    for (int i = 0; i < n - 1; i++) {
      // Encontra o índice do menor elemento no subarray não ordenado
      int indiceMenor = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[indiceMenor]) {
          indiceMenor = j;
        }
      }
      
      // Troca o menor elemento encontrado com o primeiro elemento do subarray não ordenado
      if (indiceMenor != i) {
        int temp = array[i];
        array[i] = array[indiceMenor];
        array[indiceMenor] = temp;
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
