package exercicios.modulo_poo.exercicio_2;

public class Main {
  
  public static void main(String[] args) {
    Forma retangulo = new Retangulo(5, 5);
    Forma circulo = new Circulo(5);

    System.out.println("Área do Retângulo: " + retangulo.calcularArea());
    System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

    System.out.println("Área do Círculo: " + circulo.calcularArea());
    System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
  }
}
