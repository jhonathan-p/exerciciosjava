package curso1.horadapratica;

public class MainFilme {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "A volta dos que não foram";
        filme1.anoDeLancamento = 1970;
        filme1.duracaoEmMinutos = 180;
        filme1.incluidoNoPlano = true;
        filme1.exibeFichaTecnica();
        filme1.avalia();
        filme1.avalia();
        filme1.avalia();
        filme1.pegaMedia();
    }
}
