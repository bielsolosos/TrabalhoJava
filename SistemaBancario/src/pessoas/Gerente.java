package pessoas;

public class Gerente extends Funcionario {
	private String Agencia;

	public Gerente(int senha, String cpf, String agencia) {
		super(senha, cpf);
		Agencia = agencia;
	}

	@Override
	public String getCargo() {
		return "Gerente";
	}
	
	

}
