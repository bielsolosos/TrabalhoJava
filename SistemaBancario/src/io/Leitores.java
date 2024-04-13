package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

//	public void Escritor() throws IOException  {
//		BufferedReader bf = new BufferedReader(new FileReader("Cadastros.txt"));
//	}

}
