package curso3.horadapratica3.desafio6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1, 1223);
        ContaBancaria contaBancaria1 = new ContaBancaria(2, 312.5);
        ContaBancaria contaBancaria2 = new ContaBancaria(3, 6540);
        ContaBancaria contaBancaria3 = new ContaBancaria(4, 425.6);

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(contaBancaria);
        contas.add(contaBancaria1);
        contas.add(contaBancaria2);
        contas.add(contaBancaria3);

        double maiorSaldo = 0;

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }

        System.out.println("Maior saldo: " + maiorSaldo);

    }
}
