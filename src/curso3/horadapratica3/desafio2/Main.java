package curso3.horadapratica3.desafio2;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Sif");
        System.out.println(cachorro.getClass());

        Animal animal = (Animal) cachorro;
        System.out.println(animal.getClass());

        System.out.println(cachorro);
        System.out.println(animal);

        Animal animal1 = new Cachorro("Pluto");
        System.out.println(animal1.getClass());

        if (animal1 instanceof Cachorro) {
            System.out.println("É instância de Cachorro");
            Cachorro cachorro1 = (Cachorro) animal1;
            System.out.println(cachorro1);
            System.out.println(cachorro1.getClass());
        }

    }
}
