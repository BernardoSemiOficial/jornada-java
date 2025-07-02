package heranca_polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Renault", true, 4);
        carro.ligar();
        
        Moto moto = new Moto("Honda", "150cc");
        moto.ligar();


        // Exemplo de polimorfismo
        Veiculo veiculo1 = new Carro("Fiat", false, 2);
        Veiculo veiculo2 = new Moto("Yamaha", "250cc");
        veiculo1.ligar();
        veiculo2.ligar();
    }   
}