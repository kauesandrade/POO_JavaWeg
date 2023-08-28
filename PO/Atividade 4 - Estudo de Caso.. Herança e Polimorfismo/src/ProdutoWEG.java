
/**
 * Superclasse dos produtos da WEG 
 * 
 * @author Kauê Schaefer de Andrade
 *
 */

public class ProdutoWEG {
	
	/** Propriedade código do produto */
	private String codigo;
	/** Propriedade tipo do produto */
	private String tipo;
	/** Propriedade potência do produto */
	private float potencia;
	/** Propriedade tensão do produto */
	private float tensao;
	/** Propriedade capacidade do produto */
	private String capacidade;
	/** Propriedade preço do produto */
	private float preco;
	/** Propriedade Serviço de Manutenção */
	private ServicoManutencao servico;
	
	
	/**
	 * Método de construtor
	 */
	
	public ProdutoWEG() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método de construtor
	 */
	
	public ProdutoWEG(String codigo, String tipo, float potencia, float tensao, String capacidade, float preco,
			ServicoManutencao servico) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.potencia = potencia;
		this.tensao = tensao;
		this.capacidade = capacidade;
		this.preco = preco;
		this.servico = servico;
	}

	/**
	 * Método para realizar o serviço de manutenção de um produto
	 */
	public void realizarManutencao(ServicoManutencao servico) {
		this.servico = servico;
	};
	
	
	/**
	 * Método para retornar serviço de Manutenção
	 * 
	 * @return servico
	 */
	public ServicoManutencao getServico() {
		return servico;
	}
	/**
	 * Procedimento para verificar o serviço de manutenção
	 * 
	 * @param servico
	 */
	public void setServico(ServicoManutencao servico) {
		this.servico = servico;
	}
	
	
	/**
	 * Método para retornar o código do produto
	 * 
	 * @return codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * Procedimento para verificar o código do produto
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	/**
	 * Método para retornar o tipo do produto
	 * 
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * Procedimento para verificar o tipo do produto
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	/**
	 * Método para retornar a potência do produto
	 * 
	 * @return potencia
	 */
	public float getPotencia() {
		return potencia;
	}
	/**
	 * Procedimento para verificar a potência do produto
	 * 
	 * @param potencia
	 */
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	
	/**
	 * Método para retornar a tensão do produto
	 * 
	 * @return tensao
	 */
	public float getTensao() {
		return tensao;
	}
	/**
	 * Procedimento para verificar a tensão do produto
	 *
	 * @param tensao
	 */
	public void setTensao(float tensao) {
		this.tensao = tensao;
	}
	
	
	/**
	 * Método para retornar a capacidade do produto
	 * 
	 * @return capacidade
	 */
	public String getCapacidade() {
		return capacidade;
	}
	/**
	 * Procedimento para verificar a capacidade do produto
	 * 
	 * @param capacidade
	 */
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	
	/**
	 * Método para retornar o preço do produto
	 * 
	 * @return preco
	 */
	public float getPreco() {
		return preco;
	}
	/**
	 * Procedimento para verificar o preço do produto
	 * 
	 * @param preco
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
