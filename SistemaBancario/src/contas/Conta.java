package contas;

import java.io.IOException;
import java.util.List;

import enums.TipoEnum;
import pessoas.Cliente;

public abstract class Conta extends Cliente {
	protected double saldo;
	private String agencia;
	private TipoEnum tipo;
		
	public Conta(String senha, String cpf, String NumeroConta, double saldo, String agencia, TipoEnum tipo) {
		super(senha, cpf, NumeroConta);
		this.saldo = saldo;
		this.agencia = agencia;
		this.tipo = tipo;
	}


	public Conta(String senha, String cpf, String NumeroConta, double saldo, String agencia) {
		super(senha, cpf, NumeroConta);
		this.saldo = saldo;
		this.agencia = agencia;
	}

	

	public Conta(String senha, String cpf, String NumeroConta, double saldo) {
		super(senha, cpf, NumeroConta);
		this.saldo = saldo;
	}


	public TipoEnum getTipo() {
		return tipo;
	}
	
	public String getAgencia() {
		return agencia;
	}



	public double getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", tipo=" + tipo + ", getSenha()=" + getSenha()
				+ ", getCpf()=" + getCpf() + ", getNumeroConta()=" + getNumeroConta() + "]";
	}


	public abstract void saque(double valorDoSaque) throws IOException;

	public abstract void deposito(double valor) throws IOException; 

	public abstract void transferencia(double valor, Conta conta) throws IOException;



	public abstract void getHisttoricoOperacoes();



	public abstract double simulacao(int dias, double valor);
	

}