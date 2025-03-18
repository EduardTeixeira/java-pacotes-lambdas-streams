package unidade3;

public class UsoGenerico2 {

	public static void main(String[] args) {

		ExemploGenerics2<Integer, String> iob = new ExemploGenerics2<>(88, "Eduard");
		iob.showType();

		ExemploGenerics2<String, Integer> sob = new ExemploGenerics2<>("Eduard", 17);
		sob.showType();

		ExemploGenerics2<String, String> login = new ExemploGenerics2<>("Eduard", "17");
		login.showType();

		Integer[] intArray = { 1, 2, 3 };
		Stats<Number> stats = new Stats<>(intArray);
		System.out.println(stats.media());
	}

}
