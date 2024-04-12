package curso3.horadapratica3.desafio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("Ameno");
        lista.add("Dorime");
        lista.add("Latiremo");

        System.out.println("lista");
        System.out.println(lista);

        System.out.println();
        System.out.println("for-each");
        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Lambda");
        lista.forEach(nome -> System.out.println(nome));

        System.out.println();
        System.out.println("method reference");
        lista.forEach(System.out::println);

    }
}
