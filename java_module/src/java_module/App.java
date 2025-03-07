package java_module;

import com.treinamentos.mensagens.MensagensHTTP;
import com.treinamentos.novasmensagens.NovasMensagensHTTP;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Utilizando module");
		
		String msg200 = MensagensHTTP.mensagem200();
		System.out.println(msg200);
		
		String msg404 = MensagensHTTP.mensagem404();
		System.out.println(msg404);
		
		String msg500 = NovasMensagensHTTP.mensagem500();
		System.out.println(msg500);
	}
	
}
