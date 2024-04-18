package curso4.horadapratica5.desafiofinal;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViaCEP {
    static void consultaCEP() throws IOException, InterruptedException {
        String cep = "";

        while (cep.length() != 8) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Consultar CEP: ");
                cep = String.valueOf(scanner.nextInt());
                if (cep.length() != 8) {
                    throw new IOException("CEP Inválido.");
                }
                scanner.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
            } catch (Exception e) {
                System.out.println("Erro Fatal.");
            }
        }

        String link = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String body = httpResponse.body();

        Gson gson = new Gson();
        CEP json = gson.fromJson(body, CEP.class);

        if (json.cep() == null){
            System.out.println("CEP não encontrado.");
        } else {
            System.out.println("CEP: " + json.cep());
            System.out.println("Rua: " + json.logradouro());
            System.out.println("Bairro: " + json.bairro());
            System.out.println("Cidade: " + json.localidade());
            System.out.println("Estado: " + json.uf());
        }
    }
}