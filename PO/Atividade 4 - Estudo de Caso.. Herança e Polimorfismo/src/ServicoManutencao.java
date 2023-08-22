/**
 * Classe serviços de Manutenção
 * 
 * @author Kauê Schaefer de Andrade
 *
 */
public class ServicoManutencao {
	
	/** Propriedade custo da manutenção */
	private float custo;
	/** Propriedade	descrição da manutenção */
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


	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		this.custo = custo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
