
public class ServicoManutencao {
	private float custo;
	private String descricao;
	
	public ServicoManutencao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
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
