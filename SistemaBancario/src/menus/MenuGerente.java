package menus;

import java.io.IOException;
import java.util.Scanner;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import enums.TipoEnum;
import io.Leitores;

public class MenuGerente {
    public static void menuGerente(Conta conta) throws IOException, InterruptedException {
    	Scanner sc = new Scanner(System.in);
        String cabecalho = "║      ♦ ♦ ♦   MENU DO GERENTE   ♦ ♦ ♦      ║";
        String opcao;
        boolean continuar = true;
        do {
            System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
            System.out.println(cabecalho);
            System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
            System.out.println("\n ▓│ 1 ├─ Movimentações da Conta");
            System.out.println("\n ▓│ 2 ├─ Relatórios");
            System.out.println("\n ▓│ 3 ├─ Sair");
            System.out.println("\n Escolha uma das opções acima: ");
            opcao = sc.nextLine();
            switch (opcao) {
                case "1":
                    movimentacoesInformacoesConta(conta);
                    break;
                case "2":
                    relatorios(conta);
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    break;
            }
        } while (continuar);
        sc.close();
    }

    private static void movimentacoesInformacoesConta(Conta conta) throws IOException, InterruptedException {
    	Scanner sc = new Scanner(System.in);
    	String opcao;
        String cabecalho = "║   ♦ ♦ ♦   MOVIMENTAÇÃO DA CONTA   ♦ ♦ ♦   ║";
        boolean continuar = true;
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
                    realizarSaque(conta);
                    Thread.sleep(2000);
                    break;
                case "2":
                    realizarDeposito(conta);
                    Thread.sleep(3000);
                    break;
                case "3":
                    realizarTransferencia(conta);
                    Thread.sleep(3000);
                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    break;
            }
        } while (continuar);
    }

    private static void realizarSaque( Conta conta) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	double valorDoSaque = 0;
		System.out.println("Qual o valor do saque desejado?");
		valorDoSaque = sc.nextDouble();
		sc.nextLine();
		if(valorDoSaque>conta.getSaldo()) {
		System.out.println("Saldo isuficiente");
		}
		else {
		conta.saque(valorDoSaque);
		System.out.println("Seu saldo atual é de R$ " + conta.getSaldo());}
        }


    private static void realizarDeposito(Conta conta) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	double valorDoDeposito = 0;
		System.out.println("Qual o valor do deposito desejado?");
		valorDoDeposito = sc.nextDouble();
		sc.nextLine();
		conta.deposito(valorDoDeposito);
		System.out.println("Seu saldo atual é de R$ " + conta.getSaldo());
		
    }

    private static void realizarTransferencia(Conta conta) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	double valorDaTransferencia = 0;
		System.out.println("Qual o valor desejado para transferencia?");
		valorDaTransferencia = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o numero da conta para qual deseja tranferir?");
		String contaDestino = sc.nextLine();
		conta.transferencia(valorDaTransferencia, Leitores.RetornaConta(contaDestino));
		System.out.println("Seu saldo atual é de R$ " + conta.getSaldo());
    }

    private static void relatorios(Conta conta) throws IOException, InterruptedException {
    	Scanner sc = new Scanner(System.in);
    	String opcao;
        String cabecalho = "║         ♦ ♦ ♦  RELATÓRIOS  ♦ ♦ ♦         ║";
        boolean continuar = true;
        do {
            System.out.println("╔" + "═".repeat(cabecalho.length() - 2) + "╗");
            System.out.println(cabecalho);
            System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝");
            System.out.println("\n ▒ ▓│ 1 ├─ Saldo");
            System.out.println("\n ▒ ▓│ 2 ├─ Relatório de tributação da conta corrente");
            System.out.println("\n ▒ ▓│ 3 ├─ Relatório de Rendimento da poupança");
            System.out.println("\n ▒ ▓│ 4 ├─ Relatório do número de contas na mesma agência");
            System.out.println("\n ▒ ▓│ 5 ├─ Voltar ao menu anterior");
            System.out.println("\n Escolha uma das opções acima: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Saldo: " + conta.getSaldo());
                    Thread.sleep(3000);
                    break;
                case "2":
                    relatorioTributacaoContaCorrente(conta);
                    Thread.sleep(3000);
                    break;
                case "3":
                    relatorioRendimentoPoupanca(sc, conta);
                    Thread.sleep(3000);
                    break;
                case "4":
                    relatorioNumeroContasAgencia(sc, conta);
                    Thread.sleep(3000);
                    break;
                case "5":
                    continuar = false;
                    break;
                default:
                    break;
            }
        } while (continuar);
    }

    private static void relatorioTributacaoContaCorrente(Conta conta) throws IOException {
    	
        if (conta.getTipo() == TipoEnum.CORRENTE) {
            System.out.println("Total gasto em taxas: R$ " + ContaCorrente.TotalTaxas());
            System.out.println("Taxas por operação:");
            System.out.println("Saque: R$0.10");
            System.out.println("Depósito: R$0.10");
            System.out.println("Transferência: R$0.20 (cobrada apenas do remetente)");
        } else {
            System.out.println("Essa operação só pode ser realizada em uma conta corrente.");
        }
    }

    private static void relatorioRendimentoPoupanca(Scanner sc, Conta conta) {
        if (conta instanceof ContaPoupanca) {
            System.out.println("Qual o saldo deseja utilizar na simulação?");
            double valorDoSaldo = sc.nextDouble();
            System.out.println("Qual o número de dias?");
            int dias = sc.nextInt();
            System.out.println("O rendimento da poupança será de R$ " + conta.simulacao(dias,valorDoSaldo) + " após " + dias + " dias.");
        } else {
            System.out.println("Essa operação só pode ser realizada em uma conta poupança.");
        }
    }

    private static void relatorioNumeroContasAgencia(Scanner sc, Conta conta) {
        // Aqui você pode adicionar a lógica para obter o número de contas na mesma agência
        System.out.println("Relatório do número de contas na mesma agência em que este gerente trabalha.");
    }
}
