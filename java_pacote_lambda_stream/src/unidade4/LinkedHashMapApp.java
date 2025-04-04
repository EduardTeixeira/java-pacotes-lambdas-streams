package unidade4;

import java.util.LinkedHashMap;

public class LinkedHashMapApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(4, "Umberto");
		mapa.put(2, "Umberto");
		mapa.put(1, "Bruno");
		mapa.put(3, "Fernando");
		mapa.put(3, "Caetano");
		System.out.println(mapa);

		NanoTime.fimProcessamento(inicio);

	}

}
