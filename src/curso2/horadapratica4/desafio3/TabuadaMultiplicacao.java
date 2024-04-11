package curso2.horadapratica4.desafio3;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
