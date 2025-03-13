package unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);

		int qtdeNotas = 4;
		float notaTotal = 0;
		for (int i = 1; i <= qtdeNotas; i++) {
			System.out.println("Informe a Nota " + i + ":");
			notaTotal += entrada.nextFloat();
		}

		float media = notaTotal / qtdeNotas;

		saida.format("Média = %.2f", media);

		entrada.close();
		saida.close();

	}

}
