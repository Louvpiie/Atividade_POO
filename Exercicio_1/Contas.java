package Exercicio_1;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancaria conta1 = new ContaBancaria("Alice", "001", 500.0);
        ContaPoupanca conta2 = new ContaPoupanca("Bob", "002", 1000.0);
        ContaEspecial conta3 = new ContaEspecial("Carlos", "003", 200.0, 300.0);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Calcular novo saldo da poupança");
            System.out.println("4 - Mostrar dados da conta");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.print("Informe o número da conta (001, 002 ou 003): ");
            String numeroConta = scanner.next();

            ContaBancaria contaSelecionada = null;
            if (numeroConta.equals("001")) {
                contaSelecionada = conta1;
            } else if (numeroConta.equals("002")) {
                contaSelecionada = conta2;
            } else if (numeroConta.equals("003")) {
                contaSelecionada = conta3;
            } else {
                System.out.println("Conta inválida.");
                continue;
            }

            switch (opcao) {
                case 1: // Sacar
                    System.out.print("Informe o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    contaSelecionada.sacar(valorSaque);
                    break;

                case 2: // Depositar
                    System.out.print("Informe o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    contaSelecionada.depositar(valorDeposito);
                    break;

                case 3: // Calcular novo saldo da poupança
                    if (contaSelecionada instanceof ContaPoupanca) {
                        System.out.print("Informe a taxa de rendimento: ");
                        double taxaRendimento = scanner.nextDouble();
                        ((ContaPoupanca) contaSelecionada).calcularNovoSaldo(taxaRendimento);
                    } else {
                        System.out.println("Apenas contas poupança podem calcular novo saldo.");
                    }
                    break;

                case 4: // Mostrar dados da conta
                    System.out.println(contaSelecionada.mostrarDados());
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
