package curso2.horadapratica4.desafio6;

public class Produto implements Vendavel {
    double preco;
    double precoTotal;
    double precoComDesconto;

    @Override
    public void precoTotal(double quantidade) {
        precoTotal = quantidade * preco;
        System.out.println("Preço Total: " + precoTotal);
    }

    @Override
    public void aplicaDesconto() {
        precoComDesconto = precoTotal * 0.85;
        System.out.println("Preço com 15% fixo de desconto: " + precoComDesconto);
    }
}
