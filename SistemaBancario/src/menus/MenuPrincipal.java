package menus;

import java.io.IOException;
import java.util.Scanner;

import contas.ContaPoupanca;
import io.Leitores;

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
}
	
	
	
	
	
	
	
	
	
	public static void login() {
		Scanner scan = new Scanner(System.in);
		String LoginDigitado = ""; String SenhaDigitada = "";		
		do {
			System.out.println("Me diga seu CPF: ");
			LoginDigitado = scan.nextLine();
			System.out.println("Me diga sua senha");
			SenhaDigitada = scan.nextLine();
			
			//TODO: atributos mocados, deverão ser scaneados pela classe leitor e comparar para ver se bate com login e senha digitados
			ContaPoupanca conta2 = new ContaPoupanca("4321", "CPF do Ale" , 2000, "Agencia");
			String Login = conta2.getCpf();
			String Senha = conta2.getSenha();
			if(Login.equals(LoginDigitado) && Senha.equals(SenhaDigitada)) {
				//Essa parte aqui a gente vai colocar os menu para chamar diretor e etc
			}
			else {
				System.out.println("Senha e/ou Login inválidos!\n ");
				System.out.println("Gostaria de tentar novamente? (s/n)");
				String Verifica = scan.nextLine();
				if(Verifica.equalsIgnoreCase("")) {
					continue;
				}else {
					break;
				}
			}
		}while(true);
	}
}
