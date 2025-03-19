package unidade4;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		HashSet<String> lista = new HashSet<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);

		NanoTime.fimProcessamento(inicio);

	}

}
