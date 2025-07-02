package exececoes;

public class ValorNegativoException extends Exception {
    
    public ValorNegativoException() {
        super("Valor negativo para depósito ou saque não é permitido");
    }
}
