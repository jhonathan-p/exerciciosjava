package curso4.horadapratica2.desafio1;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Busuzima", 35, "Japão");
        System.out.println("Pessoa: ");
        System.out.println(pessoa);

        Gson gson = new Gson();
        System.out.println();
        String json = gson.toJson(pessoa);
        System.out.println("JSON: ");
        System.out.println(json);

        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);
        System.out.println();
        System.out.println("fromJson: ");
        System.out.println(pessoa1);

        String teste = """
                {"teste":aaa,"nome":"Jenny","valor1":22.2,"idade":33,"cidade":"Reino Unido","valor2":27}
                """;
        Pessoa pessoa2 = gson.fromJson(teste, Pessoa.class);
        System.out.println();
        System.out.println("fromJson 2: ");
        System.out.println(pessoa2);

    }
}

