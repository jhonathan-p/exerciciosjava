public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual = 2024;

    void exibeFichaTecnica() {
        String fichaTecnica = """
                Modelo: %s
                Ano: %d
                Cor: %s
                """.formatted(modelo, ano, cor);
        System.out.println(fichaTecnica);
    }

    void exibeIdadeCarro(){
        int idadeCarro = anoAtual - ano;
        System.out.println("O carro tem " + idadeCarro + " anos.");
    }
}
