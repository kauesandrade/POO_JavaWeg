package Secretaria;

public class Professores {
	private String nome, dataNascimento, matricula, cpf, endereco, telefone, email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z áàâãéèêóòôõíìç]*")) {
			this.nome = nome;
		}else {
			System.out.println("Nome Invalido!!!");
		}
	}
	
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
			this.dataNascimento = dataNascimento;
		}else {
			System.out.println("Data de Nascimento Invalida!!!");
		}
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if (matricula.matches("[0-9]*")) {
			this.matricula = matricula;
		}else{
			System.out.println("Matricula Invalida!!!");
		}
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length()>11 && cpf.length()<13 && cpf.matches("[0-9]+-[0-9]*")) {
			this.cpf = cpf;
		}else {
			System.out.println("Cpf Invalido!!!");
		}
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone.length()>12 && telefone.length()<14 && telefone.matches("[0-9()-]*")) {
			this.telefone = telefone;
		}else {
			System.out.println("Telefone Invalido!!!");
		}
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.[A-Za-z.+]+")) {
			this.email = email;
		}else {
			System.out.println("Email Invalido!!!");
		}
	}

}
