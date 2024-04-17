package curso4.horadapratica3.desafio3;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Github {
    public static void github() throws IOException, InterruptedException {
//        String key = "xxx_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um usuário do GitHub: ");
        String busca = scanner.nextLine().replace(" ", "+");
        String endereco = "https://api.github.com/users/" + busca;  //esse users com "s" me fez perder um tempão
//        String endereco = "https://api.github.com/users/jhonathan-p";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .header("Accept", "application/vnd.github+json") //só assim já funciona
//                .header("Authorization", "Bearer " + key)
//                .header("X-GitHub-Api-Version", "2022-11-28")
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        Gson gson = new Gson();
        try {
            UsuarioGithub usuarioGithubList = gson.fromJson(responseBody, UsuarioGithub.class);
            if (usuarioGithubList.login() == null){
                throw new ErroConsultaGitHubException();
            }
            System.out.println();
            System.out.println("Nome: " + usuarioGithubList.name());
            System.out.println("User: " + usuarioGithubList.login());
            System.out.println("Link: " + usuarioGithubList.html_url());
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e);
        }
    }
}
