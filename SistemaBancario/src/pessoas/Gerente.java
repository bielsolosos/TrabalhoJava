package pessoas;

public class Gerente extends Funcionario {
	private String agencia;

	public Gerente(String senha, String cpf, String agencia) {
		super(senha, cpf);
		this.agencia = agencia;
	}

	@Override
	public String getCargo() {
		return "Gerente";
	}
	
	

}
