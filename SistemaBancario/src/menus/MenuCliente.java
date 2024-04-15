package menus;

import java.io.IOException;
import java.util.Scanner;

import contas.Conta;

public class MenuCliente {
	public static void menuCliente() throws IOException {
		Scanner sc = new Scanner(System.in);
		String cabecalho = "║      ♦ ♦ ♦   MENU DO CLIENTE   ♦ ♦ ♦      ║";

		while (true) {
			System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
			System.out.println(cabecalho);
			System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
			System.out.println("\n ▓│ 1 ├─ Movimentações na Conta");
			System.out.println("\n ▓│ 2 ├─ Relatórios");
			System.out.println("\n ▓│ 3 ├─ Sair");
			System.out.println("\n Escolha uma das opções acima: ");
			String opcao = sc.nextLine();

			switch (opcao) {
			case "1":
				movimentacoesConta();
				break;
			case "2":
				relatorios();
				break;
			case "3":
				MenuPrincipal.MenuPrincipal();
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void movimentacoesConta() throws IOException {
		Scanner sc = new Scanner(System.in);

		String cabecalho = "║   ♦ ♦ ♦   MOVIMENTAÇÃO DE CONTA   ♦ ♦ ♦   ║";
		while (true) {
			System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
			System.out.println(cabecalho);
			System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
			System.out.println("\n ▒ ▓│ 1 ├─ Saque");
			System.out.println("\n ▒ ▓│ 2 ├─ Depósito");
			System.out.println("\n ▒ ▓│ 3 ├─ Transferência para outra conta");
			System.out.println("\n ▒ ▓│ 4 ├─ Voltar ao menu anterior");
			System.out.println("\n Escolha uma das opções acima: ");
			String opcao = sc.nextLine();

			switch (opcao) {
			case "1":
				double valorDoSaque = 0;
				System.out.println("Qual o valor do saque desejado?");
				valorDoSaque = sc.nextDouble();
				
				break;
			case "2":
				
				break;
			case "3":
				// TODO Lógica para realizar transferência
				break;
			case "4":
				menuCliente();
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void relatorios() throws IOException {
		Scanner sc = new Scanner(System.in);
		String cabecalho = "║         ♦ ♦ ♦  RELATÓRIOS  ♦ ♦ ♦         ║";
		while (true) {
			System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
			System.out.println(cabecalho);
			System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
			System.out.println("\n ▒ ▓│ 1 ├─ Saldo");
			System.out.println("\n ▒ ▓│ 2 ├─ Relatório de tributação da conta corrente");
			System.out.println("\n ▒ ▓│ 3 ├─ Relatório de Rendimento da poupança");
			System.out.println("\n ▒ ▓│ 4 ├─ Voltar ao menu anterior");
			System.out.println("\n Escolha uma das opções acima: ");
			String opcao = sc.nextLine();

			switch (opcao) {
			case "1":
				// Lógica para imprimir saldo na tela
				break;
			case "2":
				// Lógica para imprimir relatório de tributação
				break;
			case "3":
				// Lógica para imprimir relatório de rendimento da poupança
				break;
			case "4":
				menuCliente();
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}