package pessoas;


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
	
	
}
