package curso4.horadapratica4.desafio1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("arquivo.txt");
            fileWriter.write("Conteúdo a ser gravado no arquivo.");
            fileWriter.close();
            System.out.println("Arquivo gravado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro.");
        }
    }
}