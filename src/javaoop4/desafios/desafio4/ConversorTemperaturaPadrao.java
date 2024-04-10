package javaoop4.desafios.desafio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        System.out.println("Para converter Celsius para Fahrenheit usamos a fórmula: (C * 1.8) + 32");
        System.out.println(temperatura + " Celsius para Fahrenheit é " + ((temperatura * 1.8) + 32));
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        System.out.println("Para converter Fahrenheit para Celsius usamos a fórmula: (F - 32) * 5 / 9");
        System.out.println(temperatura + " Fahrenheit para Celsius é " + ((temperatura - 32) * 5 / 9));
    }

}
