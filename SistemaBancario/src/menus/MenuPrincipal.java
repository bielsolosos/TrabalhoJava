package menus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import contas.Conta;
import enums.TipoEnum;
import io.Leitores;

public class MenuPrincipal {
	public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    
    public static List<Conta> cadastroGeral = new ArrayList<>();
    

	
	public static void MenuPrincipal() throws IOException, InterruptedException {
		String opcao = "0";		
		String cabecalho = "║      ♦ ♦ ♦   MENU PRINCIPAL   ♦ ♦ ♦      ║";
		boolean continuar = true;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println(CYAN +"╔" + "═".repeat(cabecalho.length() - 2) + "╗");
		System.out.println(cabecalho);
		System.out.println("╚" + "═".repeat(cabecalho.length() - 2) + "╝"+ RESET);
		System.out.println("\n ▓│ 1 ├─ Criar Conta");
		System.out.println("\n ▓│ 2 ├─ Loga na Conta");
		System.out.println("\n ▓│ 3 ├─ Encerrar o Programa");		
		System.out.println("\n *** Escolha uma das opções acima *** ");	
		
		opcao = scan.nextLine();
		switch (opcao) {
		case "1":
			Leitores.CriarConta();
			break;
			
		case "2":
			MenuPrincipal.login(scan);
			break;
			
		case "3":
			continuar = false;			
			System.out.println("\n*** OBRIGADO E VOLTE SEMPRE ***");
			
			break;
			
		default:
			break;
			}
		
		}while(continuar);
		scan.close();
}
	
	
	public static void login(Scanner scan) throws IOException, InterruptedException {
		String LoginDigitado = ""; String SenhaDigitada = "";
		do {
			System.out.println("Me diga seu CPF: ");
			LoginDigitado = scan.nextLine();
			System.out.println("Me diga sua senha");
			SenhaDigitada = scan.nextLine();
			Conta conta = Leitores.login(SenhaDigitada, LoginDigitado);
			if(conta.getTipo().equals(TipoEnum.POUPANCA) || conta.getTipo().equals(TipoEnum.CORRENTE)) {
				MenuCliente.menuCliente(scan,conta);
			}else if(conta.getTipo() == TipoEnum.GERENTE || conta.getTipo() == TipoEnum.DIRETOR || conta.getTipo() == TipoEnum.PRESIDENTE) {				
				MenuGerente.menuGerente(conta);
			}
			else {
				System.out.println("Senha e/ou Login inválidos!\n ");
				System.out.println("Gostaria de tentar novamente? (s/n)");
				String Verifica = scan.nextLine();
				if(Verifica.equalsIgnoreCase("s")) {
					continue;
				}else {
					break;
				}
			}
		}while(true);
	}
}
