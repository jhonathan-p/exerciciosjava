package curso3.horadapratica1.desafios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tony Ramos");
        pessoa.setIdade(75);

        System.out.print("toString: ");
        System.out.println(pessoa.toString());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Spider Man");
        pessoa1.setIdade(35);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Joana d'Arc");
        pessoa2.setIdade(19);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println();
        System.out.println(listaDePessoas);

        System.out.println();
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println();
        System.out.println("Índice 0, método get(): " + listaDePessoas.get(0));

        System.out.println();
        System.out.println("Imprimindo a lista completa: " + listaDePessoas.toString());

    }
}