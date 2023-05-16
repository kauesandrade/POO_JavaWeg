package Secretaria;

/**
 * Classe para representar a matricula no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 */
public class Matricula {
	/** Propriedade número do curso */
	private int numero;
	/** Propriedade nome do curso(nome completo) */
	private String curso;
	/** Propriedade nome da turma(nome completo) */
	private String turma;
	
	/**
	 * Método para retornar o número do curso
	 * 
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Procedimento para verificar o número do curso
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero > 0 && numero < 2000) {
			this.numero = numero;
		} else {
			System.out.println("Numero do curso Invalido!!!");
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
