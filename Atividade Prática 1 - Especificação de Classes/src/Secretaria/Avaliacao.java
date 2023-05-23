package Secretaria;

/**
 * Classe para representar a avalição no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */

public class Avaliacao {

	/** Propriedade nome da avaliação*/
	private String nome = "";
	
	/** Objeto da classe UnidadeCurricular */
	private UnidadeCurricular unidadeCurricular;
	
	/** Construtor da propriedade nome e do objeto unidadeCurricular */
	public Avaliacao(String nome, UnidadeCurricular unidadeCurricular) {
		setNome(nome);
		setUnidadeCurricular(unidadeCurricular);
	}
	
	
	/**
	 * Método para retornar o nome da avaliação
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Procedimento para verificar o nome da avaliação
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome da avaliação Invalida!!!");
		}
	}
	
	
	/**
	 * Método para retornar a unidade curricular da classe UnidadeCurricular
	 * 
	 * @return unidadeCurricular
	 */
	public UnidadeCurricular getUnidadeCurricular() {
		return unidadeCurricular;
	}

	
	/**
	 * Procedimento para verificar a unidade curricular da classe UnidadeCurricular
	 * 
	 * @param unidadeCurricular
	 */
	public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
		if (unidadeCurricular.getNome() != null) {
			this.unidadeCurricular = unidadeCurricular;
		} else {
			System.out.println("Não existe cursos nessa unidade curricular!!!");
		}
	}

}
