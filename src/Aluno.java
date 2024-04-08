public class Aluno {
    String nome;
    int idade;

    void exibeDadosAluno(){
        String dadosAluno = """
                Nome: %s
                Idade: %d
                """.formatted(nome, idade);
        System.out.println(dadosAluno);
    }
}
