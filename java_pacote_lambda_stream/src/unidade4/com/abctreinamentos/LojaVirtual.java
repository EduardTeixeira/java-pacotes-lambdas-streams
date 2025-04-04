package unidade4.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {

	static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();

	public static void main(String[] args) {

		// Criar cursos disponiveis
		Curso java8 = new Curso(1, "Java 8 para Web", 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso(2, "Oracle 12C", 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso(3, "Php 7", 1500, Paths.get("/php7"));

		Map<Integer, Curso> cursos = new HashMap<>();
		cursos.put(java8.getCdCurso(), java8);
		cursos.put(oracle12c.getCdCurso(), oracle12c);
		cursos.put(php7.cdCurso, php7);

		// Cadastrar Cliente
		Cliente antonio = new Cliente("111.222.333-44", "Antonio Jr", "antonio@emial.com");

		// Criar lista de cursos do Cliente
		List<Curso> cursosAntonio = new LinkedList<>();

		// Exibir cursos escolhidos
		Scanner entrada = new Scanner(System.in);

		int opcao = -1;

		System.out.println("Digite 0 (zero) para sair.");

		while (opcao != 0) {

			System.out.println("\nQual curso deseja adquirir:");

			System.out.println(cursos);

			opcao = entrada.nextInt();

			if (cursos.containsKey(opcao)) {
				cursosAntonio.add(cursos.get(opcao));
			} else if (opcao == 0) {
				System.out.println("Saindo da compra de cursos...");
			} else {
				System.out.println("Código do curso informado não existe. Digite novamente");
			}

		}

		entrada.close();
		
		pagamentos.put(antonio, cursosAntonio);
		System.out.println("\nCompras realizadas");
		System.out.println(pagamentos);

	}

}
