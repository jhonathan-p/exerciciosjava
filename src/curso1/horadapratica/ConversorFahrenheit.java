package curso1.horadapratica;

public class ConversorFahrenheit {
    public static void main(String[] args) {

        double celsius = 19;
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(fahrenheit);

        int fahrenheitSemDecimais = (int) fahrenheit;

        System.out.println(fahrenheitSemDecimais);

    }
}
