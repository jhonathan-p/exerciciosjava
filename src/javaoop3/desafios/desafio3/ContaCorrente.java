package javaoop3.desafios.desafio3;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal(double tarifaPorcentagem) {
        saldo -= (saldo * tarifaPorcentagem / 100);
        System.out.println("Tarifa aplicada.");
    }

}
