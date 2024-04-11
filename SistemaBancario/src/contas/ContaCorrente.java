package contas;

import enums.TipoEnum;
import interfaces.Transacoes;

public class ContaCorrente extends Conta implements Transacoes{

	public ContaCorrente(int senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().CORRENTE;
	}
	
	public void saque(double valor) {
		this.saldo-=valor+0.10;
	}
	
	public void deposito(double valor) {
		this.saldo+=valor-0.10;
	}
		
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
