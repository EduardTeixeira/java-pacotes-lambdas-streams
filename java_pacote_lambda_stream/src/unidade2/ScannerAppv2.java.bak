package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerAppv2 {

	static String CAMINHO_ARQUIVO = "";

	public static void main(String[] args) {

		Scanner entrada = null;

		try {

			entrada = new Scanner(new FileReader(CAMINHO_ARQUIVO + "/numeros.txt"));

			double soma = 0;

			String valor;

			while (entrada.hasNext()) {
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);
			}

			System.out.println("A soma dos valores é: " + soma);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			entrada.close();
		}

	}

}
