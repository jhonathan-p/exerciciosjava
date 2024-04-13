package curso3.horadapratica4.desafio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(arrayList);
        System.out.println(linkedList);

        List<List> listaPolimorfica;            //WTF?
        listaPolimorfica = new ArrayList<>();
//        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add(arrayList);
        listaPolimorfica.add(linkedList);
        System.out.println(listaPolimorfica);

    }
}
