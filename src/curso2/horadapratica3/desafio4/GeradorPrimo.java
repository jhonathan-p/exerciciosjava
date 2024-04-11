package curso2.horadapratica3.desafio4;

public class GeradorPrimo extends NumerosPrimos {

    public void gerarProximoPrimo(int numero) {
        for (int i = 1; i <= numero; i++) {
            listarPrimos(i);
        }
    }
}
