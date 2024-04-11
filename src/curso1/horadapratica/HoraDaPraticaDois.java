package curso1.horadapratica;

public class HoraDaPraticaDois {
    public static void main(String[] args) {

        //desafio 1
        double notaUm = 7;
        double notaDois = 9;
        double mediaNotas = (notaUm + notaDois) / 2;
        System.out.println("A média das notas é: " + mediaNotas);

        //desafio 2
        double varDouble = 13.7;
        int varInt = (int) varDouble;
        System.out.println("double convertido em int: " + varInt);

        //desafio 3
        char desafioTresChar = 'J';
        String desafioTresString = "honathan";
        System.out.println("Concatenação de char + String: " + desafioTresChar + desafioTresString);

        //desafio 4
        double precoProduto = 4.99;
        int quantidade = 4;
        System.out.println("Preço total: " + precoProduto * quantidade);

        //desafio 5
        double valorEmDolares = 65;
        double cambioDolar = 4.94;
        double dolarParaReal = valorEmDolares * cambioDolar;
        System.out.println("USD$ " + valorEmDolares + " equivale a R$ " + dolarParaReal);

        //desafio 6
        double precoOriginal = 80;
        double percentualDesconto = 10;
        double valorDesconto = precoOriginal * percentualDesconto / 100;
        System.out.println("Valor do desconto: " + valorDesconto);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("Preço com desconto: " + precoComDesconto);

    }
}
