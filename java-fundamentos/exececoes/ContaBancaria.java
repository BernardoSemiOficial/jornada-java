package exececoes;

public class ContaBancaria {
    private int conta;
    private double saldo;

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public void deposito(double deposito) throws ValorNegativoException {
        if (deposito >= 0) {
            this.saldo = this.saldo + deposito;
        } else {
            throw new ValorNegativoException();
        }
    }

    public void saque(double saque) throws SaldoInsuficienteException, ValorNegativoException {
        if (saque > this.saldo) {
            throw new SaldoInsuficienteException();
        } else if (saque < 0) {
            throw new ValorNegativoException();
        } else {
            this.saldo = this.saldo - saque;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
