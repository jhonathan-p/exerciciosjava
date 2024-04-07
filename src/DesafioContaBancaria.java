import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos fazer o seu cadastro no Banco Java.");

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = input.nextDouble();

        String dadosCliente = """
                
                **********************
                Dados do cliente
                
                Nome:  %s
                Saldo: %.2f
                **********************
                """.formatted(nome, saldo);

        String mensagemOperacoes = """
                **********************
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                **********************
                                
                Digite a opção desejada:""";

        System.out.println(dadosCliente);
        int digitoOperacao = 0;

        while (digitoOperacao != 4) {
            System.out.println(mensagemOperacoes);
            digitoOperacao = input.nextInt();

            switch (digitoOperacao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a receber: ");
                    double valorReceber = input.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 3:
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferir = input.nextDouble();
                    if (saldo < valorTransferir){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorTransferir;
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }


    }
}
