import java.util.Scanner;

public class MenuGerente {
	 private Gerente gerente;

	    public MenuGerente(Gerente gerente) {
	        this.gerente = gerente;
	    }

	    public void exibirMenu() {
	        System.out.println("Menu do Gerente:");
	        System.out.println("1. Movimentações e Informações da Conta");
	        System.out.println("   a. Saque");
	        System.out.println("   b. Depósito");
	        System.out.println("   c. Transferência para outra conta");
	    }

	    public void exibir() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Login do Gerente:");

	        // Solicitar senha e CPF do gerente
	        System.out.print("CPF: ");
	        String cpf = scanner.nextLine();
	        System.out.print("Senha: ");
	        String senha = scanner.nextLine();

	        // Verificar se os dados de login são válidos
	        if (gerente.autenticar(cpf, senha)) {
	            System.out.println("Login bem-sucedido. Bem-vindo, " + gerente.getCargo() + ".");
	            while (true) {
	                exibirMenu();
	                System.out.print("Escolha uma opção (ou digite 'Sair' para sair): ");
	                String opcao = scanner.nextLine().toLowerCase();

	                if (opcao.equals("Sair")) {
	                    System.out.println("Saindo do Menu do Gerente...");
	                    break;
	                }
	
		
	                
	            }
	           }
	      }
}
