package curso3.horadapratica3.desafio5;

public class Circulo implements Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = 3.1415 * raio * raio;
        System.out.println(area);
    }
}
