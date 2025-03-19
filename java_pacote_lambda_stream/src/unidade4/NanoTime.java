package unidade4;

public class NanoTime {

	public static long inicioProcessamento() {
		long inicio = System.nanoTime();
		System.out.println("Inicio do Processamento ::: " + inicio);
		return inicio;
	}

	public static void fimProcessamento(long inicio) {
		long fim = System.nanoTime();
		System.out.println("Fim do Processamento ::: " + fim);
		System.out.println("Tempo de processamento ::: " + (fim - inicio) / 1000000.0f);
	}

}
