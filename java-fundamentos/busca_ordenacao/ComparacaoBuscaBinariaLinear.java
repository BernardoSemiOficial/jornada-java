package busca_ordenacao;

public class ComparacaoBuscaBinariaLinear {
  
  public static void main(String[] args) {
    int[] numeros;
    int elementoBuscado = 6;

    // Gerar um array de números aleatórios
    numeros = new int[1000000];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 1000000); // Números aleatórios entre 0 e 999999
    }

    long inicioBuscaLinear = System.nanoTime();
    int indiceLinear = BuscaLinear.buscaLinear(numeros, elementoBuscado);
    long fimBuscaLinear = System.nanoTime();
    long tempoBuscaLinear = fimBuscaLinear - inicioBuscaLinear;

    long inicioBuscaBinaria = System.nanoTime();
    int indiceBinaria = BuscaBinaria.buscaBinaria(numeros, elementoBuscado);
    long fimBuscaBinaria = System.nanoTime();
    long tempoBuscaBinaria = fimBuscaBinaria - inicioBuscaBinaria;

    System.out.println("Resultado da busca linear: " + (indiceLinear != -1 ? "Elemento encontrado no índice: " + indiceLinear : "Elemento não encontrado"));
    System.out.println("Tempo de execução da busca linear: " + tempoBuscaLinear + " nanosegundos");

    System.out.println("Resultado da busca binária: " + (indiceBinaria != -1 ? "Elemento encontrado no índice: " + indiceBinaria : "Elemento não encontrado"));
    System.out.println("Tempo de execução da busca binária: " + tempoBuscaBinaria + " nanosegundos");
  }

  public static int buscaLinear(int[] array, int elemento) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == elemento) {
        return i; // Retorna o índice do elemento encontrado
      }
    }
    return -1; // Retorna -1 se o elemento não for encontrado
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
