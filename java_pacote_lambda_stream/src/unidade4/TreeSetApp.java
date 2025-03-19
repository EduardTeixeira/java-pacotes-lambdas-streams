package unidade4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		Set<String> lista = new TreeSet<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);

		NanoTime.fimProcessamento(inicio);

	}

}
