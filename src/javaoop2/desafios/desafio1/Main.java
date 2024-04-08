package javaoop2.desafios.desafio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Naruto";
        conta1.setNumeroConta(1245);
        conta1.setSaldo(950);
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
    }
}
