package Exercicio_2;

public class Caminhao extends Veiculo{
	private static final double VALOR_BASE = 50000; // Valor base estimado
    private static final double TAXA_IPVA = 0.015; // 1.5%

    public Caminhao(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosDesdeFabricacao = 2024 - getAnoFabricacao();
        double valorEstimado = VALOR_BASE - (5000 * anosDesdeFabricacao);
        return valorEstimado > 0 ? valorEstimado * TAXA_IPVA : 0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Caminhão: %s %s %s, Ano: %d, IPVA: R$ %.2f%n",
                getMarca(), getModelo(), getPlaca(), getAnoFabricacao(), calcularIPVA());
    }
}