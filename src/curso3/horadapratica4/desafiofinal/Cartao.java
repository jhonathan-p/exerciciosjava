package curso3.horadapratica4.desafiofinal;

import java.util.Scanner;

public class Cartao {
    private double limiteCartao;

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public void inicia(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        setLimiteCartao(scanner.nextDouble());
    }

    @Override
    public String toString() {
        return "Limite: " + limiteCartao;
    }
}