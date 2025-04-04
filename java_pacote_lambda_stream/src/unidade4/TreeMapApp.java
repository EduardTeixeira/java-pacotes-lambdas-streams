package unidade4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {

		long inicio = NanoTime.inicioProcessamento();

		Map<Integer, String> mapa = new TreeMap<>();
		mapa.put(4, "Umberto");
		mapa.put(2, "Umberto");
		mapa.put(1, "Bruno");
		mapa.put(3, "Fernando");
		mapa.put(3, "Caetano");
		System.out.println(mapa);

		NanoTime.fimProcessamento(inicio);

	}

}
