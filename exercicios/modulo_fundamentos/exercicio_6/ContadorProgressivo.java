package exercicios.modulo_fundamentos.exercicio_6;

public class ContadorProgressivo {
  
  public static void main(String[] args) {
    int contador = 1;

    do {
      System.out.println(contador);
      contador++;
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.err.println("Erro ao pausar a execução: " + e.getMessage());
      }
    } while(contador <= 5);

    System.out.println("Contagem progressiva concluída!");
  }
}
