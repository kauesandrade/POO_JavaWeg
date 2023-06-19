package Secretaria;

public class UnidadeCurricular {
	
	private String nome;
	
	private Curso curso;

	public UnidadeCurricular(String nome, Curso curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
