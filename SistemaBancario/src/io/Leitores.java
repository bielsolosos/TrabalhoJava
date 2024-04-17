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

	public static void CriarConta() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Cadastros.txt", true));

		String linha = "";

		System.out.println(" *** Crie sua senha: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		System.out.println("");

		System.out.println(" *** Digite seu CPF: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		System.out.println("");

		System.out.println(" *** Digite seu Numero da Conta: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		System.out.println("");
		System.out.println(" *** Caso cliente, digite 1 ║ Caso funcionario, digite 0 : ");
		String Tipo = sc.nextLine();
		switch (Tipo) {
		case "1":
			System.out.println("Caso seja uma Conta Poupança, digite 1 | Caso seja uma conta corrente digite 0");
			String Tipo_Conta = sc.nextLine();
			System.out.println("");
			switch (Tipo_Conta) {
			case "1":
				buffWrite.append("Poupanca" + ";");
				System.out.println("Me diga seu Deposito inicial");
				String depositoInicial = sc.nextLine();
				buffWrite.append(depositoInicial + ";");
				System.out.println("Me diga sua Agência");
				String agencia1 = sc.nextLine();
				
				buffWrite.append(agencia1 + ";");
				break;
			case "0":
				buffWrite.append("Corrente" + ";");
				System.out.println("Me diga seu Deposito inicial");
				String depositoInicial1 = sc.nextLine();
				buffWrite.append(depositoInicial1 + ";");
				System.out.println("Me diga sua Agência");
				String agencia2 = sc.nextLine();
				buffWrite.append(agencia2 + ";");
				;
				break;
			}
			break;

		case "0":
			System.out.println(" *** Escolha um dos 3 tipos de Funcionário:");
			System.out.println("\n│ 1 ├─ Gerente");
			System.out.println("\n│ 2 ├─ Diretor");
			System.out.println("\n│ 3 ├─ Presidente");
			String veri = sc.nextLine();
			switch (veri) {
			case "1":
				buffWrite.append("Gerente" + ";");
				System.out.println(" *** Me diga seu Depósito inicial: ");
				String depositoInicial = sc.nextLine();
				buffWrite.append(depositoInicial + ";");
				System.out.println(" *** Me diga sua Agência: ");
				String agencia2 = sc.nextLine();
				buffWrite.append(agencia2 + ";");
				break;
			case "2":
				buffWrite.append("Diretor" + ";");
				System.out.println(" *** Me diga seu Depósito inicial: ");
				String depositoInicial1 = sc.nextLine();
				buffWrite.append(depositoInicial1 + ";");
				break;
			case "3":
				buffWrite.append("Presidente" + ";");
				System.out.println(" *** Me diga seu Depósito inicial: ");
				String depositoInicial2 = sc.nextLine();
				buffWrite.append(depositoInicial2 + ";");
				Tipo = "1";
				break;
			}
			break;

		}
		buffWrite.append("\n");
		buffWrite.close();
		System.out.println("\n\n");
		System.out.println("*** Conta criada com sucesso! ***");
		System.out.println("\n");
		Thread.sleep(3000);
		
	}

	public static Conta login(String senha, String Cpf) {
		try {
			BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));
			String linha;
			while ((linha = ler.readLine()) != null) {
				String[] lista = linha.split(";");

				if (lista[0].trim().equalsIgnoreCase(senha) && lista[1].trim().equalsIgnoreCase(Cpf)) {
					if (lista[3].equalsIgnoreCase("Poupanca")) {
						ler.close();
						return new ContaPoupanca(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]), lista[5]);

					} else if (lista[3].equalsIgnoreCase("Corrente")) {
						ler.close();
						return new ContaCorrente(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]), lista[5]);

					} else if (lista[3].equalsIgnoreCase("Gerente")) {
						ler.close();
						return new Gerente(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]), lista[5]);
					} else if(lista[3].equalsIgnoreCase("Diretor")) {
						ler.close();
						return new Diretor(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]));
					} else if(lista[3].equalsIgnoreCase("Presidente")) {
						ler.close();
						return new Presidente(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]));
					} else {
						continue;
					}
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	//Retorna Conta Cliente
	public static Conta RetornaConta(String NumeroConta) {
		try {
			BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));
			String linha;
			while((linha = ler.readLine()) != null) {
				String[] lista = linha.split(";");
				if(lista[2].equalsIgnoreCase(NumeroConta)) {
					if (lista[3].equalsIgnoreCase("Poupanca")) {
						ler.close();
						return new ContaPoupanca(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]), lista[5]);

						} else if (lista[3].equalsIgnoreCase("Corrente")) {
							ler.close();
							return new ContaCorrente(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]), lista[5]);
						} else if (lista[3].equalsIgnoreCase("Gerente")) {
							ler.close();
							return new Gerente(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]), lista[5]);
						} else if(lista[3].equalsIgnoreCase("Diretor")) {
							ler.close();
							return new Diretor(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]));
						} else if(lista[3].equalsIgnoreCase("Presidente")) {
							ler.close();
							return new Presidente(lista[0], lista[1], lista[2], Double.parseDouble(lista[4]));
						} else {
							continue;
						}
				}
			}	
			
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	public static double RelatorioPresidente() {
		double Valor = 0;
		
		try {
		BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));
		String linha = "";
		while ((linha = ler.readLine()) != null) {
			String[] lista = linha.split(";");
			Valor += Double.parseDouble(lista[4]);
		}
		return Valor;
		}catch(IOException e){
			e.printStackTrace();
			return (Double) null;
		}
	}
	
	public static double RelatorioGerente(String Agencia) {
		double Valor = 0;
		
		try {
		BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));
		String linha = "";
		while ((linha = ler.readLine()) != null) {
			String[] lista = linha.split(";");
			if(!lista[3].equals("Diretor") && !lista[3].equals("Presidente")) {
				if(lista[5].equals(Agencia)) {
					Valor += Double.parseDouble(lista[4]);
				}
			}
			else {
				continue;
			}
		}
		return Valor;
		}catch(IOException e){
			e.printStackTrace();
			return (Double) null;
		}
	}

}