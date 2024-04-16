package pessoas;

public class Gerente extends Funcionario {
	private String agencia;

	public Gerente(String senha, String cpf, String NumeroConta, double Saldo, String agencia) {
		super(senha, cpf, NumeroConta, Saldo);
		this.agencia = agencia;
	}

	@Override
	public String getCargo() {
		return "Gerente";
	}

	@Override
	public String toString() {
		return "Gerente [agencia=" + agencia + ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString()
				+ ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf() + "]";
	}
	
	

}