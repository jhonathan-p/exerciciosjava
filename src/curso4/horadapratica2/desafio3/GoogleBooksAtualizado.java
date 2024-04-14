package curso4.horadapratica2.desafio3;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

public class GoogleBooksAtualizado {
    public static void consultaLivro() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um livro para buscar: ");
        String busca = scanner.nextLine().replace(" ", "+");

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        LivroResponse livroResponse = new Gson().fromJson(responseBody, LivroResponse.class);
        List<Livro> livros = livroResponse.getItems();

        if (livros != null) {
            for (Livro livro : livros) {
                System.out.println();
                System.out.println("Título: " + livro.volumeInfo().getTitle());
                System.out.println("Autor: " + livro.volumeInfo().getAuthors().get(0));
                System.out.println("Publicadora: " + livro.volumeInfo().getPublisher());
            }
        } else {
            System.out.println("Nenhum livro encontrado.");
        }
    }
}