package curso2.horadapratica4.desafio2;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        System.out.print("A áréa é: ");
        System.out.println(calculadoraSalaRetangular.calcularArea(5, 7));

        System.out.print("O perímetro é: ");
        System.out.println(calculadoraSalaRetangular.calcularPerimetro(5, 7));

    }
}
