package Secretaria;

/**
 * Classe para representar o curso no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */
public class Curso {
	/** Propriedade nome do curso */
	private String nome;
	
	public Curso(String nome) {
		setNome(nome);
	}
	 	
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
