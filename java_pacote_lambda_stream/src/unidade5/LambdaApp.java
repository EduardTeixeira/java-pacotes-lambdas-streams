package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	static int numero = 10;
	int somatorio;

	public static void main(String[] args) {

		LambdaApp lambdaApp = new LambdaApp();

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Valores da Lista");
		integers.forEach(x -> System.out.println(x));

		System.out.println("\nLambda com adição");
		integers.forEach(x -> {
			x = x + numero;
			System.out.println(x);
		});

		System.out.println("\nLambda com divisão");
		integers.forEach((Integer x) -> {
			int y = x / 2;
			System.out.println(y);
		});

		System.out.println("\nLambda com adição");
		integers.forEach(x -> {
			numero = 5;
			x = x + numero;
			lambdaApp.somatorio = lambdaApp.somatorio + x;
			System.out.println(x);
		});

		System.out.println("\nResultado somatorio");
		System.out.println(lambdaApp.somatorio);

	}

}
