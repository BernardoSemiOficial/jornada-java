package heranca_polimorfismo;

public class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }
    
    public void ligar() {
        System.out.println("Veículo ligado.");
        System.out.println("A marca é " + marca);
    }
}
