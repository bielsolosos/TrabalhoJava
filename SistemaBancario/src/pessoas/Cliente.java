package pessoas;

public class Cliente {
	private String senha;
	private String cpf;
	private String numeroConta;
	private String Nome;



	public Cliente(String senha, String cpf, String NumeroConta, String Nome) {
		super();
		this.senha = senha;
		this.cpf = cpf;
		numeroConta = NumeroConta;
	}
	
	

	@Override
	public String toString() {
		return "Cliente [senha=" + senha + ", cpf=" + cpf + ", numeroConta=" + numeroConta + "]";
	}



	public Cliente(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public String getCpf() {
		return cpf;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	

}