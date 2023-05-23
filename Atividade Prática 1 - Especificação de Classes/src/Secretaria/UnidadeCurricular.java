package Secretaria;

/**
 * Classe para representar a unidade curricular no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */

public class UnidadeCurricular {
	
	/** Propriedade nome da unidade curricular */
	private String nome;
	
	/** Objeto da classe curso */
	private Curso curso;

	
	/** Construtor da propriedade nome e do objeto Curso */
	public UnidadeCurricular(String nome, Curso curso) {
		super();
		setNome(nome);
		setCurso(curso);
	}
	
	/**
	 * Método para retornar o nome da unidade curricular
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Procedimento para verificar o nome da unidade curricular
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome da unidade curricular Invalida!!!");
		}
	}

	
	/**
	 * Método para retornar o curso da clsse Curso
	 * 
	 * @return curso
	 */
	public Curso getCurso() {
		return curso;
	}
	
	/**
	 * Procedimento para verificar o curso da clsse Curso
	 * 
	 * @param curso
	 */
	public void setCurso(Curso curso) {
		if(curso.getNome() != null) {
			this.curso = curso;
		}else {
			System.out.println("Não existe curso!!!");
		}
	}

	

}
