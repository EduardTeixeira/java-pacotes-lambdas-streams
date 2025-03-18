package unidade3.persistencia;

import unidade1.br.treinamentos.rh.Administrativo;
import unidade1.br.treinamentos.rh.Diretor;

public class PersistenciaApp {

	public static void main(String[] args) {

		GenericDAO<Administrativo> admin = new GenericDAO<>();
		admin.create(new Administrativo());

		GenericDAO<Diretor> diretor = new GenericDAO<>();
		diretor.create(new Diretor());
		
		System.out.println("OK");
	}

}
