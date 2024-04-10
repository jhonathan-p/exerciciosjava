package javaoop4.desafios.desafio6;

public class Servico implements Vendavel {
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
        precoComDesconto = precoTotal * 0.7;
        System.out.println("Preço com 30% fixo desconto: " + precoComDesconto);
    }
}
