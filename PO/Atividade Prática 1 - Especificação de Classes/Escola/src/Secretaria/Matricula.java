package Secretaria;

/**
 * Classe para representar a matricula no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 */
public class Matricula {
	/** Propriedade matrícula do aluno */
	private String codigo;

	private Aluno aluno;

	private Curso curso;
	
	public Matricula(Aluno aluno, Curso curso) {
		this.aluno = aluno;
		this.curso = curso;
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
		}
	}

	
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		if(aluno.getNome()!= null) {
			this.aluno = aluno;
		}else {
			System.out.println("Não existe aluno!!!");
		}
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		if(curso.getNome()!= null) {
			this.curso = curso;
		}else {
			System.out.println("Não existe a unidade curricular!!!");
		}
	}
	
	
	
	//package Secretaria;
	//
	///**
	// * Classe para representar a matricula no Sistema Escolar
	// * 
	// * @author Kauê S. Andrade (anotação)
	// */
	//public class Matricula {
//		/** Propriedade matrícula do aluno */
//		private String codigo;
	//
//		private Aluno aluno;
	//
//		private UnidadeCurricular unidadeCurricular;
	//	
//		public Matricula(Aluno aluno, UnidadeCurricular unidadeCurricular) {
//			this.aluno = aluno;
//			this.unidadeCurricular = unidadeCurricular;
//		}
	//
	//	
//		/**
//		 * Método para retornar a matrícula do aluno
//		 * 
//		 * @return matricula
//		 */
//		public String getCodigo() {
//			return codigo;
//		}
//		/**
//		 * Procedimento para verificar a matrícula do aluno
//		 * 
//		 * @param matricula
//		 */
//		public void setCodigo(String codigo) {
//			if (codigo.matches("[A-Z]{1}[0-9]{5}")) {
//				this.codigo = codigo;
//			}
//		}
	//
	//	
	//	
//		public Aluno getAluno() {
//			return aluno;
//		}
	//	
//		public void setAluno(Aluno aluno) {
//			if(aluno.getNome()!= null) {
//				this.aluno = aluno;
//			}else {
//				System.out.println("Não existe aluno!!!");
//			}
//		}
	//	
//		public UnidadeCurricular getUnidadeCurricular() {
//			return unidadeCurricular;
//		}
	//
//		public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
//			if (unidadeCurricular.getCurso() != null) {
//				this.unidadeCurricular = unidadeCurricular;
//			} else {
//				System.out.println("Não existe unidade curricular!!!");
//			}
//		}
	//	
//		}
	//	
	//	
	//


}
