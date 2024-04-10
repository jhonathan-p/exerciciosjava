package javaoop4.desafios.desafio1;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar /= 5.1;
    }
}
