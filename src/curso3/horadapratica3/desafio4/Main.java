package curso3.horadapratica3.desafio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto = new Produto("Leite Tirol", 3.99);
        Produto produto1 = new Produto("Leite Italac", 2.69);
        Produto produto2 = new Produto("Leite Aurora", 2.99);

        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);

        for (Produto item : produtos) {
            System.out.println(item.getNome() + " " + item.getPreco());
        }



    }
}
