package pessoas;


public abstract class Funcionario extends Cliente {
	private String Cargo;
	private double Saldo;
	
	public Funcionario(String senha, String cpf, String NumeroConta, double Saldo) {
		super(senha, cpf, NumeroConta);
		this.Saldo = Saldo;
	}

	public String getCargo() {
		return Cargo;
		
	}
	
	public double getSaldo() {
		return Saldo;
	}

	public double calcularCapitalTotal() {
		return 0;
	}

	@Override
	public String toString() {
		return "Funcionario [Cargo=" + Cargo + ", Saldo=" + Saldo + ", getSenha()=" + getSenha() + ", getCpf()="
				+ getCpf() + ", getNumeroConta()=" + getNumeroConta() + "]";
	}
	
	
	
}