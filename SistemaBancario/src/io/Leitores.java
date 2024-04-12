	package io;
	import contas.Conta;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import enums.TipoEnum;
	import pessoas.Funcionario;
	import pessoas.Gerente;

	public class Leitores {

		public static void escritor(String path, double valor) throws IOException {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
			double linha = valor;
			buffWrite.append(linha + "\n");
			buffWrite.close();
		}
}
