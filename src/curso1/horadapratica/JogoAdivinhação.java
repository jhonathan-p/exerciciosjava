package curso1.horadapratica;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhação {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);

//        System.out.println(numeroSecreto);

        System.out.println("""
                            Bem vindo ao jogo da adivinhação.
                            Você terá 5 tentativas para tentar adivinhar o número secreto.
                            O número secreto está entre 1 e 100. Vamos começar?
                            Digite um número: """);

        for (int i = 4; i >= 0; i--) {

            int numeroDigitado = input.nextInt();

            if (numeroSecreto == numeroDigitado) {
                System.out.println("Você acertou. Parabéns!");
                break;
            } else if (numeroSecreto < numeroDigitado) {
                System.out.println("O número secreto é menor. Tentativas: " + i);
            } else {
                System.out.println("O número secreto é maior. Tentativas: " + i);
            }

            if (numeroSecreto != numeroDigitado && i <= 0) {
                System.out.println("Suas tentativas acabaram. Você o número secreto era: " + numeroSecreto);
            }

        }
    }
}
