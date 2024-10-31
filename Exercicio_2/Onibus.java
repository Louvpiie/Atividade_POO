package Exercicio_2;

public class Onibus extends Veiculo {
	private static final double VALOR_BASE = 80000; // Valor base estimado
    private static final double TAXA_IPVA = 0.02; // 2%

    public Onibus(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosDesdeFabricacao = 2024 - getAnoFabricacao();
        double valorEstimado = VALOR_BASE - (3000 * anosDesdeFabricacao);
        return valorEstimado > 0 ? valorEstimado * TAXA_IPVA : 0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Ônibus: %s %s %s, Ano: %d, IPVA: R$ %.2f%n",
                getMarca(), getModelo(), getPlaca(), getAnoFabricacao(), calcularIPVA());
    }
}