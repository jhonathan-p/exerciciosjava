package curso2.horadapratica4.desafio1;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar /= 5.1;
    }
}
