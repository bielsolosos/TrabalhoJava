package pessoas;



public class Diretor extends Funcionario {

	public Diretor(String senha, String cpf, String NumeroConta, double Saldo) {
		super(senha, cpf, NumeroConta, Saldo);
	}

	@Override
	public String getCargo() {
		return "Diretor";
	}

	@Override
	public String toString() {
		return "Diretor [getSaldo()=" + getSaldo() + ", getSenha()=" + getSenha() + ", getCpf()=" + getCpf()
				+ ", getNumeroConta()=" + getNumeroConta() + "]";
	}
	
	
	 
}