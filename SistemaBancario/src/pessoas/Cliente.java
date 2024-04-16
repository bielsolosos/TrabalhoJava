package pessoas;

public class Cliente {
	private String senha;
	private String cpf;
	private String numeroConta;



	public Cliente(String senha, String cpf, String NumeroConta) {
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

	public String getCpf() {
		return cpf;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	

}