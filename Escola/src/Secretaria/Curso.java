package Secretaria;

/**
 * Classe para representar o curso no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */
public class Curso {
	/** Propriedade carga horária do curso */
	private int cargaHoraria;
	/** Propriedade matéria do curso */
	private String materia;
	/** Propriedade nome do curso */
	private String nome;
	
	/**
	 * Método para retornar a carga horária do curso
	 * 
	 * @return cargaHoraria
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	/**
	 * Procedimento para verificar a carga horária do curso
	 * 
	 * @param cargaHoraria
	 */
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria > 0) {
			this.cargaHoraria = cargaHoraria;
		}else {
			System.out.println("Data de Nascimento Invalida!!!");
		}
	}
	
	/**
	 * Método para retornar a matéria do curso
	 * 
	 * @return materia
	 */
	public String getMateria() {
		return materia;
	}
	/**
	 * Procedimento para verificar a matéria do curso
	 * 
	 * @param materia
	 */
	public void setMateria(String materia) {
		if(materia.length() > 0 && materia.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.materia = materia;
		}else {
			System.out.println("Nome da matéria Invalida!!!");
		}
	}
	
	/**
	 * Método para retornar o nome do curso
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Procedimento para verificar o nome do curso
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome do curso Invalido!!!");
		}
	}

}
