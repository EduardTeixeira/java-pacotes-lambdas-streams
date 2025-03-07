package unidade1;

import java.util.Scanner;

public class Calculadora {

	public static void dividir(int n1, int n2) throws ArithmeticException {
		System.out.println(n1 / n2);
	}

	public static void main(String[] args) throws DivisaoZeroException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira 2 numeros");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		try {
			dividir(n1, n2);
		} catch (ArithmeticException e) {
			System.out.println("Erro divisão por zero");
			e.printStackTrace();
			throw new DivisaoZeroException();
		}

	}
}
