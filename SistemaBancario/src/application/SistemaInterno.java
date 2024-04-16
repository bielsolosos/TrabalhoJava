package application;
import java.io.IOException;

import contas.Conta;
import io.Leitores;
import pessoas.Funcionario;

public class SistemaInterno {
		 public static void main(String[] args) throws IOException, InterruptedException {
			 
			 Conta conta0 = Leitores.loginCliente("123", "cpf");
			 Funcionario Conta1 = Leitores.loginFuncinario("Senha", "Cepefe");
			 Funcionario Conta2 = Leitores.loginFuncinario("Senha1", "Cepefe1");
			 System.out.println(conta0.toString() + "\n");
			 System.out.println(Conta1.toString() + "\n");
			 System.out.println(Conta2.toString() + "\n");

			 //MenuPrincipal.MenuPrincipal();
			 //MenuPrincipal.MenuPrincipal();
			 			 
//				ContaCorrente conta1 = new ContaCorrente("123", "02201103322", 0, "0122");
//				ContaCorrente conta2 = new ContaCorrente("123", "01201412563", 0, "022");
//				conta1.deposito(300);
//				conta1.saque(20);
//
//				conta1.transferencia(120, conta2);
//				System.out.println(conta1.getSaldo());
//				System.out.println(conta1);
//
//				System.out.println(conta1.getHisttoricoOperacoes());
//				System.out.println(conta2.getHisttoricoOperacoes());
			 
			 
			// System.out.println();
		/* ContaCorrente conta1 = new ContaCorrente(1234, "CPF do Carlos", 22000, "Agencia");
		 ContaPoupanca conta2 = new ContaPoupanca(4321, "CPF do Ale" , 2000, "Agencia");
		
		 CapitalBanco.contas.add(conta1);
	     CapitalBanco.contas.add(conta2);
	     
	     Funcionario g = new Gerente (7894, "CPF do Maycon", "Agencia" );
	     Funcionario d = new Diretor (8521, "CPF do Erik");
	     Funcionario p = new Presidente (9456, "CPF do Marcelo");
	     
	     
	     System.out.println("Capital total é: " + p.calcularCapitalTotal());
	     System.out.println(g.calcularCapitalTotal());
	     */
	    
	     
//		conta1.transferencia(100, conta2);
//		System.out.println(conta2.getSaldo());
//		System.out.println(conta1.getSaldo());
//		conta1.saque(100);
//		System.out.println(conta1.getSaldo());
//		conta1.deposito(100);
//		System.out.println(conta1.getSaldo());
//		conta2.saque(100);
//		System.out.println(conta2.getSaldo());
//		conta2.deposito(100);
//		System.out.println(conta2.getSaldo());
//
	}
}
	