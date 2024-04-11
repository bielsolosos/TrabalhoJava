package application;

import contas.ContaCorrente;
import contas.ContaPoupanca;

public class SistemaInterno {
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(1234, "cpf do carlos", 22032, "Agencia");
		ContaPoupanca conta2 = new ContaPoupanca(4321, "cpf do ale" , 2321, "Agencia");
		
		System.out.println(conta1.getTipo());
		System.out.println(conta2.getTipo());
		
	}
}
