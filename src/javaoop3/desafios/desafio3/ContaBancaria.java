package javaoop3.desafios.desafio3;

public class ContaBancaria {

    private String titular;
    protected double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo = valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }

    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

}
