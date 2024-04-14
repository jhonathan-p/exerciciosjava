package curso4.horadapratica1.desafio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void consultaLivro() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um livro para busca: ");
        String busca = scanner.nextLine().replace(" ", "+");

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        System.out.println(responseBody);
    }
}