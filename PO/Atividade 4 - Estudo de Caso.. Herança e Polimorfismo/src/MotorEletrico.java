/**
 * Class do motor elétrico extends da classe ProdutoWEG 
 * 
 * @author Kauê Schaefer de Andrade
 *
 */
public class MotorEletrico extends ProdutoWEG {
	
	/** Propriedade tipo de enrolamento do motor */
	private String tipoDeEnrolamento;
	/** Propriedade eficiência do motor */
	private String eficiencia;
	
	/**
	 * Método construtor
	 */
	
	public MotorEletrico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método de construtor
	 */
	
	public MotorEletrico(String codigo, String tipo, float potencia, float tensao, String capacidade, float preco,
			ServicoManutencao servico, String tipoDeEnrolamento, String eficiencia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco, servico);
		this.tipoDeEnrolamento = tipoDeEnrolamento;
		this.eficiencia = eficiencia;
	}


	/**
	 * Método para retornar o tipo de enrolamento do motor
	 * 
	 * @return tipoDeEnrolamento
	 */
	public String getTipoDeEnrolamento() {
		return tipoDeEnrolamento;
	}

	/**
	 * Procedimento para verificar o tipo de enrolamento do motor
	 * 
	 * @param tipoDeEnrolamento
	 */
	public void setTipoDeEnrolamento(String tipoDeEnrolamento) {
		this.tipoDeEnrolamento = tipoDeEnrolamento;
	}
	
	
	/**
	 * Método para retornar a eficiência do motor
	 * 
	 * @return eficiencia
	 */
	public String getEficiencia() {
		return eficiencia;
	}
	/**
	 * Procedimento para verificar a eficiência do motor
	 * 
	 * @param eficiencia
	 */
	public void setEficiencia(String eficiencia) {
		this.eficiencia = eficiencia;
	}
	
}
