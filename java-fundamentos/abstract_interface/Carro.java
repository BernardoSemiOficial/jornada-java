package abstract_interface;

public class Carro extends Veiculo {
    private boolean temArCondicionado;
    private int numeroPortas;


    public Carro(String marca, boolean temArCondicionado, int numeroPortas) {
        super(marca);
        this.temArCondicionado = temArCondicionado;
        this.numeroPortas = numeroPortas;
    }


    @Override
    void acelerar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acelerar'");
    }


    @Override
    void frear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frear'");
    }

}
