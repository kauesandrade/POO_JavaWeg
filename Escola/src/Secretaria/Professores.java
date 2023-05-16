package Secretaria;

/**
 * Classe para representar o Professor no Sistema Escolar
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */
public class Professores {
	/** Propriedade nome do professor(nome completo) */
	private String nome;
	/** Propriedade data de nascimento do professor */
	private String dataNascimento;
	/** Propriedade matrícula do professor */
	private String matricula;
	/** Propriedade CPF do professor */
	private String cpf; 
	/** Propriedade endereço do professor */
	private String endereco;
	/** Propriedade telefone do professor */
	private String telefone;
	/** Propriedade email do professor */
	private String email;
	
	
	/**
	 * Método para retornar o nome do professor
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Procedimento para verificar o nome do professor
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome Invalido!!!");
		}
	}
	
	/**
	 * Método para retornar a data de nascimento do professor
	 * 
	 * @return dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * Procedimento para verificar o data de nascimneto do professor
	 * 
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
			this.dataNascimento = dataNascimento;
		}else {
			System.out.println("Data de Nascimento Invalida!!!");
		}
	}
	
	/**
	 * Método para retornar a matrícula do professor
	 * 
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Procedimento para verificar a matrícula do professor
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		if (matricula.matches("[0-9]*")) {
			this.matricula = matricula;
		}else{
			System.out.println("Matricula Invalida!!!");
		}
	}
	
	/**
	 * Método para retornar o CPF do professor
	 * 
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * Procedimento para verificar o CPF do professor
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		if(cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
		}else {
			System.out.println("Cpf Invalido!!!");
		}
	}
	
	/**
	 * Método para retornar o endereço do professor
	 * 
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * Procedimento para verificar o endereço do professor
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		if(endereco.matches("")) {
			System.out.println("Endereco Invalido!!!");
		}else {
			this.endereco = endereco;
		}
	}
	
	/**
	 * Método para retornar o telefone do professor
	 * 
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * Procedimento para verificar o telefone do professor
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		if(telefone.length()>12 && telefone.length()<14 && telefone.matches("[0-9()-]*")) {
			this.telefone = telefone;
		}else {
			System.out.println("Telefone Invalido!!!");
		}
	}
	
	/**
	 * Método para retornar o email do professor
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Procedimento para verificar o email do professor
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.[A-Za-z.+]+")) {
			this.email = email;
		}else {
			System.out.println("Email Invalido!!!");
		}
	}

}
