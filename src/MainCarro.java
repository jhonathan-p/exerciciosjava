public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Monza";
        carro1.ano = 1990;
        carro1.cor = "Azul";

        carro1.exibeFichaTecnica();
        carro1.exibeIdadeCarro();
    }
}
