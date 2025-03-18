package unidade3;

public class NotaAluno {

	double valor;

	public <T extends Number> NotaAluno(T valor) {
		this.valor = valor.doubleValue();
	}

	public <T extends Number> double retornarValor(T obj) {
		return obj.doubleValue();
	}

}
