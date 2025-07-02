package abstract_interface;

public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String marca, String cilindrada) {
        super(marca);
        this.cilindrada = cilindrada;
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
