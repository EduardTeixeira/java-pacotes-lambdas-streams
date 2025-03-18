package unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

public class GenericApp {

	public static void main(String[] args) {

		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());

		Circle circle = (Circle) lista.get(0);

		// Circle cannot be cast to class Rectangle
		// Rectangle rectangle = (Rectangle) lista.get(0);

		List<?> ls = lista;

	}

}
