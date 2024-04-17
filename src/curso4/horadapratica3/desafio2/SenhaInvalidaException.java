package curso4.horadapratica3.desafio2;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem = "A senha deve conter pelo menos 8 caracteres.";

    @Override
    public String toString() {
        return mensagem;
    }
}
