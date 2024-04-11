package application;

import contas.ContaCorrente;
import contas.ContaPoupanca;

public class SistemaInterno {
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(1234, "cpf do carlos", 22000, "Agencia");
		ContaPoupanca conta2 = new ContaPoupanca(4321, "cpf do ale" , 2000, "Agencia");
		
		conta1.transferencia(100, conta2);
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		conta1.saque(100);
		conta2.deposito(100);
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(conta2.simulacao(100,1000));
	}
}
