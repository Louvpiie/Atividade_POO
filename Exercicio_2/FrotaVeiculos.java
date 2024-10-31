package Exercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrotaVeiculos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Veiculo> frota = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Adicionar Veículo");
            System.out.println("2 - Exibir Todos os Veículos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            if (opcao == 0) {
                break; // Sai do loop e encerra o programa
            }

            switch (opcao) {
                case 1:
                    System.out.print("Escolha o tipo de veículo (1-Carro, 2-Caminhão, 3-Ônibus): ");
                    int tipoVeiculo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada

                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.nextLine();

                    System.out.print("Digite a marca do veículo: ");
                    String marca = scanner.nextLine();

                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite o ano de fabricação do veículo: ");
                    int anoFabricacao = scanner.nextInt();

                    Veiculo veiculo;
                    switch (tipoVeiculo) {
                        case 1:
                            veiculo = new Carro(placa, marca, modelo, anoFabricacao);
                            break;
                        case 2:
                            veiculo = new Caminhao(placa, marca, modelo, anoFabricacao);
                            break;
                        case 3:
                            veiculo = new Onibus(placa, marca, modelo, anoFabricacao);
                            break;
                        default:
                            System.out.println("Tipo de veículo inválido.");
                            continue; // Volta para o início do loop
                    }

                    frota.add(veiculo); // Adiciona o veículo à lista
                    System.out.println("Veículo adicionado com sucesso!\n");
                    break;

                case 2:
                    if (frota.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        System.out.println("\n--- Detalhes dos Veículos da Frota ---");
                        for (Veiculo v : frota) {
                            v.exibirDetalhes();
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}