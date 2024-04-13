package contas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import enums.TipoEnum;
import interfaces.Transacoes;
import io.Leitores;

public class ContaCorrente extends Conta implements Transacoes{
	
	private List<String> historicoOperacoes;

	public ContaCorrente(String senha, String cpf, double saldo, String agencia) {
		super(senha, cpf, saldo, agencia);
		this.historicoOperacoes = new ArrayList<String>();
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().CORRENTE;
	}
	
	public void saque(double valor) throws IOException {
		this.saldo-=valor+0.10;
		//Leitores.escritor("teste.txt",-(valor+0.10));
		//Leitores.escritor("teste.txt",0.10);
		historicoOperacoes.add("Saque: " + valor);
		
	}
	
	public void deposito(double valor) throws IOException {
	
		this.saldo+=valor-0.10;
		Leitores.escritor("teste.txt",+(valor-0.10));
		Leitores.escritor("teste.txt",0.10);
		historicoOperacoes.add("Depósito: " + valor);
		
	}
		
	public void transferencia(double valor, Conta contaDestino) throws IOException{
		if (this != contaDestino) {
			this.saldo-=valor+0.20;			
			contaDestino.saldo+=valor;
			Leitores.escritor("teste.txt",-(valor+0.20));
			Leitores.escritor("teste.txt",+valor);
			Leitores.escritor("teste.txt",0.20);
			historicoOperacoes.add("Transferência: " +  valor);
			
		}
		
	}
	
	

	public List<String> getHisttoricoOperacoes() {
		return historicoOperacoes;
	}
	

	@Override
	public String toString() {
		return 	"TIPO DE CONTA CONTA: " + getTipo() +
				"\nAGENCIA N° " + getAgencia() +
				"\nSALDO: " + getSaldo() +
				"\nSENHA:" + getSenha() +
				"\nCPF DO TITULAR: " + getCpf();
				
	}

}
