package pessoas;


public abstract class Funcionario extends Cliente {
	private String Cargo;
	
	public Funcionario(String senha, String cpf) {
		super(senha, cpf);
	}

	public String getCargo() {
		return Cargo;
		
	}
	
	public double calcularCapitalTotal() {
		return 0;
	}
	
	
}
