package Secretaria;

public class Avaliacao {

	private String notas;
	
	private UnidadeCurricular unidadeCurricular;

	public Avaliacao(String notas, UnidadeCurricular unidadeCurricular) {
		this.notas = notas;
		this.unidadeCurricular = unidadeCurricular;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		if (notas.length() > 0) {
			this.notas = notas;
		} else {
			System.out.println("Nota invalida");
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
