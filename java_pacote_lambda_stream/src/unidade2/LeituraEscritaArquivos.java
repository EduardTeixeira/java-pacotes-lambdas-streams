package unidade2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LeituraEscritaArquivos {

	static String CAMINHO_ARQUIVO = "";

	static String NOVO_FUNCIONARIO = "	{\r\n" + "		\"matricula\": 1099,\r\n"
			+ "		\"nome\": \"Antonio Maria\",\r\n"
			+ "		\"foto\": \"https://abctreinamentos.com.br/imgs/antonio.png\",\r\n"
			+ "		\"orgao\": \"Ministério das Relações Exteriores\",\r\n" + "		\"vinculo\": \"Estatutário\",\r\n"
			+ "		\"cargo\": \"Diplomata\",\r\n" + "		\"lotacao\": \"Buenos Aires\",\r\n"
			+ "		\"exercicio\": \"Embaixadas\",\r\n" + "		\"email\": \"antonio@mre.br\",\r\n"
			+ "		\"telefone\": \"(000) 3000-0000\",\r\n" + "		\"celular\": \"(000) 90000-0000\",\r\n"
			+ "		\"cpf\": \"111.222.333-44\",\r\n" + "		\"naturalidade\": \"Brasília\"\r\n" + "	}";

	public static void main(String[] args) {
		try {

			System.out.println("LEITURA...");
			leituraArquivo();

			System.out.println("ESCRITA...");
			escritaArquivo();

			System.out.println("LEITURA...");
			leituraArquivo();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leituraArquivo() throws IOException {
		String texto = Files.readString(Path.of(CAMINHO_ARQUIVO + "\\funcionarios.json"));
		System.out.println(texto);
	}

	public static void escritaArquivo() throws IOException {
		Path texto = Files.writeString(Path.of(CAMINHO_ARQUIVO + "\\funcionarios.json"), NOVO_FUNCIONARIO,
				StandardOpenOption.APPEND);
		System.out.println(texto);
	}

}
