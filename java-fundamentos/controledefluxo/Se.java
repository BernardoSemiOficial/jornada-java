package controledefluxo;

public class Se {
    
    public static void main(String[] args) {
        
        int numero = 10;

        if(numero == 10) {
            System.out.println("O número é igual a 10.");
        } else if(numero < 10) {
            System.out.println("O número é menor que 10.");
        } else {
            System.out.println("O número é maior que 10.");
        }

        if(numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }


}