package menus;

import java.io.IOException;
import java.util.Scanner;

import contas.Conta;
import io.Leitores;
import pessoas.Funcionario;

public class MenuPrincipal {
	
	public static void MenuPrincipal() throws IOException {
		Scanner scan = new Scanner(System.in);
		String opcao = "0";
		String Continua = "Continua";
		do {
		System.out.println("\tMe diga sua opção");
		System.out.println("1\tCriar conta");
		System.out.println("2\tLogar na conta");
		System.out.println("0\tEncerrar o Programa");
		opcao = scan.nextLine();
		switch (opcao) {
		case "1":
			Leitores.CriarConta();
			break;
			
		case "2":
			MenuPrincipal.login();
			break;
			
		case "0":
			Continua = "0";
			
		default:
			break;
			}
		
		}while(Continua.equals("Continua"));
		scan.close();
}
	
	
	public static void login() throws IOException {
		Scanner scan = new Scanner(System.in);
		String LoginDigitado = ""; String SenhaDigitada = ""; String Pessoa = "";		
		do {
			System.out.println("Me diga seu CPF: ");
			LoginDigitado = scan.nextLine();
			System.out.println("Me diga sua senha");
			SenhaDigitada = scan.nextLine();
			System.out.println("Digite 1 se você for funcionário ou digite 0 caso cliente! ");
			Pessoa = scan.nextLine();
			
			if(Pessoa.equals("1")) {
				Funcionario conta = Leitores.loginFuncinario(SenhaDigitada, LoginDigitado);
				if(conta != null) {
					//TODO: Menu Funcionário
				}
				else {
					continue;
				}
			}
			else if(Pessoa.equals("0")) {
				Conta conta = Leitores.loginCliente(SenhaDigitada, LoginDigitado);
				if(conta != null) {
					MenuCliente.menuCliente(conta);
				}
				else {
					continue;
				}
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
		scan.close();
	}
}
