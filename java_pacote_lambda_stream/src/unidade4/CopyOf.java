package unidade4;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {

	public static void main(String[] args) {

		List<String> listaOriginal = new ArrayList<>();
		listaOriginal.add("maçã");
		listaOriginal.add("banana");
		listaOriginal.add("uva");

		List<String> listaImutavel = List.copyOf(listaOriginal);

		try {
			listaOriginal.add("pera");
			listaImutavel.add("pera");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Lista Original: " + listaOriginal);
		System.out.println("Lista Imutável: " + listaImutavel);

	}

}
