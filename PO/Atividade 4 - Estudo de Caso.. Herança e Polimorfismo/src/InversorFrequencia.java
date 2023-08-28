/**
 * Classe inversor de frequencia extends da classe ProdutoWEG
 * 
 * @author Kauê Schaefer de Andrade
 *
 */

public class InversorFrequencia extends ProdutoWEG {
	
	/** Propriedade capacidade de frequência do inversor */
	private String capacidadeDeFrequencia;
	/** Propriedade número de fases do inversor */
	private float numeroDeFases;
	
	/**
	 * Método construtor 
	 */
	
	public InversorFrequencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método construtor 
	 */
	
	public InversorFrequencia(String codigo, String tipo, float potencia, float tensao, String capacidade, float preco,
			ServicoManutencao servico, String capacidadeDeFrequencia, float numeroDeFases) {
		super(codigo, tipo, potencia, tensao, capacidade, preco, servico);
		this.capacidadeDeFrequencia = capacidadeDeFrequencia;
		this.numeroDeFases = numeroDeFases;
	}


	/**
	 * Método para retornar a capacidade de frequência do inversor
	 * 
	 * @return capacidadeDeFrequencia
	 */
	public String getCapacidadeDeFrequencia() {
		return capacidadeDeFrequencia;
	}
	/**
	 * Procedimento para verificar a capacidade de frequência do inversor
	 * 
	 * @param capacidadeDeFrequencia
	 */
	public void setCapacidadeDeFrequencia(String capacidadeDeFrequencia) {
		this.capacidadeDeFrequencia = capacidadeDeFrequencia;
	}
	
	
	/**
	 * Método para retornar o número de fases do inversor
	 * 
	 * @return numeroDeFases
	 */
	public float getNumeroDeFases() {
		return numeroDeFases;
	}
	/**
	 * Procedimento para verificar o número de fases do inversor
	 * 
	 * @param numeroDeFases
	 */
	public void setNumeroDeFases(float numeroDeFases) {
		this.numeroDeFases = numeroDeFases;
	}
}
