package contas;

import java.io.IOException;
import java.util.List;

import enums.TipoEnum;
import interfaces.Transacoes;
import pessoas.Cliente;

public abstract class Conta extends Cliente {
	protected double saldo;
	private String agencia;
	private TipoEnum tipo;
	


	public Conta(String senha, String cpf, double saldo, String agencia, TipoEnum tipo) {
		super(senha, cpf);
		this.saldo = saldo;
		this.agencia = agencia;
		this.tipo = tipo;
	}
	
	

	public Conta(String senha, String cpf, double saldo, String agencia) {
		super(senha, cpf);
		this.saldo = saldo;
		this.agencia = agencia;
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



	public abstract void saque(double valorDoSaque) throws IOException;

	public abstract void deposito(double valor) throws IOException; 

	public abstract void transferencia(double valor, Conta conta) throws IOException;



	public abstract List<String> getHisttoricoOperacoes();



	public abstract double simulacao(int dias, double valor);
	

}
