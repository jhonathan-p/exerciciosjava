package javaoop3.desafios.desafio1;

public class Carro {
    private String modelo;
//    private double preco;
//    private double depreciacao = 0.2;
    private double ano1;
    private double ano2;
    private double ano3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

//    public double getPreco() {
//        return preco;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    public double getDepreciacao() {
//        return depreciacao;
//    }
//
//    public void setDepreciacao(double depreciacao) {
//        this.depreciacao = depreciacao;
//    }

    public double getAno1() {
        return ano1;
    }

    public void setAno1(double ano1) {
        this.ano1 = ano1;
    }

    public double getAno2() {
        return ano2;
    }

    public void setAno2(double ano2) {
        this.ano2 = ano2;
    }

    public double getAno3() {
        return ano3;
    }

    public void setAno3(double ano3) {
        this.ano3 = ano3;
    }

    public void mostraInformacao() {
        String informacaoCarro = """
                Modelo = %s
                Preço ano 1: %.2f
                Preço ano 2: %.2f
                Preço ano 3: %.2f
                """.formatted(modelo, ano1, ano2, ano3);
        System.out.println(informacaoCarro);
    }

    public void mostraMaiorPreco() {
        if (ano1 > ano2 && ano1 > ano3) {
            System.out.println("Maior preço: " + ano1);
        } else if (ano2 > ano1 && ano2 > ano3) {
            System.out.println("Maior preço: " + ano2);
        } else {
            System.out.println("Maior preço: " + ano3);
        }
    }

    public void mostraMenorPreco() {
        if (ano1 < ano2 && ano1 < ano3) {
            System.out.println("Menor preço: " + ano1);
        } else if (ano2 < ano1 && ano2 < ano3) {
            System.out.println("Menor preço: " + ano2);
        } else {
            System.out.println("Menor preço: " + ano3);
        }
    }

//    public void depreciaCarro() {
//        ano1 = preco - (preco * depreciacao);
//        ano2 = ano1 - (ano1 * depreciacao);
//        ano3 = ano2 - (ano2 * depreciacao);
//    }
//
//    public void mostraInformacao() {
//        depreciaCarro();
//        String informacaoCarro = """
//                Modelo = %s
//                Preco = %.2f
//                Depreciação = 20%%
//                Preço ano 1: %.2f
//                Preço ano 2: %.2f
//                Preço ano 3: %.2f
//                """.formatted(modelo, preco, ano1, ano2, ano3);
//        System.out.println(informacaoCarro);
//    }
}
