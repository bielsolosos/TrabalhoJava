package pessoas;

public class Cliente {
	private String senha;
	private String cpf;

	public Cliente(String senha, String cpf) {

		this.senha = senha;
		this.cpf = cpf;
	}

	public Cliente(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public String getCpf() {
		return cpf;
	}

}
