package encapsulamento;

public class ContaBancaria {
    private int conta;
    private double saldo;

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public void deposito(double deposito) {
        if (deposito >= 0) {
            this.saldo = this.saldo + deposito;
        } else {
            System.out.println("Deposito não pode ser negativo.");
        }
    }

    public void saque(double saque) {
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else if (saque < 0) {
            System.out.println("Saque não pode ser negativo.");
        } else {
            this.saldo = this.saldo - saque;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
