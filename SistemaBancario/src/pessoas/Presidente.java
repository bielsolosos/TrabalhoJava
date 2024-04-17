package pessoas;

import java.io.IOException;
import java.util.List;

import contas.CapitalBanco;
import contas.Conta;
import enums.TipoEnum;
import io.Leitores;

public class Presidente extends Funcionario{

	public Presidente(String senha, String cpf, String NumeroConta, String Nome, double Saldo) {
		super(senha, cpf, NumeroConta, Nome, Saldo);
	}

	@Override
	public TipoEnum getCargo() {
		return TipoEnum.PRESIDENTE;
	}
	
	
	
	@Override
	public TipoEnum getTipo() {
		return TipoEnum.PRESIDENTE;
	}


	
	
	@Override
	public String toString() {
		return "Presidente ["
				+ "getSaldo()=" + getSaldo() + ", getSenha()=" + getSenha()
				+ ", getCpf()=" + getCpf() + ", getNumeroConta()=" + getNumeroConta() + "]";
	}

	@Override
	 public double calcularCapitalTotal() {
	        double capitalTotal = 0;
	        for (Conta conta : CapitalBanco.contas) {
	            capitalTotal += conta.getSaldo();
	        }
	        return capitalTotal;
	    }
	//TODO: isso aqui está errado, tem que ser um leitor a partir do arquivo!!! 
	//Ou no menu fazermos ele ler todo o menu e por em um hashmap ass: Gabs

private List<String> historicoOperacoes;
	
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
			Leitores.escritor("teste.txt",-valor);
			Leitores.escritor("teste.txt",+valor);
			}
	}

	@Override
	public void getHisttoricoOperacoes(){
		System.out.println("Para cada saque será cobrado o valor de R$0.10 (dez centavos)\r\n" + " Para cada depósito será cobrado o valor de R$0.10 (dez centavos)\r\n" + " Para cada transferência será cobrado o valor de R$0.20 (dez centavos) que deverá ser cobrado apenas do remetente;"); 
		if(historicoOperacoes.isEmpty()) {
			System.out.println("Você ainda não fez nenhuma movimentação");
		}
		else {
		System.out.println(historicoOperacoes);
		}
	}
}