package javaoop2.desafios.desafio4;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");
        aluno1.setNota1(10);
        aluno1.setNota2(9);
        aluno1.setNota3(7);
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Média: " + aluno1.calcularMedia());
    }
}
