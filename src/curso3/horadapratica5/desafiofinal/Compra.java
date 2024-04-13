package curso3.horadapratica5.desafiofinal;

import java.util.Scanner;

public class Compra extends Cartao implements Comparable<Compra> {
    private String descricaoCompra;
    private double valorCompra;
    int continuarComprando = 1;

    public Compra(double limiteCartao) {
        super.setLimiteCartao(limiteCartao);
    }


    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public void setDescricaoCompra(String descricaoCompra) {
        this.descricaoCompra = descricaoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void comprar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descrição da compra: ");
//        scanner.nextLine(); //se não colocar isso volta String vazia // aqui funciona sem precisar disso, alguma coisa com double
        setDescricaoCompra(scanner.nextLine());
        System.out.print("Valor da compra: ");
        double checkSaldo = (scanner.nextDouble());
        if (getLimiteCartao() >= checkSaldo){
            valorCompra = checkSaldo;
            System.out.println();
            System.out.println("Compra Realizada!");
            setLimiteCartao(getLimiteCartao() - valorCompra);
        } else {
            System.out.println();
            System.out.println("Saldo insuficiente.");
        }
    }


    public void mensagem(){
        Scanner scanner = new Scanner(System.in);
        String mensagem = """
                    
                    Limite atual: %.2f
                    """.formatted(getLimiteCartao());
        System.out.println(mensagem);
        if (getLimiteCartao() == 0) {
            System.out.println("Sem saldo para continuar comprando.");
            System.out.println();
            continuarComprando = 0;
            return;
        }
        System.out.println("1 - Continuar comprando.");
        System.out.println("0 - Sair.");
        System.out.println();
        System.out.print("Opção: ");
        continuarComprando = scanner.nextInt();
        System.out.println();
    }



    @Override
    public String toString() {
        return "Limite: " + getLimiteCartao() + " | Valor da compra: " + getValorCompra() + " | Descrição: " + descricaoCompra;
    }

    @Override
    public int compareTo(Compra o) {
        if (this.valorCompra > o.getValorCompra()) {
            return 1;
        } else if (this.valorCompra < o.getValorCompra()) {
            return -1;
        } else return 0;
    }
}