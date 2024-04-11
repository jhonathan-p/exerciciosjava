package curso1.horadapratica;

import java.util.Scanner;

public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    Scanner input = new Scanner(System.in);

    void exibeFichaTecnica() {
        String fichaTecnica = """
                Nome: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Incluído no plano: %s""".formatted(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano);
        System.out.println(fichaTecnica);
    }

    void avalia() {
        System.out.println("Digite uma nota para o filme: ");
        int nota = input.nextInt();
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    void pegaMedia() {
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        System.out.println("A média do filme é: " + media);
    }

}