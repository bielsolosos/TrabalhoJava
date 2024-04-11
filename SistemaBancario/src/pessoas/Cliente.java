package pessoas;

public class Cliente {
	private int senha;
	private String cpf;

	public Cliente(int senha, String cpf) {

		this.senha = senha;
		this.cpf = cpf;
	}

	public Cliente(String cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return senha;
	}

	public String getCpf() {
		return cpf;
	}

}
