package Secretaria;

/**
 * Classe para representar a matricula no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 */
public class Matricula {
	/** Propriedade matrícula do aluno */
	private String matricula;
	/** Propriedade nome do curso(nome completo) */
	private String curso;
	/** Propriedade nome da turma(nome completo) */
	private String turma;
	
	
	/**
	 * Método para retornar a matrícula do aluno
	 * 
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Procedimento para verificar a matrícula do aluno
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		if (matricula.matches("[A-Z]{1}[0-9]{5}")) {
			this.matricula = matricula;
		}
	}

	
	/**
	 * Método para retornar o nome do curso
	 * 
	 * @return curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * Procedimento para verificar o nome do curso
	 * 
	 * @param curso
	 */
	public void setCurso(String curso) {
		if(curso.length() > 0 && curso.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.curso = curso;
		}else {
			System.out.println("Nome do curso Invalido!!!");
		}
	}
	
	/**
	 * Método para retornar o nome da turma
	 * 
	 * @return turma
	 */
	public String getTurma() {
		return turma;
	}
	/**
	 * Procedimento para verificar o nome da turma
	 * 
	 * @param truma
	 */
	public void setTurma(String turma) {
		if (turma.length() > 0 && turma.matches("[A-Za-z áàâãéèêóòôõíìç 0-9]*")) {
			this.turma = turma;
		} else {
			System.out.println("Nome da turma Invalida!!!");
		}
	}

}
