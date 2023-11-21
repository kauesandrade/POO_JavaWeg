import java.util.ArrayList;

public class Pedido {
	
	private int numeroPedido;
	private Envio envio;
	private Pagamento pagamento;
	private Cliente cliente;
	private ArrayList<Produto> produtosPedidos = new ArrayList<Produto>();
    private ArrayList<Integer> quantidades = new ArrayList<Integer>();
	
	public Pedido(int numeroPedido, Envio envio, Pagamento pagamento, Cliente cliente,
			ArrayList<Produto> produtosPedidos, ArrayList<Integer> quantidades) {
		super();
		this.numeroPedido = numeroPedido;
		this.envio = envio;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.produtosPedidos = produtosPedidos;
		this.quantidades = quantidades;
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public Envio getEnvio() {
		return envio;
	}
	public void setEnvio(Envio envio) {
		this.envio = envio;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Produto> getProdutosPedidos() {
		return produtosPedidos;
	}
	public void setProdutosPedidos(ArrayList<Produto> produtosPedidos) {
		this.produtosPedidos = produtosPedidos;
	}
	public ArrayList<Integer> getQuantidades() {
		return quantidades;
	}
	public void setQuantidades(ArrayList<Integer> quantidades) {
		this.quantidades = quantidades;
	}
	public void emitirNotaFiscal() {
		
		String produtoCarrinho = "";
		
		for(int i = 0; i < produtosPedidos.size(); i++) {
			
			produtoCarrinho += "\nProduto: "+ produtosPedidos.get(i).getNome() + "Preço: "+ produtosPedidos.get(i).getPreco()
								+ "Quantidade: " + quantidades.get(i);
		}
		
		System.out.println("=============NOTA FISCAL============="
				+ "\nNúmero do Pedido: "+numeroPedido
				+ "\nValor: " + pagamento.getValorTotal()
				+ "\nDestinatario: " + cliente.getNome()
				+ "\nCPF do destinatario: " + cliente.getCpf()
				+ "\nRemetente: Lojas Luiz"
				+ "\nTransportadora: " + envio.getTransportadora()
				+ produtoCarrinho); 
				
	}
    public void acompanharStatus() {
        System.out.println(envio.getStatus());
    }

	
}
