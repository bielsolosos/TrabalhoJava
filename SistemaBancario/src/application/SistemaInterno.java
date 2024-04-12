package application;
import io.Leitores;

import java.io.IOException;

import contas.ContaCorrente;
import contas.ContaPoupanca;
import io.Leitores;

public class SistemaInterno {
	public static void main(String[] args) throws IOException {
		ContaCorrente conta1 = new ContaCorrente(1234, "cpf do carlos", 22000, "Agencia");
		ContaPoupanca conta2 = new ContaPoupanca(4321, "cpf do ale" , 2000, "Agencia");
		conta1.transferencia(100, conta2);
		System.out.println(conta2.getSaldo());
		System.out.println(conta1.getSaldo());
		conta1.saque(100);
		System.out.println(conta1.getSaldo());
		conta1.deposito(100);
		System.out.println(conta1.getSaldo());
		conta2.saque(100);
		System.out.println(conta2.getSaldo());
		conta2.deposito(100);
		System.out.println(conta2.getSaldo());
	}
}
