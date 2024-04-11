package curso1.horadapratica;

import java.util.Scanner;

public class HoraDaPraticaTres {
    public static void main(String[] args) {

        //desafio 1
        Scanner inputDesafio1 = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo: ");
        int numero = inputDesafio1.nextInt();
        if (numero == 0) {
            System.out.println("Você digitou 0.");
        } else if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        } else {
            System.out.println("O número digitado é negativo.");
        }

        //desafio 2
        Scanner inputDesafio2 = new Scanner(System.in);
        System.out.println("Escreva um número inteiro:");
        int num1 = inputDesafio2.nextInt();
        System.out.println("Escreva outro número inteiro:");
        int num2 = inputDesafio2.nextInt();
        if (num1 == num2) {
            System.out.println("Os números digitados são iguais.");
        } else {
            System.out.println("Os números digitados são diferentes.");
        }
        if (num1 > num2) {
            System.out.println("O primeiro número digitado é maior que o segundo.");
        } else if (num1 < num2) {
            System.out.println("O segundo número digitado é maior que o primeiro.");
        }

        //desafio 3
        Scanner inputDesafio3 = new Scanner(System.in);
        System.out.println("1. Calcular área do quadrado.");
        System.out.println("2. Calcular área do círculo.");
        System.out.println("Sua escolha: ");
        int escolha = inputDesafio3.nextInt();
        if (escolha == 1){
            System.out.println("Você escolheu calcular a área de um quadrado.");
            System.out.println("Digite o tamanho do primeiro lado: ");
            double medida1 = inputDesafio3.nextDouble();
            System.out.println("Digite o tamanho do segundo lado: ");
            double medida2 = inputDesafio3.nextDouble();
            double areaQuadrado = medida1 * medida2;
            System.out.println("A área do quadrado é: " + areaQuadrado);
        } else if (escolha == 2) {
            System.out.println("Você escolheu calcular a área de um círculo.");
            System.out.println("Digite o raio: ");
            double raio = inputDesafio3.nextDouble();
            double areaCirculo = 3.1415 * (raio * raio);
            System.out.println("A área do círculo é: " + areaCirculo);
        } else {
            System.out.println("Opção inválida.");
        }

        //desafio 4
        Scanner inputDesafio4 = new Scanner(System.in);
        System.out.println("Escolha um número para que seja exibida sua tabuada: ");
        int numTabuada = inputDesafio4.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(numTabuada + " * " + i + " = " + (numTabuada * i));
        }

        //desafio 5
        Scanner inputDesafio5 = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numDesafio5 = inputDesafio5.nextInt();
        int parOuImpar = numDesafio5 % 2;
        if (parOuImpar == 1) {
            System.out.println("O número digitado é ímpar.");
        } else {
            System.out.println("O número digitado é par.");
        }

        //desafio 6
        Scanner inputDesafio6 = new Scanner(System.in);
        System.out.println("Digite um número para que seja calculado o fatorial: ");
        int numDesafio6 = inputDesafio6.nextInt();
        double resultado = 1;
        for (int i = 1; i <= numDesafio6; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial de " + numDesafio6 + " é: " + resultado);

    }
}
