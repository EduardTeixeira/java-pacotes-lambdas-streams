package unidade2;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamApp {

	public static void byteStream() throws IOException {
		FileInputStream entrada = new FileInputStream("dados.txt");
		int contador = 0;
		while ((entrada.read()) != -1) {
			contador++;
		}
		System.out.println("Número de caracteres é: " + contador);
		entrada.close();
	}

	public static void caracterStream(char letra) throws IOException {
		FileInputStream entrada = new FileInputStream("dados.txt");
		int contador = 0;
		int c;
		while ((c = entrada.read()) != -1) {
			if (c == letra) {
				contador++;
			}
		}
		System.out.println("Número de vezes que a letra informada foi encontrada: " + contador);
		entrada.close();
	}

	public static void main(String[] args) {
		try {

			byteStream();

			System.out.println("Informar a letra que procura:");
			char letra = (char) System.in.read();
			caracterStream(letra);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
