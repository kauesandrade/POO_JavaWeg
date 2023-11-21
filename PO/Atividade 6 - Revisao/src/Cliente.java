import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;

	private ArrayList<Pedido> historicoPedido = new ArrayList<Pedido>();

	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Pedido> getHistoricoPedido() {
		return getHistoricoPedido();
	}

	public void setHistoricoPedido(ArrayList<Pedido> historicoPedido) {
		this.historicoPedido = historicoPedido;
	}

	public void addCompra(Pedido pedido) {
		historicoPedido.add(pedido);
	}

	public void rmvCompra(int id) {
		historicoPedido.remove(id);
	}

	public void enviarEmail() {
		System.out.println("Email de promoção enviador para o email: " + email);
	}

}
