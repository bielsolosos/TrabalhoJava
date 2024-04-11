package contas;

import enums.TipoEnum;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}

	public double simulacao(int dias, double valor) {
		return valor+valor*(dias*0.001);
		//rende 0,1% ao dia 
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().POUPANCA;
	}
	
	
}
