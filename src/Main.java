import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        String ultimaOperacao = "Nenhuma operação realizada";

        ArrayList<String> extrato = new ArrayList<>();

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver última operação");
            System.out.println("5 - Ver extrato");
            System.out.println("6 - Transferência");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    mostrarSaldo(conta.saldo);
                    break;

                case 2:
                    conta.depositar(entrada);
                    ultimaOperacao = "Depósito realizado";
                    extrato.add("Depósito de R$ " + conta.ultimoValorOperacao);
                    break;

                case 3:
                    conta.sacar(entrada);
                    ultimaOperacao = "Saque realizado";
                    extrato.add("Saque de R$ " + conta.ultimoValorOperacao);
                    break;

                case 4:
                    System.out.println("Última operação: " + ultimaOperacao);
                    break;

                case 5:

                    for (String operacao : extrato) {
                        System.out.println(operacao);
                    }
                    break;

                case 6:
                    conta.transferir(entrada);
                    ultimaOperacao = "Transferência realizada";
                    extrato.add("Transferência de R$ " + conta.ultimoValorOperacao);
                    break;

                case 7:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }

    }

    public static void mostrarSaldo(double saldo) {
        System.out.println("Seu saldo é: R$ " + saldo + "!");
    }

}

//.