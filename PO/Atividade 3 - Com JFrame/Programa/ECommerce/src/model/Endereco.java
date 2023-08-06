package model;

import java.util.ArrayList;

public class Endereco {

	private String identificacao;
	private String rua;
	private String cep;
	private String pais;
	private String cidade;
	private String uf;
	private int numero;
	private String complemento;
	
	
	
	
	public Endereco(String identificacao, String cep, String rua, int numero, String pais, String uf, String cidade,
			String complemento) {
		
		super();
		this.identificacao = identificacao;
		this.rua = rua;
		this.cep = cep;
		this.pais = pais;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.complemento = complemento;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
