
public class Cachorro extends Animal{

	//Atributos
	private String nome;
	private String raca;
	private String porte;
	private boolean adestrado;
	private boolean castrado;
	
	
	//Construtor da classe pai
	public Cachorro(String nomeCientifico, String tamanho, float peso) {
		super(nomeCientifico, tamanho, peso);
		// TODO Auto-generated constructor stub
	}
	
	
	// Getters and Setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public String getPorte() {
			return porte;
		}

		public void setPorte(String porte) {
			this.porte = porte;
		}

		public boolean isAdestrado() {
			return adestrado;
		}

		public void setAdestrado(boolean adestrado) {
			this.adestrado = adestrado;
		}

		public boolean isCastrado() {
			return castrado;
		}

		public void setCastrado(boolean castrado) {
			this.castrado = castrado;
		}
		
	
	//Métodos
	public String latir() {
		return "Auauau...";
	}
	
	public String reproduzir() {
		// Sobrescrita de métodos;
		if(!this.castrado) {
			return "Reproduzindo cachorrinhos";
		}
		return "Este cachorro é castrado!";
	}
	
	public String morder() {
		return "Nhac nhac";
	}
	
}
