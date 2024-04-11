package pessoas;

public class Cliente {
	private int senha;
	private int CPF;
	//TODO coloca pra minusculo pq o eclipse do gabriel bugo
	
	public Cliente(int senha, int CPF) {
		super();
		this.senha = senha;
		this.CPF = CPF;
	}
	public int getSenha() {
		return senha;
	}
	public int getCPF() {
		return CPF;
	}
	
	
}
