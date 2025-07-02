package exececoes;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para o saque");
    }
}
