package curso4.horadapratica4.desafio4;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Volkswagen", "Fusca", 1959);
        Veiculo veiculo1 = new Veiculo("Ford", "Landau", 1967);
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo);
        veiculos.add(veiculo1);
        Gson gson = new Gson();
        String json = gson.toJson(veiculos);
        System.out.println(json);
    }
}
