package curso4.horadapratica1.desafio3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDB {
    public static void consultaReceita() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite -1 para receita aleatória ou");
        System.out.print("Digite uma prato para procurar a receita: ");
        String busca = scanner.nextLine().replace(" ", "+");
        String endereco;

        if (busca.equals("-1")) {
            endereco = "https://www.themealdb.com/api/json/v1/1/random.php";
        } else {
            endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        System.out.println(responseBody);
    }
}

//https://www.themealdb.com/api.php