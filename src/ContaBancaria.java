import java.util.Scanner;

public class ContaBancaria {

    double saldo = 1000;

    double limiteSaque = 1000;

    double ultimoValorOperacao;

    public void depositar(Scanner entrada) {

        System.out.print("Digite o valor do depósito: ");
        double deposito = entrada.nextDouble();

        this.ultimoValorOperacao = deposito;

        if (deposito > 0) {

            this.saldo = this.saldo + deposito;

            System.out.println("Depósito realizado!");

        } else {

            System.out.println("Valor inválido!");
        }

    }

    public void sacar(Scanner entrada) {

        System.out.print("Digite o valor do saque: ");
        double saque = entrada.nextDouble();

        this.ultimoValorOperacao = saque;

        if (saque > 0 && saque <= saldo && saque <= limiteSaque) {

            this.saldo = this.saldo - saque;

            System.out.println("Saque realizado!");

        } else {

            System.out.println("Saldo insuficiente, valor inválido ou limite excedido!");
        }

    }

    public void transferir(Scanner entrada) {

        System.out.print("Digite o valor da transferência: ");
        double transferencia = entrada.nextDouble();

        this.ultimoValorOperacao = transferencia;

        if (transferencia > 0 && transferencia <= saldo) {

            this.saldo = this.saldo - transferencia;

            System.out.println("Transferência realizada!");

        } else {

            System.out.println("Saldo insuficiente ou valor inválido!");
        }

    }
}
