package curso2.horadapratica4.desafio6;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Servico servico = new Servico();

        produto.preco = 47;
        System.out.println("Produto");
        produto.precoTotal(10);
        produto.aplicaDesconto();

        System.out.println();
        System.out.println("Serviço");

        servico.preco = 130;

        servico.precoTotal(5);
        servico.aplicaDesconto();

    }
}
