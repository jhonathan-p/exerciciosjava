package curso2.horadapratica2.desafio3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Tilápia");
        System.out.println("Produto: " + produto1.getNome());

        produto1.setPreco(30);
        System.out.println("Preço: " + produto1.getPreco());

        System.out.println("Preço com desconto: " + produto1.aplicarDesconto(25));

    }
}
