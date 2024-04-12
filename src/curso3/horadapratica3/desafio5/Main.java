package curso3.horadapratica3.desafio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        ArrayList<Forma> formas = new ArrayList<>();
//        System.out.print("Lado do Quadrado: ");
//        Circulo circulo = new Circulo(scanner.nextDouble());

        Circulo circulo = new Circulo(24);
        Quadrado quadrado = new Quadrado(24);

//        System.out.print("Raio do circulo: ");
//        Quadrado quadrado = new Quadrado(scanner.nextDouble());

        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
//            System.out.print("Area do " + forma.getClass() + ": ");
            System.out.print("Area: ");
            forma.calcularArea();
        }



    }
}
