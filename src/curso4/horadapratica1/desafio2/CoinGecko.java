package curso4.horadapratica1.desafio2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    public static void consultaCripto() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma criptomoeda para saber sua cotação atual em R$: ");
        String cripto = scanner.nextLine().replace(" ", "+");
        String key = "xx-xxxxxxxxxxxxxxxxxxxxxxxx";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?ids="+ cripto + "&vs_currencies=brl"))
                .header("accept", "application/json")
                .header("x-cg-demo-api-key", key)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        System.out.println(responseBody);
    }
}