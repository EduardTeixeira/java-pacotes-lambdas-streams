package unidade4;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		LinkedList<String> lista = new LinkedList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");

		System.out.println(lista);

		lista.removeFirst();
		lista.removeLast();

		System.out.println(lista);

		NanoTime.fimProcessamento(inicio);

	}

}
