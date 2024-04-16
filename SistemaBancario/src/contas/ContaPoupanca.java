package contas;

import java.io.IOException;
import java.util.List;

import enums.TipoEnum;
import io.Leitores;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
	}
	@Override
	public double simulacao(int dias, double valor) {
		return valor+valor*(dias*0.001);
		//rende 0,1% ao dia 
	}
	@Override
	public void saque(double valor) throws IOException {
		this.saldo-=valor;
		Leitores.escritor("teste.txt",-(valor));
	}
	@Override
	public void deposito(double valor) throws IOException {
		this.saldo+=valor;
		Leitores.escritor("teste.txt",+valor);
	}
	@Override
	public void transferencia(double valor, Conta conta) throws IOException{
		saque(valor);
		deposito(valor);
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().POUPANCA;
	}

	@Override
	public void getHisttoricoOperacoes(){
		}
	}
