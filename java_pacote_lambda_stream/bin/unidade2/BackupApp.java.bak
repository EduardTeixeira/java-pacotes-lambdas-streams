package unidade2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupApp {

	static String CAMINHO_ARQUIVO = "C:\\Users\\eduardteixeira01\\Desktop\\Projetos\\GITHUB\\java-pacotes-lambdas-streams\\java_pacote_lambda_stream\\src\\unidade2";

	public static void main(String[] args) {

		Path home = Paths.get(CAMINHO_ARQUIVO);

		String filtro = "*.java";

		try {

			DirectoryStream<Path> stream = Files.newDirectoryStream(home, filtro);

			for (Path p : stream) {
				Path txt = home.resolve(p);
				Path backup = home.resolve(p + ".bak");
				Files.copy(txt, backup, StandardCopyOption.REPLACE_EXISTING);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
