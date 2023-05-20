package Secretaria;

public class UnidadeCurricular {
	
	private String nome;
	
	private Curso curso;

	public UnidadeCurricular(String nome, Curso curso) {
		super();
		setNome(nome);
		setCurso(curso);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome da unidade curricular Invalida!!!");
		}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		if(curso.getNome() != null) {
			this.curso = curso;
		}else {
			System.out.println("Não existe curso!!!");
		}
	}

	

}
