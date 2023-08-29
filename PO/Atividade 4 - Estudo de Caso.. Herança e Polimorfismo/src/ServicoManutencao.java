/**
 * Classe serviços de Manutenção
 * 
 * @author Kauê Schaefer de Andrade
 *
 */
public class ServicoManutencao {

	/** Propriedade custo da manutenção */
	private float custo;
	/** Propriedade descrição da manutenção */
	private String descricao;

	/**
	 * Método de construtor
	 */
	public ServicoManutencao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Método de construtor
	 * 
	 * @param custo, descricao
	 */
	public ServicoManutencao(float custo, String descricao) {
		super();
		setCusto(custo);
		setDescricao(descricao);
	}

	/**
	 * Obtém o custo do serviço
	 *
	 * @return custo
	 */

	public float getCusto() {
		return custo;
	}

	/**
	 * Define o custo do serviço
	 *
	 * @param custo
	 */

	public void setCusto(float custo) {
		this.custo = custo;
	}

	/**
	 * Obtém a descrição do serviço
	 *
	 * @return descricao
	 */

	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define a descrição do serviço
	 *
	 * @param descricao
	 */

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
