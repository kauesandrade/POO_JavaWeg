package Secretaria;

/**
 * Classe para representar a matricula no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 */
public class Matricula {
	/** Propriedade matrícula do aluno */
	private String codigo;
	/** Propriedade nome do curso(nome completo) */
	private Aluno aluno;
	/** Propriedade nome da turma(nome completo) */
	private String unidadeCurricular;
	
	
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
		}
	}

	
	
//	public Aluno getAluno() {
//		
//		return aluno;
//		
//	}
//	public Aluno setAluno() {
//		
//	}
	
	
	
	

}
