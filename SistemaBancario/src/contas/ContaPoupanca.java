package contas;

import enums.TipoEnum;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}

	@Override
	public TipoEnum getTipo() {
		return super.getTipo().POUPANCA;
	}
	
	
}
