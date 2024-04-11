package contas;

import enums.TipoEnum;

public class ContaCorrente extends Conta{

	public ContaCorrente(int senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}

	
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().CORRENTE;
	}



	@Override
	public String toString() {
		return "ContaCorrente [getTipo()=" + getTipo() + ", getSaldo()=" + getSaldo() + ", getAgencia()=" + getAgencia()
				+ ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + ", toString()=" + super.toString() + "]";
	}
	
	


	
	
}
