package curso2.horadapratica3.desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        GeradorPrimo geradorPrimo = new GeradorPrimo();

        System.out.print("Digite um número para verificar se é primo: ");
        verificadorPrimo.verificarSeEhPrimo(input.nextInt());

        System.out.print("Gerar números primos até: ");
        geradorPrimo.gerarProximoPrimo(input.nextInt());

    }
}