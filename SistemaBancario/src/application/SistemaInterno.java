package application;

import java.io.IOException;

import contas.Conta;
import io.Leitores;
import menus.MenuPrincipal;

public class SistemaInterno {
	public static void main(String[] args) throws IOException, InterruptedException {
		Leitores.RelatorioDiretor();
		Leitores.RelatorioGerente("2");
	}
}
