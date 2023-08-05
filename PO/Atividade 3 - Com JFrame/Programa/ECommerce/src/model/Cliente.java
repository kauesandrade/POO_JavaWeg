package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe para representar o Cliente no Sistema de E-commerce
 * 
 * @author Kauê S. Andrade (anotação)
 *
 */

public class Cliente {
	
	/** Propriedade nome do cliente (nome completo) */
	private String nome;
	
	/** Propriedade login do cliente */
	private String login;
	
	/** Propriedade senha do cliente */
	private String senha;
	
	/** Propriedade cpf do cliente */
	private String cpf;
	
	/** Propriedade e-mail do cliente */
	private String email;
	
	/** Propriedade telefone do cliente */
	private String telefone;
	
	/** Propriedade data de nascimento do cliente */
	private Date dataDeNascimento;
	
	private static ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	
	
	//Fazer alteração para o carrinho no cliente
	//private Carrinho_de_compras carrinho = new Carrinho_de_compras();
	
	
	public Cliente() {
	}
	
	public Cliente(String nome, String login, String senha, String cpf, String email, String telefone,
			Date dataDeNascimento) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
	}
	/**
	 * Método para retornar e cadastrar o cliente
	 *
	 */
	public String cadastrar(String nome, String login, String senha, String cpf, Date data, String email) {
		setNome(nome);	
		setLogin(login);
		setSenha(senha);
		setCpf(cpf);
		setDataDeNascimento(data);
		setEmail(email);
		
		if(getNome() == null) {
			return "Digite um Nome valido!";
		}
		else if(getLogin() == null) {
			return "Digite um Login valido!";
		}
		else if(getSenha() == null) {
			return "Digite uma Senha valida!";
		}
		else if(getCpf() == null) {
			return "Digite uma CPF valida!";
		}
		else if(getDataDeNascimento() == null) {
			return "Digite uma Data de Nascimento valida!";
		}
		else if(getCpf() == null) {
			return "Digite uma Email valida!";
		}

		else if (getNome() == null || getLogin() == null || getSenha() == null || 
			getCpf() == null || getDataDeNascimento() == null || getEmail() == null) {
			return "N";
		}else {
			
			return "A";
		}
	}
	/**
	 * Método para retornar e editar os dados do cliente
	 * 
	 */
		public String editDados(String nome, String login, String senha, String cpf, Date data, String email) {
			setNome(nome);	
			setLogin(login);
			setSenha(senha);
			setCpf(cpf);
			setDataDeNascimento(data);
			setEmail(email);
			
			if(getNome() == null) {
				return "Digite um Nome valido!";
			}
			else if(getLogin() == null) {
				return "Digite um Login valido!";
			}
			else if(getSenha() == null) {
				return "Digite uma Senha valida!";
			}
			else if(getCpf() == null) {
				return "Digite uma CPF valida!";
			}
			else if(getDataDeNascimento() == null) {
				return "Digite uma Data de Nascimento valida!";
			}
			else if(getCpf() == null) {
				return "Digite uma Email valida!";
			}

			else if (getNome() == null || getLogin() == null || getSenha() == null || 
				getCpf() == null || getDataDeNascimento() == null || getEmail() == null) {
				return "N";
			}else {
				
				return "A";
			}
		
		
	}
	/**
	* Método para retornar o e para fazer a verificação do login do cliente
	* 
	*/
	public String logar(String login, String senha) {
		if(this.login.equals(login) && this.senha.equals(senha)) {
			return "A";
		}
		return "N";
	}
	
	/**
	 * Método para retornar os dados do cliente
	 * 
	 * @return "Nome: "+ this.nome
				+"\nLogin: "+this.login
				+"\nSenha: "+this.senha
				+"\nEmail: "+this.email
				+"\nCPF: "+this.cpf
				+"\nData de Nascimento: "+this.dataDeNascimento;
	 */
	public String mostrarDados() {
		
		return "Nome: "+ this.nome
				+"\nLogin: "+this.login
				+"\nSenha: "+this.senha
				+"\nEmail: "+this.email
				+"\nCPF: "+this.cpf
				+"\nData de Nascimento: "+this.dataDeNascimento;
	}
	

	/**
	 * Método para retornar o nome do cliente
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Procedimento para verificar o nome do cliente
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		if (nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}
		
	}
	
	
	/**
	 * Método para retornar o login do cliente
	 * 
	 * @return login
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * Procedimento para verificar o login do cliente
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		if (login.length() > 0 && login.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.login = login;
		}
	}
	
	
	/**
	 * Método para retornar a senha do cliente
	 * 
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}
	
	/**
	 * Procedimento para verificar a senha do cliente
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		if (senha.length() >= 5 && senha.length() < 15){
			this.senha = senha;
		}
	}
	
	
	/**
	 * Método para retornar o cpf do cliente
	 * 
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Procedimento para verificar o cpf do cliente
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		if (cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
		}
	}
	
	
	/**
	 * Método para retornar o email do cliente
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Procedimento para verificar o email do cliente
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		if(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
			this.email = email;
		}
	}
	
	
	/**
	 * Método para retornar o telefone do cliente
	 * 
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Procedimento para verificar o telefone do cliente
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		if (telefone.length() > 12 && telefone.length() < 14 && telefone.matches("[0-9()-]*")) {
			this.telefone = telefone;
		}
	}
	
	
	/**
	 * Método para retornar o data de nascimento do cliente
	 * 
	 * @return dataDeNascimento
	 */
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	/**
	 * Procedimento para verificar o data de nascimento do cliente
	 * 
	 * @param data
	 */
	public void setDataDeNascimento(Date data) {
			this.dataDeNascimento = data;
	}

	
	public ArrayList<Endereco> getArrEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco endereco) {
		Cliente.enderecos.add(endereco);
	}


	
	
}
