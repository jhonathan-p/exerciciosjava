package curso2.horadapratica3.desafio4;

public class VerificadorPrimo extends NumerosPrimos {

    //Isso aqui é completamente redundante, mas vou editar um pouco pra deixar diferente do outro método.
    public void verificarSeEhPrimo(int numero) {
        int divisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
                if (divisores > 2) {
                    break;
                }
            }
        }
        if (divisores == 2) {
            System.out.println(numero + " é número primo.");
        } else {
            System.out.println(numero + " não é número primo.");
        }
    }
}