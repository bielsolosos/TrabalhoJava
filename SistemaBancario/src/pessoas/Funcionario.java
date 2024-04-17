package pessoas;

import contas.Conta;
import enums.TipoEnum;

public abstract class Funcionario extends Conta {
	private String Cargo;
	
	public Funcionario(String senha, String cpf, String NumeroConta, double Saldo) {
		super(senha, cpf, NumeroConta, Saldo);
	}

	public TipoEnum getCargo() {
		return TipoEnum.FUNCIONARIO;
	}

	public double calcularCapitalTotal() {
		return 0;
	}

	@Override
	public String toString() {
		return "Funcionario [Cargo=" + Cargo + ", Saldo=" + getSaldo() + ", getSenha()=" + getSenha() + ", getCpf()="
				+ getCpf() + ", getNumeroConta()=" + getNumeroConta() + "]";
	}
	
	
	
}