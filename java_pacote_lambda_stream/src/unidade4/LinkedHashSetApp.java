package unidade4;

import java.util.LinkedHashSet;

public class LinkedHashSetApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		LinkedHashSet<String> lista = new LinkedHashSet<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);

		NanoTime.fimProcessamento(inicio);

	}

}
