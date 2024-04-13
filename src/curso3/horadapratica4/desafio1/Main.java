package curso3.horadapratica4.desafio1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(42);
        list.add(8);
        list.add(6);
        list.add(2);

        Collections.sort(list);

        System.out.println(list);

    }
}
