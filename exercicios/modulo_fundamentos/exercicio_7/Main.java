package exercicios.modulo_fundamentos.exercicio_7;

public class Main {
  
  public static void main(String[] args) {
    Carro carro1 = new Carro("Volkwagen", "Gol", 2015);

    carro1.acelerar();
    carro1.acelerar();
    carro1.frear();

    carro1.exibirInformacoes();
  }
}
