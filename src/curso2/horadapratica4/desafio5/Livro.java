package curso2.horadapratica4.desafio5;

public class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.1;
    }
}
