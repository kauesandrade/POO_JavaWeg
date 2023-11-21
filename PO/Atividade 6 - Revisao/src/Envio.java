
public class Envio {

	private String cep;
	private String endereco;
	private String status;
	private String transportadora;
	
	public Envio(String cep, String endereco, String transportadora) {
		super();
		this.cep = cep;
		this.endereco = endereco;
		this.status = "Pedido em Transporte";
		this.transportadora = transportadora;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public void avisoEntrege() {
		this.status = "Pedido Entregue";
		System.out.println("Seu pedido foi entregue!");
	}
}
