package contas;

import java.io.IOException;
import java.util.List;

import enums.TipoEnum;
import io.Leitores;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String senha, String cpf, String NumeroConta, double saldo, String agencia) {
		super(senha, cpf, NumeroConta, saldo, agencia); 
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
	public void transferencia(double valor, Conta contaDestino) throws IOException{
		if (this != contaDestino) {
			this.saldo-=valor+0.20;			
			contaDestino.saldo+=valor;
			Leitores.escritor("teste.txt",-(valor+0.20));
			Leitores.escritor("teste.txt",+valor);
			Leitores.escritor("teste.txt",0.20);
			
			
		}
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().POUPANCA;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [getAgencia()=" + getAgencia() + ", getSaldo()=" + getSaldo() + ", getSenha()="
				+ getSenha() + ", getCpf()=" + getCpf() + ", getNumeroConta()=" + getNumeroConta() + "]";
	}
	

	public void getHisttoricoOperacoes(){
		}
	}
