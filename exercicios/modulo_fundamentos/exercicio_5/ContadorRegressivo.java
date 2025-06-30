package exercicios.modulo_fundamentos.exercicio_5;

public class ContadorRegressivo {
  
  public static void main(String[] args) {
    int numero = 10;

    while(numero >= 1) {
      System.out.println(numero);
      try {
        Thread.sleep(1000); // Pausa de 1 segundo
      } catch (InterruptedException e) {
        System.err.println("Erro ao pausar a execução: " + e.getMessage());
      }
      numero--;
    }

    System.err.println("Fim da contagem regressiva!");
  }
}
