package contas;

import java.io.IOException;

import enums.TipoEnum;
import interfaces.Transacoes;
import io.Leitores;

public class ContaCorrente extends Conta implements Transacoes{

	public ContaCorrente(String senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().CORRENTE;
	}
	
	public void saque(double valor) throws IOException {
		this.saldo-=valor+0.10;
		Leitores.escritor("teste.txt",-(valor+0.10));
		Leitores.escritor("teste.txt",0.10);
	}
	
	public void deposito(double valor) throws IOException {
		this.saldo+=valor-0.10;
		Leitores.escritor("teste.txt",+(valor-0.10));
		Leitores.escritor("teste.txt",0.10);
	}
		
	public void transferencia(double valor, Conta conta) throws IOException{
		this.saldo-=valor+0.20;
		conta.saldo+=valor;
		Leitores.escritor("teste.txt",-(valor+0.20));
		Leitores.escritor("teste.txt",+valor);
		Leitores.escritor("teste.txt",0.20);
	}
	

	@Override
	public String toString() {
		return "ContaCorrente [getTipo()=" + getTipo() + ", getSaldo()=" + getSaldo() + ", getAgencia()=" + getAgencia()
				+ ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + ", toString()=" + super.toString() + "]";
	}

}
