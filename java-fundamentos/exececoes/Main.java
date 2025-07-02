package exececoes;

public class Main {
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        // Definindo o número da conta
        conta.setConta(12345);
        
        // Exibindo os dados da conta
        System.out.println("Número da Conta: " + conta.getConta());
        System.out.println("Saldo: " + conta.getSaldo());

        try {
            // Realizando um deposito da conta
            conta.deposito(1000.00);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Realizando um saque da conta
            conta.saque(200.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
