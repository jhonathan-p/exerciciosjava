package curso2.horadapratica3.desafio3;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal(double tarifaPorcentagem) {
        saldo -= (saldo * tarifaPorcentagem / 100);
        System.out.println("Tarifa aplicada.");
    }

}
