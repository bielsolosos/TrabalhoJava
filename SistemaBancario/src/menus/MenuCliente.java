package menus;

import java.io.IOException;
import java.util.Scanner;

import contas.Conta;
import contas.ContaPoupanca;
import enums.TipoEnum;

public class MenuCliente {
	public static void menuCliente(Scanner sc,Conta conta) throws IOException, InterruptedException {
		String cabecalho = "║      ♦ ♦ ♦   MENU DO CLIENTE   ♦ ♦ ♦      ║";
		String opcao;
		do {
			System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
			System.out.println(cabecalho);
			System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
			System.out.println("\n ▓│ 1 ├─ Movimentações na Conta");
			System.out.println("\n ▓│ 2 ├─ Relatórios");
			System.out.println("\n ▓│ 3 ├─ Sair");
			System.out.println("\n Escolha uma das opções acima: ");
			opcao = sc.nextLine();
			switch (opcao) {
			case "1":
				movimentacoesConta(sc,conta);
				break;
			case "2":
				relatorios(sc,conta);
				break;
			default:
				break;
			}
			sc.close();
		} while (opcao != "3");
	}

	private static void movimentacoesConta(Scanner sc,Conta conta) throws IOException, InterruptedException {
		String opcao;
		String cabecalho = "║   ♦ ♦ ♦   MOVIMENTAÇÃO DE CONTA   ♦ ♦ ♦   ║";
		do {
			System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
			System.out.println(cabecalho);
			System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
			System.out.println("\n ▒ ▓│ 1 ├─ Saque");
			System.out.println("\n ▒ ▓│ 2 ├─ Depósito");
			System.out.println("\n ▒ ▓│ 3 ├─ Transferência para outra conta");
			System.out.println("\n ▒ ▓│ 4 ├─ Voltar ao menu anterior");
			System.out.println("\n Escolha uma das opções acima: ");
			opcao = sc.nextLine();

			switch (opcao) {
			case "1":
				double valorDoSaque = 0;
				System.out.println("Qual o valor do saque desejado?");
				valorDoSaque = sc.nextDouble();
				conta.saque(valorDoSaque);
				System.out.println("Seu saldo atual é de " + conta.getSaldo() + "R$");
				Thread.sleep(2000);
				break;
			case "2":
				double valorDoDeposito = 0;
				System.out.println("Qual o valor do deposito desejado?");
				valorDoDeposito = sc.nextDouble();
				conta.deposito(valorDoDeposito);
				System.out.println("Seu saldo atual é de " + conta.getSaldo() + "R$");
				Thread.sleep(2000);
				break;
			case "3":
				double valorDaTransferencia = 0;
				System.out.println("Qual o valor do deposito desejado?");
				valorDaTransferencia = sc.nextDouble();
				conta.deposito(valorDaTransferencia);
				System.out.println("Seu saldo atual é de " + conta.getSaldo() + "R$");
				Thread.sleep(2000);
				break;
			default:
				break;
			}
		} while (opcao != "4");
	}

	private static void relatorios(Scanner sc,Conta conta) throws IOException, InterruptedException {
		String opcao;
		String cabecalho = "║         ♦ ♦ ♦  RELATÓRIOS  ♦ ♦ ♦         ║";
		do {
			System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
			System.out.println(cabecalho);
			System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
			System.out.println("\n ▒ ▓│ 1 ├─ Saldo");
			System.out.println("\n ▒ ▓│ 2 ├─ Relatório de tributação da conta corrente");
			System.out.println("\n ▒ ▓│ 3 ├─ Relatório de Rendimento da poupança");
			System.out.println("\n ▒ ▓│ 4 ├─ Voltar ao menu anterior");
			System.out.println("\n Escolha uma das opções acima: ");
			opcao = sc.nextLine();

			switch (opcao) {
			case "1":
				conta.getSaldo();
				Thread.sleep(2000);
				break;
			case "2":
				if (conta.getTipo() == TipoEnum.CORRENTE) {
					conta.getHisttoricoOperacoes();
					Thread.sleep(2000);
				} else {
					System.out.println("Essa é uma operação que só pode ser realizada em uma conta corrente");
					Thread.sleep(2000);
				}
				break;
			case "3":
				System.out.println("Qual o saldo deseja utilizar na simulação?");
				double valorDoSaldo = sc.nextDouble();
				System.out.println("Qual o numero de dias?");
				Integer Dias = sc.nextInt();
				if (conta.simulacao(Dias, valorDoSaldo) != 0) {
					System.out.println("O saldo da sua conta será " + conta.simulacao(Dias, valorDoSaldo) + "após "
							+ Dias + "rendendo na conta");
					Thread.sleep(2000);
				} else {
					System.out.println("Essa é uma operação que só pode ser realizada em uma conta poupança");
					Thread.sleep(2000);
				}
				break;
			default:
				break;
			}
		} while (opcao != "4");
	}
}