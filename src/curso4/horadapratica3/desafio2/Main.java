package curso4.horadapratica3.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma senha com pelo 8 caracteres: ");
            String senha = scanner.nextLine();
            if (senha.length() < 8) {
                throw new SenhaInvalidaException();
            }
            System.out.println("Senha válida.");
        } catch (SenhaInvalidaException e) {
            System.out.println(e);
        }
    }
}
