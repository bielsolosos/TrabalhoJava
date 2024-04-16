package application;

import java.io.IOException;
import java.util.Scanner;

import contas.Conta;
import contas.ContaPoupanca;
import menus.MenuCliente;
import menus.MenuPrincipal;

public class SistemaInterno {
	public static void main(String[] args) throws IOException, InterruptedException {
		

//			 Conta conta0 = Leitores.loginCliente("123", "cpf");
//			 Funcionario Conta1 = Leitores.loginFuncinario("Senha", "Cepefe");
//			 Funcionario Conta2 = Leitores.loginFuncinario("Senha1", "Cepefe1");
//			 System.out.println(conta0.toString() + "\n");
//			 System.out.println(Conta1.toString() + "\n");
//			 System.out.println(Conta2.toString() + "\n");
		Conta conta = new ContaPoupanca("123", "01102203300", "0123", 1000, "0122");
		MenuPrincipal.MenuPrincipal();
		Scanner sc = new Scanner(System.in);
		//MenuCliente.menuCliente(sc, conta);
		
		
//				

//	
//
	}
}
