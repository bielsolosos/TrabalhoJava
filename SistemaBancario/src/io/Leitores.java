package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.Presidente;

public class Leitores {

	public static void escritor(String path, double valor) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
		double linha = valor;
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	public static void CriarConta() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Cadastros.txt", true));
		System.out.println("Caso cliente, digite 1 | Caso funcionario, digite 0: ");
		String linha1 = sc.nextLine();
		String linha = "";
		System.out.println("Digite sua senha: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		System.out.println("Digite seu CPF: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		String cargo = "";
		if (linha1.equals("0")) {
			System.out.println("Digite seu Cargo: ");
			cargo = sc.nextLine();
			buffWrite.append(cargo + ";");
		}

		if (cargo.equalsIgnoreCase("gerente")) {
			System.out.println("Digite sua agencia: ");
			linha = sc.next();
			buffWrite.append(linha + ";");
		}
		buffWrite.append("\n");
		System.out.println("Conta criada com sucesso!");
		buffWrite.close();

	}

	public static Funcionario loginFuncinario(String senha, String Cpf) {
	    	try {
	    		 BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));	    	
	    		 String linha;
	    		 while((linha = ler.readLine()) != null) {
	    			 String[] lista = linha.split(";");
	    			 if(lista[2].equalsIgnoreCase("gerente") && lista[0].equalsIgnoreCase(senha) && lista[1].equalsIgnoreCase(Cpf)) {
	    				 return new Gerente(lista[0], lista[1], lista[2]);
	    			 }
	    			 
	    			 else if(lista[2].equalsIgnoreCase("presidente") && lista[0].equalsIgnoreCase(senha) && lista[1].equalsIgnoreCase(Cpf)) {
	    				 return new Presidente(lista[0], lista[1]);
	    			 }
	    			 
	    			 else if(lista[2].equalsIgnoreCase("diretor") && lista[0].equalsIgnoreCase(senha) && lista[1].equalsIgnoreCase(Cpf)) {
	    				 return new Diretor(lista[0], lista[1]);
	    			 }
	    			 else {
	    				 continue;
	    			 }
	    			 
	    		 }
	    		 
	    		 
	    	}catch(IOException e) {
	    		e.printStackTrace();
		    	return null;
	    	}
	    	return null;
	    }

	public static Conta loginCliente(String senha, String Cpf) {
		try {
			BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));
			String linha;
			while ((linha = ler.readLine()) != null) {
				String[] lista = linha.split(";");

				if (lista.length == 6 && lista[0].trim().equalsIgnoreCase(senha) && lista[1].trim().equalsIgnoreCase(Cpf)) {
					if (lista[3].equalsIgnoreCase("Poupanca")) {
						ler.close();
						return new ContaPoupanca(lista[0], lista[1], Double.parseDouble(lista[4]), lista[5]);

					} else if (lista[3].equalsIgnoreCase("Corrente")) {
						ler.close();
						return new ContaCorrente(lista[0], lista[1], Double.parseDouble(lista[4]), lista[5]);

					}
				}
				
			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

}
