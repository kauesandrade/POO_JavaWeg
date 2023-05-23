package Secretaria;

/**
 * Classe para representar as notas no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */

public class Notas {
	
	/** Objeto da classe Aluno */
	private Aluno aluno;
	
	/** Objeto da classe Avaliacao */
	private Avaliacao avaliacao;
	
	/** Propriedade Nota de Notas */
	private float Nota;
	
	
	/** Construtor da propriedade Nota e dos objetos Aluno e Avaliacao */
	public Notas(Aluno aluno, Avaliacao avaliacao, float nota) {
		setAluno(aluno);
		setAvaliacao(avaliacao);
		setNota(nota);
	}
	
	
	/**
	 * Método para retornar o aluno da classe Aluno
	 * 
	 * @return aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}
	
	/**
	 * Procedimento para verificar o aluno da classe Aluno
	 * 
	 * @param aluno
	 */
	public void setAluno(Aluno aluno) {
		if(aluno.getNome() != null) {
			this.aluno = aluno;
		}else {
			System.out.println("Não existe aluno!!!");
		}
	}

	
	/**
	 * Método para retornar a avaliacao da classe Avaliacao
	 * 
	 * @return avaliacao
	 */
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	/**
	 * Procedimento para verificar a avalicao da classe Avaliacao
	 * 
	 * @param avaliacao
	 */
	public void setAvaliacao(Avaliacao avaliacao) {
		if(avaliacao.getNome() != null) {
			this.avaliacao = avaliacao;
		}else {
			System.out.println("Não existe avaliação!!!");
		}
	}

	
	/**
	 * Método para retornar a Nota do aluno
	 * 
	 * @return Nota
	 */
	public float getNota() {
		return Nota;
	}
	
	/**
	 * Procedimento para verificar a Nota do aluno
	 * 
	 * @param Nota
	 */
	public void setNota(float nota) {
		if(nota >= 0.0 && nota <= 10.0) {
			Nota = nota;
		}else {
			System.out.println("Nota invalida");
		}
	}
	
}
