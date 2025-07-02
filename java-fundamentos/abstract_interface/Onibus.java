package abstract_interface;

public class Onibus implements VeiculoContrato {
    private String marca;
    private int capacidadePassageiros;

    public Onibus(String marca, int capacidadePassageiros) {
        this.marca = marca;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public void ligar() {
        System.out.println("Ônibus " + marca + " ligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Ônibus " + marca + " acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Ônibus " + marca + " freando.");
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    
}
