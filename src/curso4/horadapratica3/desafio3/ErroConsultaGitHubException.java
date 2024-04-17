package curso4.horadapratica3.desafio3;

public class ErroConsultaGitHubException extends RuntimeException {
    String mensagem = "Usuário não encontrado.";

    @Override
    public String toString() {
        return this.mensagem;
    }
}
