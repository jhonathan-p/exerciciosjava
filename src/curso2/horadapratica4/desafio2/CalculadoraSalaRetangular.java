package curso2.horadapratica4.desafio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return 2 * (altura + largura);
    }

}