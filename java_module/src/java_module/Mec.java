package java_module;

import unidade1.br.treinamentos.Universidade;

public class Mec {

  void avaliarEnsino() {
    Universidade ufpa = new Universidade();
  }

  public static void main(String[] args) {

    // importacao padrao
    Universidade.gerarRelatorioProfessoresMestresDoutores();

    // importacao static
    gerarRelatorioProfessoresMestresDoutores();
  }

}
