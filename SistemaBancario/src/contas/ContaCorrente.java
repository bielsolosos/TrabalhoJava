package contas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import enums.TipoEnum;
import interfaces.Transacoes;
import io.Leitores;

public class ContaCorrente extends Conta implements Transacoes{
	
	private List<String> historicoOperacoes;

	public ContaCorrente(String senha, String cpf, String NumeroConta, double saldo, String agencia) {
		super(senha, cpf, NumeroConta, saldo, agencia);
		this.historicoOperacoes = new ArrayList<String>();
	}
	
	@Override
	public TipoEnum getTipo() {
		return super.getTipo().CORRENTE;
	}
	@Override
	public void saque(double valor) throws IOException {
		this.saldo-=valor+0.10;
		Leitores.escritor("teste.txt",-(valor+0.10));
		Leitores.escritor("taxas.txt",0.10);
		historicoOperacoes.add("Saque: " + valor);
		
	}
	@Override
	public void deposito(double valor) throws IOException {
	
		this.saldo+=valor-0.10;
		Leitores.escritor("teste.txt",+(valor-0.10));
		Leitores.escritor("taxas.txt",0.10);
		historicoOperacoes.add("Depósito: " + valor);		
	}
	
	@Override
	public void transferencia(double valor, Conta contaDestino) throws IOException{
		if (this != contaDestino) {
			this.saldo-=valor+0.20;			
			contaDestino.saldo+=valor;
			Leitores.escritor("teste.txt",-(valor+0.20));
			Leitores.escritor("teste.txt",+valor);
			Leitores.escritor("taxas.txt",0.20);
			historicoOperacoes.add("Transferência: " +  valor);
			
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
	

	@Override
	public String toString() {
		return 	"TIPO DE CONTA CONTA: " + getTipo() +
				"\nAGENCIA N° " + getAgencia() +
				"\nSALDO: " + getSaldo() +
				"\nSENHA:" + getSenha() +
				"\nCPF DO TITULAR: " + getCpf();
				
	}

	@Override
	public double simulacao(int dias, double valor) {
		return 0;
	}
	
	@SuppressWarnings("null")
	public static double TotalTaxas() throws IOException{
	double Valor = 0;
		
		try {
		BufferedReader ler = new BufferedReader(new FileReader("taxas.txt"));
		String linha = "";
		while ((linha = ler.readLine()) != null) {
			String[] lista = linha.split(";");
			Valor += Double.parseDouble(lista[4]);
		}
		return Valor;
		}catch(IOException e){
			e.printStackTrace();
			return (Double) null;
		}
	}
}