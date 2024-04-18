package curso4.horadapratica4.desafio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Eu sou a lenda", 2007);
        Titulo titulo1 = new Titulo("V de vingança", 2005);
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo);
        titulos.add(titulo1);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(titulos);
        System.out.println(json);
    }
}
