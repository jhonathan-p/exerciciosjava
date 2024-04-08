public class MainMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Carry On";
        musica1.anoLancamento = 1993;
        musica1.artista = "Angra";
        musica1.exibeFichaTecnica();
        musica1.avaliaMusica();
        musica1.avaliaMusica();
        musica1.avaliaMusica();

        musica1.media();
    }
}
