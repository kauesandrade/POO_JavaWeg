package Secretaria;

public class Avaliacao {

	private String nome = "";

	private UnidadeCurricular unidadeCurricular;
	
	public Avaliacao(String nome, UnidadeCurricular unidadeCurricular) {
		setNome(nome);
		setUnidadeCurricular(unidadeCurricular);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome da avaliação Invalida!!!");
		}
	}
	
	public UnidadeCurricular getUnidadeCurricular() {
		return unidadeCurricular;
	}

	public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
		if (unidadeCurricular.getNome() != null) {
			this.unidadeCurricular = unidadeCurricular;
		} else {
			System.out.println("Não existe cursos nessa unidade curricular!!!");
		}
	}

}
