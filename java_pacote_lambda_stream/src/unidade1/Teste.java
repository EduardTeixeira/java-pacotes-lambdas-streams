package unidade1;

public class Teste {

	public static void main(String[] args) {
		int i = 0;
		String frases[] = { "um", "dois", "tres" };
		while (i < 4) {
			try {
				System.out.println(frases[i]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("ArrayIndexOutOfBoundsException");
				System.out.println(ex.getMessage());
			} catch (Exception ex) {
				System.out.println("Exception");
				System.out.println(ex.getMessage());
			}
			i++;
		}
	}

}
