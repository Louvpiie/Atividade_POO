package Exercicio_2;

public class Carro extends Veiculo {
	private static final double VALOR_BASE = 20000; // Valor base estimado
    private static final double TAXA_IPVA = 0.04; // 4%

    public Carro(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosDesdeFabricacao = 2024 - getAnoFabricacao(); // Considerando o ano atual
        double valorEstimado = VALOR_BASE - (2000 * anosDesdeFabricacao);
        return valorEstimado > 0 ? valorEstimado * TAXA_IPVA : 0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Carro: %s %s %s, Ano: %d, IPVA: R$ %.2f%n",
                getMarca(), getModelo(), getPlaca(), getAnoFabricacao(), calcularIPVA());
    }
}