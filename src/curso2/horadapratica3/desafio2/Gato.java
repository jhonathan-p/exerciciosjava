package curso2.horadapratica3.desafio2;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Meow!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando móveis como se não houvesse amanhã!");
    }

    public void gatoAranha() {
        System.out.println("O gato aranha subiu pelas paredes.");
    }

}