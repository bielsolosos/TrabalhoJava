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
	public void saque(double valor) {
		// TODO Auto-generated method stub
		super.saque(valor+0.10);
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		super.deposito(valor-0.10);
	}

	@Override
	public void transferencia(double valor, Conta conta){
		this.saldo-=valor+0.20;
		conta.saldo+=valor;
	}

	@Override
	public String toString() {
		return "ContaCorrente [getTipo()=" + getTipo() + ", getSaldo()=" + getSaldo() + ", getAgencia()=" + getAgencia()
				+ ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + ", toString()=" + super.toString() + "]";
	}

}
