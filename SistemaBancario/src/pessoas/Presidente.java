package pessoas;

import java.io.IOException;

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

	@Override
	public void saque(double valorDoSaque) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposito(double valor) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferencia(double valor, Conta conta) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getHisttoricoOperacoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double simulacao(int dias, double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}