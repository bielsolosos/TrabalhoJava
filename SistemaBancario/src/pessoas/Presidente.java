package pessoas;

import contas.CapitalBanco;
import contas.Conta;

public class Presidente extends Funcionario{

	public Presidente(int senha, String cpf) {
		super(senha, cpf);
	}

	@Override
	public String getCargo() {
		return "Presidente";
	}

	@Override
	public String toString() {
		return "Presidente [getCargo()=" + getCargo() + ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + "]";
	}
	@Override
	 public double calcularCapitalTotal() {
	        double capitalTotal = 0;
	        for (Conta conta : CapitalBanco.contas) {
	            capitalTotal += conta.getSaldo();
	        }
	        return capitalTotal;
	    }
}
