package pessoas;

import java.io.IOException;

import contas.Conta;

public class Diretor extends Funcionario {

	public Diretor(String senha, String cpf, String NumeroConta, double Saldo) {
		super(senha, cpf, NumeroConta, Saldo);
	}

	@Override
	public String getCargo() {
		return "Diretor";
	}

	@Override
	public String toString() {
		return "Diretor [getSaldo()=" + getSaldo() + ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf()
				+ ", getNumeroConta()=" + getNumeroConta() + "]";
	}

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