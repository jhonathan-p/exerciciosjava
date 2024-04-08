package javaoop2.desafios.desafio2;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Irineu");
        pessoa1.setIdade(40);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();
    }
}
