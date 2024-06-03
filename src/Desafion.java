import java.util.Scanner;

public class Desafion {
    public static void main(String[] args) {
        String nome = "Lucas Raineri";
        String tipoConta = "Conta Corrente";
        double saldo = 2200.00;

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Conta corrente " + tipoConta);
        System.out.println("Saldo do cliente: " + saldo);

        System.out.println("Operações: ");

        System.out.println("""
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """);

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Qual a opção desejada?: ");
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja Receber?: ");
                double valorReceber = leitura.nextDouble();
                System.out.println("Voce recebeu: " + valorReceber);
                System.out.println("Seu saldo com o valor recebido ficou de: R$" + (saldo + valorReceber));
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja transferir?: ");
                double valorTransferir = leitura.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    System.out.println("Voce transferiu: " + valorTransferir);
                    System.out.println("Seu saldo depois da trasferencia é de: " + (saldo - valorTransferir));
                    saldo -= valorTransferir;
                }
            }
        }

    }
}

