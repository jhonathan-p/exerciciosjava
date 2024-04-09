package javaoop3.desafios.desafio4;

public class NumerosPrimos {

    //vamos editar um pouco pra não deixar completamente redundante.
    public boolean verificarPrimalidade(int numero) {
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
            return true;
        } else {
            return false;
        }
    }

    public void listarPrimos(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.print(numero + ", ");
        }
    }
}
