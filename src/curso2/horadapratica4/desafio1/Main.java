package curso2.horadapratica4.desafio1;

public class Main extends ConversorMoeda{
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println("Valor em Reais: " + conversorMoeda.converterDolarParaReal(1000));
    }
}
