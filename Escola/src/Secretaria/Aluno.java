package Secretaria;

//import java.util.Date;

	/** Classe para representar o Aluno no Sistema Escolar
 	* 
 	* @author Kauê S. Andrade (anotação)
 	*
 	*/
	public class Aluno {
	/** Propriedade nome do aluno(nome completo) */
	private String nome;
	/** Propriedade data de nascimento do aluno */
	private String dataNascimento;
	/** Propriedade matrícula do aluno */
	private String matricula;
	/** Propriedade CPF do aluno */
	private String cpf;
	/** Propriedade endereço do aluno */
	private String endereco;
	/** Propriedade telefone do aluno */
	private String telefone;
	/** Propriedade email do aluno */
	private String email;
	/** Propriedade responsável do aluno*/
	private String responsavel;
	
	
	/** Método para retornar o nome do aluno
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/** Procedimento para verificar o nome do aluno
	 * @param nome
	 */
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome Invalido!!!");
		}
	}
	
	
	/** Método para retornar a data de nascimento do aluno
	 * @return dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	/** Procedimento para verificar o data de nascimneto do aluno
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
			this.dataNascimento = dataNascimento;
		}else {
			System.out.println("Data de Nascimento Invalida!!!");
		}
	}
	
	
	/** Método para retornar a matrícula do aluno
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/** Procedimento para verificar a matrícula do aluno
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		if (matricula.matches("[0-9]*")) {
			this.matricula = matricula;
		}else{
			System.out.println("Matricula Invalida!!!");
		}
	}
	
	
	/** Método para retornar o CPF do aluno
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/** Procedimento para verificar o CPF do aluno
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		if(cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
		}else {
			System.out.println("Cpf Invalido!!!");
		}
	}
	
	
	/** Método para retornar o endereço do aluno
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/** Procedimento para verificar o endereço do aluno
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		if(endereco.matches("")) {
			System.out.println("Endereco Invalido!!!");
		}else {
			this.endereco = endereco;
		}
		
	}
	
	
	/** Método para retornar o telefone do aluno
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/** Procedimento para verificar o telefone do aluno
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		if(telefone.length()>12 && telefone.length()<14 && telefone.matches("[0-9()-]*")) {
			this.telefone = telefone;
		}else {
			System.out.println("Telefone Invalido");
		}
	}
	
	
	/** Método para retornar o email do aluno
	 * @return email
	 */
	public String getEmail() {
		return email;
	}/** Procedimento para verificar o email do aluno
	 * @param email
	 */
	public void setEmail(String email) {
		if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.[A-Za-z.+]+")) {
			this.email = email;
		}else {
			System.out.println("Email Invalido!!!");
		}
		
	}
	
	
	/** Método para retornar o nome do responsável do aluno
	 * @return responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}
	/** Procedimento para verificar o nome do responsável do aluno
	 * @param responsavel
	 */
	public void setResponsavel(String responsavel) {
		if (responsavel.matches("[A-Za-z ]*")) {
			this.responsavel = responsavel;
		}else {
			System.out.println("Nome do Responsavel Invalido!!!");
		}
		
	}

}
