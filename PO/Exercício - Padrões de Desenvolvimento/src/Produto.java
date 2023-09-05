/**
 * A classe Produto representa um produto com nome, preço e quantidade.
 * @author Kauê Schaefer de Andrade
 * 
 */
public class Produto {
	
	// Atributos da classe
	private String nome;
	private double preco;
	private int quantidade;

	/**
	 * Construtor da classe Produto.
	 * 
	 * @param nome_produto O nome do produto.
	 * @param preco O preço do produto.
	 * @param quantidade A quantidade de unidades do produto.
	 */
    public Produto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    
    /**
     * Construtor vazio da classe Produto.
     */
    public Produto() {
    	
	}

    /**
     * Calcula o valor total do produto (preço multiplicado pela quantidade).
     * 
     * @return O valor total do produto.
     */
	public double calcularTotal() {
        return this.preco * this.quantidade;
    }

    /**
     * Retorna os detalhes do produto em formato de string.
     * 
     * @return Uma string com os detalhes do produto.
     */
    public String exibirDetalhesDoProduto() {
    	return "Produto: " + this.nome +
    			"\nPreço: " + this.preco +
    			"\nQuantidade: " + this.quantidade;
    }
    
    /**
     * Retorna os detalhes do produto em formato de string.
     * 
     * @return Uma string com os detalhes do produto.
     */
    
    @Override
    public String toString() {
    	return "Produto: " + this.nome +
    			"\nPreço: " + this.preco +
    			"\nQuantidade: " + this.quantidade;
    }

	/**
	 * Obtém o nome do produto.
	 * 
	 * @return O nome do produto.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do produto.
	 * 
	 * @param nome O nome do produto.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtém o preço do produto.
	 * 
	 * @return O preço do produto.
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Define o preço do produto.
	 * 
	 * @param preco O preço do produto.
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * Obtém a quantidade de unidades do produto.
	 * 
	 * @return A quantidade de unidades do produto.
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Define a quantidade de unidades do produto.
	 * 
	 * @param quantidade A quantidade de unidades do produto.
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
