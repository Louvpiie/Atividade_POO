package Exercicio_1;

public class ContaBancaria {
	protected String cliente;
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String cliente, String numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saque não permitido: saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public String mostrarDados() {
        return String.format("Cliente: %s, Conta: %s, Saldo: R$ %.2f", cliente, numeroConta, saldo);
    }
}
