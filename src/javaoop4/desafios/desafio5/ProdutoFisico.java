package javaoop4.desafios.desafio5;

public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.2;
    }
}
