package javaoop3.desafios.desafio2;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();
        cachorro1.emitirSom();

        System.out.println();

        gato1.arranharMoveis();
        gato1.emitirSom();
        gato1.gatoAranha();
    }
}
