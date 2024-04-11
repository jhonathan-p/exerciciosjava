package curso2.horadapratica4.desafio4;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.celsiusParaFahrenheit(24);
        System.out.println();
        conversorTemperaturaPadrao.fahrenheitParaCelsius(75.2);
    }
}
