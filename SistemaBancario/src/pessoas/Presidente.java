package pessoas;

import contas.CapitalBanco;
import contas.Conta;

public class Presidente extends Funcionario{

	public Presidente(String senha, String cpf, String NumeroConta, double Saldo) {
		super(senha, cpf, NumeroConta, Saldo);
	}

	@Override
	public String getCargo() {
		return "Presidente";
	}


	
	
	@Override
	public String toString() {
		return "Presidente ["
				+ "getSaldo()=" + getSaldo() + ", getSenha()=" + getSenha()
				+ ", getCpf()=" + getCpf() + ", getNumeroConta()=" + getNumeroConta() + "]";
	}

	@Override
	 public double calcularCapitalTotal() {
	        double capitalTotal = 0;
	        for (Conta conta : CapitalBanco.contas) {
	            capitalTotal += conta.getSaldo();
	        }
	        return capitalTotal;
	    }
	//TODO: isso aqui está errado, tem que ser um leitor a partir do arquivo!!! 
	//Ou no menu fazermos ele ler todo o menu e por em um hashmap ass: Gabs
	
	
}