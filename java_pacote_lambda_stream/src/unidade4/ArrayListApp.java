package unidade4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		List<String> lista = new ArrayList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);

		NanoTime.fimProcessamento(inicio);

	}

}
