package curso1.horadapratica;

import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    Scanner input = new Scanner(System.in);

    void exibeFichaTecnica() {
        String fichaTecnica = """
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                """.formatted(titulo, artista, anoLancamento);
        System.out.println(fichaTecnica);
    }

    void avaliaMusica() {
        System.out.print("Dê sua nota para a música: ");
        avaliacao += input.nextDouble();
        numAvaliacoes++;
    }

    void media() {
        System.out.println("A média das avaliações é: " + (avaliacao / numAvaliacoes));
    }
}
