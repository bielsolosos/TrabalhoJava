package pessoas;



public class Diretor extends Funcionario {

	public Diretor(int senha, String cpf) {
		super(senha, cpf);
	}

	@Override
	public String getCargo() {
		return "Diretor";
	}
	
	
	 
}
