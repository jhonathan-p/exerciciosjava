//Criado apenas para referência futura. Desafio já feito anteriormente.
package curso2.horadapratica2.extra;
public class PrincipalCopiaAlura {
    public static void main(String[] args) {
        FilmeCopiaAlura favorito = new FilmeCopiaAlura();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
    }

}