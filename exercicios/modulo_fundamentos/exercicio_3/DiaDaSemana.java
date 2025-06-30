package exercicios.modulo_fundamentos.exercicio_3;

public class DiaDaSemana {
  
  public static void main(String[] args) {
    int dia = 7;

    switch(dia) {
      case 1:
        System.err.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
      case 4:
        System.out.println("Quarta-feira");
        break;
      case 5:
        System.out.println("Quinta-feira");
        break;
      case 6:
        System.out.println("Sexta-feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Valor inválido. Digite um número de 1 a 7.");
    }


  }
}
