package menus;

import java.io.IOException;
import java.util.Scanner;

import contas.Conta;
import contas.ContaPoupanca;
import enums.TipoEnum;

public class MenuCliente {
	public static void menuCliente(Conta conta) throws IOException {
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
				movimentacoesConta(conta);
				break;
			case "2":
				relatorios(conta);
				break;
			case "3":
				MenuPrincipal.MenuPrincipal();
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void movimentacoesConta(Conta conta) throws IOException {
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
				if(conta.getTipo() == TipoEnum.POUPANCA) {
					conta.saque(valorDoSaque);
					System.out.println("Seu saldo atual é de "+conta.getSaldo()+"R$");
				}
				else {
					conta.saque(valorDoSaque);
					System.out.println("Seu saldo atual é de "+conta.getSaldo()+"R$");
				}
				break;
			case "2":
				double valorDoDeposito = 0;
				System.out.println("Qual o valor do deposito desejado?");
				valorDoDeposito = sc.nextDouble();
				if(conta.getTipo() == TipoEnum.POUPANCA) {
					conta.deposito(valorDoDeposito);
					System.out.println("Seu saldo atual é de "+conta.getSaldo()+"R$");
				}
				else {
					conta.deposito(valorDoDeposito);
					System.out.println("Seu saldo atual é de "+conta.getSaldo()+"R$");
				}
				break;
			case "3":
				double valorDaTransferencia = 0;
				System.out.println("Qual o valor do deposito desejado?");
				valorDaTransferencia = sc.nextDouble();
				if(conta.getTipo() == TipoEnum.POUPANCA) {
					conta.deposito(valorDaTransferencia);
					System.out.println("Seu saldo atual é de "+conta.getSaldo()+"R$");
				}
				else {
					conta.deposito(valorDaTransferencia);
					System.out.println("Seu saldo atual é de "+conta.getSaldo()+"R$");
				}
				break;
			case "4":
				menuCliente(conta);
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void relatorios(Conta conta) throws IOException {
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
				conta.getSaldo();
				break;
			case "2":
				if(conta.getHisttoricoOperacoes()!= null) {
					System.out.println(conta.getHisttoricoOperacoes());
				}
				else {
					System.out.println("Essa é uma operação que só pode ser realizada em uma conta corrent");
				}
				break;
			case "3":
				System.out.println("Qual o saldo deseja utilizar na simulação?");
				double valorDoSaldo = sc.nextDouble();
				System.out.println("Qual o numero de dia?");
				Integer Dias = sc.nextInt();
				if(conta.simulacao(Dias, valorDoSaldo) != 0) {
					System.out.println(conta.simulacao(Dias, valorDoSaldo));
				}
				else {
					System.out.println("Essa é uma operação que só pode ser realizada em uma conta poupança");
				}
				break;
			case "4":
				menuCliente(conta);
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}