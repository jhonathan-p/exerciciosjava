package curso3.horadapratica3.desafio6;

public class ContaBancaria {

    private int conta;

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    private double saldo;




    public ContaBancaria(int conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }
}
