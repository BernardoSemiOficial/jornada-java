package exercicios.modulo_fundamentos.exercicio_7;

public class Carro {
  String marca;
  String modelo;
  int ano;
  int velocidade = 0;

  public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void acelerar() {
    this.velocidade += 10;
  }

  public void frear() {
    if(this.velocidade <= 10) {
      this.velocidade = 0;
    } else {
      this.velocidade -= 10;
    }
  }

  public void exibirInformacoes() {
    System.err.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano + ", Velocidade: " + this.velocidade + " km/h");
  }
}
