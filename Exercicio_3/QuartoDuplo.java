package Exercicio_3;

public class QuartoDuplo implements Acomodacao, ServicoAdicional {
	private static final double DIARIA = 180;

    @Override
    public double calcularDiaria() {
        return DIARIA;
    }

    @Override
    public void exibirDetalhes(int dias) {
        System.out.printf("Quarto Duplo: Diária R$ %.2f; Total: R$ %.2f%n", calcularDiaria(), calcularDiaria() * dias);
    }

    @Override
    public double calcularServico(int numeroPessoas, int dias, boolean limpezaExtra, boolean cafeDaManha) {
        double custoServico = 0;
        if (cafeDaManha) {
            custoServico += 20 * numeroPessoas * dias; // Custo do café da manhã
        }
        if (limpezaExtra) {
            custoServico += 30; // Limpeza extra
        }
        return custoServico;
    }
}
