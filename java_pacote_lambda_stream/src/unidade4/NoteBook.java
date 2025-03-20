package unidade4;

import java.util.ArrayList;

public class NoteBook {

	static ArrayList<String> anotacoes;

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		anotacoes = new ArrayList<>();

		anotacoes.add("Comprar pão");

		anotacoes.add("Vender carro");

		anotacoes.add("Encontro às 11h");

		System.out.println(anotacoes);

		for (int i = 0; i < 1000; i++) {
			anotacoes.add("Item..." + i);
		}

		System.out.println(anotacoes);

		NanoTime.fimProcessamento(inicio);

	}

}
