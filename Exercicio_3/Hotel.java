package Exercicio_3;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a acomodação:");
        System.out.println("1 - Quarto Simples");
        System.out.println("2 - Quarto Duplo");
        System.out.println("3 - Suíte");
        int opcao = scanner.nextInt();

        System.out.print("Quantidade de dias: ");
        int dias = scanner.nextInt();

        System.out.print("Número de pessoas: ");
        int numeroPessoas = scanner.nextInt();

        System.out.print("Deseja limpeza extra? (sim/não): ");
        String respostaLimpeza = scanner.next().trim().toLowerCase();
        boolean limpezaExtra = respostaLimpeza.equals("sim");

        System.out.print("Deseja café da manhã? (sim/não): ");
        String respostaCafe = scanner.next().trim().toLowerCase();
        boolean cafeDaManha = respostaCafe.equals("sim");

        Acomodacao acomodacao = null;

        switch (opcao) {
            case 1:
                acomodacao = new QuartoSimples();
                break;
            case 2:
                acomodacao = new QuartoDuplo();
                break;
            case 3:
                acomodacao = new Suite();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        double custoDiaria = acomodacao.calcularDiaria() * dias;
        double custoServicos = ((ServicoAdicional) acomodacao).calcularServico(numeroPessoas, dias, limpezaExtra, cafeDaManha);
        double custoTotal = custoDiaria + custoServicos;

        acomodacao.exibirDetalhes(dias);
        System.out.printf("Custo de Serviços Adicionais: R$ %.2f%n", custoServicos);
        System.out.printf("Custo Total: R$ %.2f%n", custoTotal);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
