package javaoop3.desafios.desafio1;

public class Main {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setModelo("Opala");
        carro1.setAno1(21000);
        carro1.setAno2(25000);
        carro1.setAno3(23000);
        carro1.mostraInformacao();
        carro1.mostraMaiorPreco();
        carro1.mostraMenorPreco();

    }
}
