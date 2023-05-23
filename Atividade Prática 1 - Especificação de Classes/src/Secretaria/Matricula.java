package Secretaria;

/**
 * Classe para representar a matricula no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 */

public class Matricula {
	/** Propriedade código do aluno */
	private String codigo;
	/** Objeto da classe aluno */
	private Aluno aluno;
	/** Objeto da classe unidadeCurricular */
	private UnidadeCurricular unidadeCurricular;
	
	/**Construtor dos objetos aluno e unidadeCurricular*/
	public Matricula(Aluno aluno, UnidadeCurricular unidadeCurricular) {
		setAluno(aluno);
		setUnidadeCurricular(unidadeCurricular);
	}
	
	
	/**
	 * Método para retornar a matrícula do aluno
	 * 
	 * @return matricula
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Procedimento para verificar a matrícula do aluno
	 * 
	 * @param matricula
	 */
	public void setCodigo(String codigo) {
		if (codigo.matches("[A-Z]{1}[0-9]{5}")) {
			this.codigo = codigo;
		}else {
			System.out.println("Número da matricula Invalida!!!");
		}
	}

	
	/**
	 * Método para retornar o aluno da classe aluno
	 * 
	 * @return aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}
	
	/**
	 * Procedimento para verificar o aluno da clasee aluno
	 * 
	 * @param aluno
	 */
	public void setAluno(Aluno aluno) {
		if(aluno.getNome()!= null) {
			this.aluno = aluno;
		}else {
			System.out.println("Não existe aluno!!!");
		}
	}
	
	
	/**
	 * Método para retornar a unidadeCurricular da classe UnidadeCurricular
	 * 
	 * @return unidadeCurricular
	 */
	public UnidadeCurricular getUnidadeCurricular() {
		return unidadeCurricular;
	}

	/**
	 * Procedimento para verificar a unidadeCurricular da classe UnidadeCurricular
	 * 
	 * @param unidadeCurricular
	 */
	public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
		if (unidadeCurricular.getCurso() != null) {
			this.unidadeCurricular = unidadeCurricular;
		} else {
			System.out.println("Não existe unidade curricular!!!");
		}
	}
}