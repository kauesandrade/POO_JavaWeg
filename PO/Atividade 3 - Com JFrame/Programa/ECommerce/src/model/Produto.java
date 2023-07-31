package model;

import java.util.ArrayList;

import javax.swing.JLabel;

public class Produto {

	public Produto() {
		super();
		
	}
	
	private String nome;
	private Double preco;
	private String categoria;
	private int avaliacao;
	private String modelo;
	private String marca;
	private String cor;
	private String descricao;
	private String fotos;
	private int limiteDeCompras;
	private int quantidadeEstoque;
	private int quatidadeCarrinho;
	private int row;
	

	public Produto(String nome, Double preco, int avaliacao, String modelo, String marca, String cor,
			String descricao, String fotos, int limiteDeCompras, String categoria, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.avaliacao = avaliacao;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.descricao = descricao;
		this.fotos = fotos;
		this.limiteDeCompras = limiteDeCompras;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String CadastrarProduto(String nome, Double preco, String categoria, String modelo,
			String marca, String cor, String descricao, int limiteDeCompras, int quantidadeEstoque) {
		setNome(nome);
		setPreco(preco);
		setCategoria(categoria);
		setModelo(modelo);
		setMarca(marca);
		setCor(cor);
		setDescricao(descricao);
		setLimiteDeCompras(limiteDeCompras);
		setQuantidadeEstoque(quantidadeEstoque);
		
		if(getNome() == null) {
			return "Digite um Nome valido!";
		}else if(getPreco() == null) {
			return "Digite um Preco valido!";
		}else if(getCategoria() == null) {
			return "Escolha uma Categoria valida!";
		}else if(getModelo() == null) {
			return "Digite um Modelo valido!";
		}else if(getMarca() == null) {
			return "Digite uma Marca valida!";
		}else if(getCor() == null){
			return "Digite uma Cor valida!";
		}else if(getDescricao() == null) {
			return "Digite uma Descrição valida!";
		}else if(getLimiteDeCompras() == 0) {
			return "Digite um Limite de compras valido!";
		}else if(getQuantidadeEstoque() == 0) {
			return "Digite uma Quantide maior que 0";
		}
		return "A";
		
	}
	
	public String editarProduto(String nome, Double preco, String categoria, String modelo,
			String marca, String cor, String descricao, int limiteDeCompras, int quantidadeEstoque) {
		setNome(nome);
		setPreco(preco);
		setCategoria(categoria);
		setModelo(modelo);
		setMarca(marca);
		setCor(cor);
		setDescricao(descricao);
		setLimiteDeCompras(limiteDeCompras);
		setQuantidadeEstoque(quantidadeEstoque);
		
		if(getNome() == null) {
			return "Digite um Nome valido!";
		}else if(getPreco() == null) {
			return "Digite um Preco valido!";
		}else if(getCategoria() == null) {
			return "Escolha uma Categoria valida!";
		}else if(getModelo() == null) {
			return "Digite um Modelo valido!";
		}else if(getMarca() == null) {
			return "Digite uma Marca valida!";
		}else if(getCor() == null){
			return "Digite uma Cor valida!";
		}else if(getDescricao() == null) {
			return "Digite uma Descrição valida!";
		}else if(getLimiteDeCompras() == 0) {
			return "Digite um Limite de compras valido!";
		}else if(getQuantidadeEstoque() == 0) {
			return "Digite uma Quantide maior que 0";
		}
		return "A";
		
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	int quant = 0;
	public void setAvaliacao(int avaliacao) {
		
		if(avaliacao <= 5 && avaliacao >=0) {
			quant++;
			this.avaliacao = (avaliacao + this.avaliacao) / quant;
		}
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFotos() {
		return fotos;
	}
	public void setFotos(String fotos) {
		this.fotos = fotos;
	}
	public int getLimiteDeCompras() {
		return limiteDeCompras;
	}
	public void setLimiteDeCompras(int limiteDeCompras) {
		this.limiteDeCompras = limiteDeCompras;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public int getQuatidadeCarrinho() {
		return quatidadeCarrinho;
	}

	public void setQuatidadeCarrinho(int quatidadeCarrinho) {
		this.quatidadeCarrinho = quatidadeCarrinho;
	}
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getTudo() {
	
		return "Nome: "+nome+
				"\nPreço: R$"+preco+
				"\nMarca: "+marca+"\n";
	}
}
