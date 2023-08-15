
public class Peixe extends Animal{

	private String nome;
	private String porte;
	private String raca;
	private boolean venenoso;
	
	public Peixe(String nomeCientifico, String tamanho, float peso) {
		super(nomeCientifico, tamanho, peso);
		// TODO Auto-generated constructor stub
	}

	public Peixe() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	

	public String locomover(String sentido, float velocidade) {
		return "O pexinho está nadando no sentido "+ sentido + "e na velocidade " + velocidade;
	}
	public String bolhas() {
		return "Blub blub";
	}
	public String mostrarPeixe() {
		return "                        ############              \r\n"
				+ "--####              ######################        \r\n"
				+ "  ######        ##############################    \r\n"
				+ "  ##########  ##################################  \r\n"
				+ "    ######################################  ######\r\n"
				+ "    ##############################################\r\n"
				+ "    ##############################################\r\n"
				+ "    ##############################################\r\n"
				+ "  ##########  ##################################  \r\n"
				+ "  ######        ############################..    \r\n"
				+ "  ##                ######################        \r\n"
				+ "                        ..##########   ";
	}
	
}
