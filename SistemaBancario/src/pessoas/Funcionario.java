package pessoas;


public abstract class Funcionario extends Cliente {
	private String Cargo;
	
	public Funcionario(int senha, String cpf) {
		super(senha, cpf);
	}

	public String getCargo() {
		return Cargo;
	}

	
	
}
