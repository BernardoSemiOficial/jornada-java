package exercicios.modulo_poo.exercicio_4;

public class Main {

  public static void main(String[] args) {
    System.out.println("Valor de PI: " + MatematicaUtil.PI);
    System.out.println("Dobro de 5: " + MatematicaUtil.dobrar(5));

    MatematicaUtil mat = new MatematicaUtil();
    System.out.println("Triplo de 5: " + mat.triplicar(5));
    mat.saudacao();
  }
}
