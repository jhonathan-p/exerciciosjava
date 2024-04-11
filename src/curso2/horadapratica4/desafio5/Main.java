package curso2.horadapratica4.desafio5;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();

        System.out.println("Preço do livro atualizado: " + livro.calcularPrecoFinal(123));
        System.out.println("Preço do produto atualizado: " + produtoFisico.calcularPrecoFinal(123));

    }
}
