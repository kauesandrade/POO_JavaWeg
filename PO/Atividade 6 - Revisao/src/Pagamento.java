
public class Pagamento {

	private double valorTotal;
	private String metodoPagamento;
	private int parcelas;

	public Pagamento(double valorTotal, String metodoPagamento, int parcelas) {
		super();
		this.valorTotal = valorTotal;
		this.metodoPagamento = metodoPagamento;
		this.parcelas = parcelas;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public void calcularParcelas() {
		System.out.println("O valor de cada parcela são: " + valorTotal / parcelas);
	}

}
