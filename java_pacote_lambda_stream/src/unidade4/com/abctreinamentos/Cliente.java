package unidade4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

	Set<Curso> cursos;

	String cpf;
	String nome;
	String email;

	public Cliente() {
		super();
	}

	public Cliente(String cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}

	public static void main(String[] args) {

		Curso java8 = new Curso("java8");
		Curso oracle12c = new Curso("oracle12c");

		Set<Curso> cursosA = new HashSet<>();
		cursosA.add(java8);
		cursosA.add(oracle12c);

		Set<Curso> cursosB = new HashSet<>();
		cursosB.add(java8);

//		cursosA.retainAll(cursosB);
//		System.out.println("A intersec B ::: ");
//		System.out.println(cursosA);

//		cursosA.removeAll(cursosB);
//		System.out.println("A - B ::: ");
//		System.out.println(cursosA);

		cursosB.removeAll(cursosA);
		System.out.println("B - A ::: ");
		System.out.println(cursosB);

		Cliente A = new Cliente();
		A.setCursos(cursosA);

		Cliente B = new Cliente();
		B.setCursos(cursosB);

	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
