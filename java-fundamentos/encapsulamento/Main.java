package encapsulamento;

public class Main {
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        // Definindo o número da conta
        conta.setConta(12345);
        
        // Exibindo os dados da conta
        System.out.println("Número da Conta: " + conta.getConta());
        System.out.println("Saldo: " + conta.getSaldo());

        // Realizando um deposito da conta
        conta.deposito(1000.00);

        // Realizando um saque da conta
        conta.saque(200.00);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
