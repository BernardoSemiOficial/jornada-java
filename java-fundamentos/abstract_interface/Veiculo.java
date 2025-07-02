package abstract_interface;

public abstract class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }
    
    public void ligar() {
        System.out.println("Veículo ligado.");
        System.out.println("A marca é " + marca);
    }

    abstract void acelerar(); // Método abstrato que deve ser implementado pelas subclasses
    abstract void frear(); // Outro método abstrato
}
