package Secretaria;

import java.util.Date;

public class Aluno {
	private String nome;
	private String dataNascimento;
	private String matricula;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String responsavel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0 && nome.matches("[A-Za-z")) {
			this.nome = nome;
		}
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.length() >9 && dataNascimento.length() <11 && dataNascimento.matches("0-9")) {
			this.dataNascimento = dataNascimento;
		}
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if (matricula.matches("0-9")) {
			this.matricula = matricula;
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length()>10 && cpf.length()<12 && cpf.matches("0-9")) {
			this.cpf = cpf;
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
		if(telefone.length()>10 && telefone.length()<12 && telefone.matches("0-9")) {
			this.telefone = telefone;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		if (responsavel.matches("[A-Za-z"))
		this.responsavel = responsavel;
	}

}
