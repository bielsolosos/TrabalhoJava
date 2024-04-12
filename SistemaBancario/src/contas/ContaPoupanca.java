package contas;

import java.io.IOException;

import enums.TipoEnum;
import io.Leitores;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}

	public double simulacao(int dias, double valor) {
		return valor+valor*(dias*0.001);
		//rende 0,1% ao dia 
	}
	
	public void saque(double valor) throws IOException {
		this.saldo-=valor;
		Leitores.escritor("teste.txt",-(valor));
	}
	
	public void deposito(double valor) throws IOException {
		this.saldo+=valor;
		Leitores.escritor("teste.txt",+valor);
	}
	
	public void transferencia(double valor, Conta conta) throws IOException{
		saque(valor);
		deposito(valor);
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().POUPANCA;
	}
	
	
}
