package unidade4;

import java.util.List;

public class NovasFuncionalidadesJava21 {

	public static void main(String[] args) {

		List<String> list = List.of("maçã", "banana", "uva");

		// Antes do java 21
		var primeiroElemento = list.iterator().next();
		System.out.println(primeiroElemento);

		var ultimoElemento = list.get(list.size() - 1);
		System.out.println(ultimoElemento);
		
		// Com Java 21
		primeiroElemento = list.getFirst();
		System.out.println(primeiroElemento);
		
		ultimoElemento = list.getLast();
		System.out.println(primeiroElemento);
		
		System.out.println(list);
		
		System.out.println(list.reversed());

	}

}
