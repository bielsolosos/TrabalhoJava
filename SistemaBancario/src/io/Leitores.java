package io;

import contas.Conta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import enums.TipoEnum;
import pessoas.Cliente;
import pessoas.Funcionario;
import pessoas.Gerente;

public class Leitores {

	public static void escritor(String path, double valor) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
		double linha = valor;
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	public static void CriarConta() throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Cadastros.txt", true));
		Scanner sc = new Scanner(System.in);
		System.out.println("Caso cliente digite 1 caso funcionario digite 0: ");
		String linha1 = sc.nextLine();
		String linha = "";
		System.out.println("Digite sua senha: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		System.out.println("Digite seu CPF: ");
		linha = sc.nextLine();
		String cargo="";
			if(linha1.equals("0"))
			{
				System.out.println("Digite seu Cargo: ");
				cargo = sc.nextLine();
				buffWrite.append(cargo + ";");
			}
			else 
			{
				buffWrite.append(linha + ";\n");
			}
				if(cargo.equalsIgnoreCase("gerente")) 
				{
					System.out.println("Digite sua agencia: ");
					linha = sc.nextLine();
					buffWrite.append(linha + ";\n");
				}
		System.out.println("Conta criada com sucesso!");
		buffWrite.close();
		}
	}
