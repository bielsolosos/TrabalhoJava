package pessoas;



public class Diretor extends Funcionario {

	public Diretor(String senha, String cpf) {
		super(senha, cpf);
	}

	@Override
	public String getCargo() {
		return "Diretor";
	}
	
	
	 
}
