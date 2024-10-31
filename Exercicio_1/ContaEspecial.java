package Exercicio_1;

public class ContaEspecial extends ContaBancaria {
	private double limite;

    public ContaEspecial(String cliente, String numeroConta, double saldo, double limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso. (Limite utilizado: R$ %.2f)%n",
                    valor, Math.max(0, valor - saldo));
        } else {
            System.out.println("Saque não permitido: saldo e limite insuficientes.");
        }
    }
}
