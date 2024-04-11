package curso2.horadapratica3.desafio3;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setTitular("Yusuke Urameshi");
        System.out.println(conta1.getTitular());

        conta1.depositar(5000);
        conta1.consultarSaldo();
        conta1.sacar(1234);
        conta1.consultarSaldo();
        conta1.sacar(9999);
        conta1.consultarSaldo();

        conta1.cobrarTarifaMensal(2.5);
        conta1.consultarSaldo();


    }

}
