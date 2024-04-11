package contas;

import enums.TipoEnum;
import pessoas.Cliente;

public abstract class Conta extends Cliente {
	private double saldo;
	private String agencia;
	private TipoEnum tipo;
	


	public Conta(int senha, String cpf, double saldo, String agencia, TipoEnum tipo) {
		super(senha, cpf);
		this.saldo = saldo;
		this.agencia = agencia;
		this.tipo = tipo;
	}
	
	

	public Conta(int senha, String cpf, double saldo, String agencia) {
		super(senha, cpf);
		this.saldo = saldo;
		this.agencia = agencia;
	}



	public TipoEnum getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	
}