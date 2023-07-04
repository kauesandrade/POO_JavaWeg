package window;

public class Produto {
	private String Nome;
	private String Cor;
	private Double Preco;
	private String Categoria;
	private String Modelo;
	private String Descricao;
	
	public String getTudo() {
		return "Nome: "+Nome+
				"\nPreço: "+Preco+
				"\nCor: "+Cor+
				"\nCategoria: "+Categoria+
				"\nModelo: "+Modelo+
				"\nDecrição: "+Descricao;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public Double getPreço() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
}
