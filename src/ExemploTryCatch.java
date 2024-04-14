import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int numero = 0;
            System.out.print("Digite um número inteiro: ");
            try {
                numero = scanner.nextInt();
                System.out.println("Você digitou: " + numero);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Certifique-se de digitar um número inteiro.");
            }
            if (numero == -1){
                break;
            }
        }
    }
}