package exercicios.modulo_poo.exercicio_2;

public class Retangulo implements Forma {
  double largura;
  double altura;

  public Retangulo(double largura, double altura) {
    this.altura = altura;
    this.largura = largura;
  }

  @Override
  public double calcularArea() {
    return largura * altura;  
  }

  @Override
  public double calcularPerimetro() {
    return 2 * (largura + altura);
  }

}
