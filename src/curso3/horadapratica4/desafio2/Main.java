package curso3.horadapratica4.desafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Titulo> list = new ArrayList<>();
        Titulo titulo = new Titulo("Pedra");
        Titulo titulo1 = new Titulo("Remo");
        Titulo titulo2 = new Titulo("Barco");
        Titulo titulo3 = new Titulo("Navio");

        list.add(titulo);
        list.add(titulo1);
        list.add(titulo2);
        list.add(titulo3);

        list.sort(Comparator.comparing(Titulo::getNome));
        System.out.println(list);

        list.sort(Titulo::compareTo);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}
