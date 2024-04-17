package pessoas;

import java.io.IOException;

import contas.Conta;

public class Gerente extends Funcionario {
	private String agencia;

	public Gerente(String senha, String cpf, String NumeroConta, double Saldo, String agencia) {
		super(senha, cpf, NumeroConta, Saldo);
		this.agencia = agencia;
	}

	@Override
	public String getCargo() {
		return "Gerente";
	}

	@Override
	public String toString() {
		return "Gerente [agencia=" + agencia + ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString()
				+ ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + "]";
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

	@Override
	public void saque(double valorDoSaque) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	

}