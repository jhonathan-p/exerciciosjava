package curso3.horadapratica2.desafios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Tomate", 0.45, 4);
        Produto produto1 = new Produto("Alface", 2.99, 1);
        Produto produto2 = new Produto("Maionese", 12.50, 1);
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2));

        System.out.println(listaDeProdutos);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 2.99, 12, "11/04/2025");
        listaDeProdutos.add(produtoPerecivel);

        System.out.println(produtoPerecivel);
        System.out.println(listaDeProdutos);
        System.out.println(listaDeProdutos.get(3));

    }
}
