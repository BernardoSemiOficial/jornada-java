package heranca_polimorfismo;

public class Carro extends Veiculo {
    private boolean temArCondicionado;
    private int numeroPortas;


    public Carro(String marca, boolean temArCondicionado, int numeroPortas) {
        super(marca);
        this.temArCondicionado = temArCondicionado;
        this.numeroPortas = numeroPortas;
    }

}
