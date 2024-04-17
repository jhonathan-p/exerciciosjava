package curso4.horadapratica3.desafio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Dividir por: ");
            double numero2 = scanner.nextDouble();
            if (numero2 == 0) {
                throw new ArithmeticException("Impossível dividir por Zero.");
            }
            double divisao = numero1 / numero2;
            System.out.println(divisao);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Digite números válidos.");
        }
    }
}