package Exercicio_1;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String cliente, String numeroConta, double saldo) {
        super(cliente, numeroConta, saldo);
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.printf("Novo saldo após rendimento: R$ %.2f%n", saldo);
    }
}
