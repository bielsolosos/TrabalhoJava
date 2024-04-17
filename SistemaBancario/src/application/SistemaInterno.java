package application;

import java.io.IOException;

import contas.Conta;
import io.Leitores;

public class SistemaInterno {
	public static void main(String[] args) throws IOException, InterruptedException {
		Conta c1 = Leitores.login("Senha1", "CpfConta1");
		Conta c2 = Leitores.login("Senha2", "CpfConta2");
		Conta c3 = Leitores.login("Senha3", "CpfConta3");
		Conta c4 = Leitores.login("Senha4", "CpfConta4");
		Conta c5 = Leitores.login("Senha5", "CpfConta5");
		Conta c6 = Leitores.login("Senha6", "CpfConta6");
		Conta c7 = Leitores.login("Senha7", "CpfConta7");
		Conta c8 = Leitores.login("Senha8", "CpfConta8");
		Conta c9 = Leitores.login("Senha9", "CpfConta9");
		
		c6.saque(100);
	}
}
