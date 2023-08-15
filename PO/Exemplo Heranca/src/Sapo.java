
public class Sapo {
	
	private String nome;
	private boolean venenoso;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
	public String lancarLingua() {
		return "Slap slap";
	}
	public String locomover(String sentido, float velocidade) {
		return ",,    ,,\r\n"
				+ " \\    /\r\n"
				+ " /    \\\r\n"
				+ " \\    /\r\n"
				+ "  \\__/\r\n"
				+ " ./  \\.\r\n"
				+ " |    |\r\n"
				+ "/ \\oo/ \\\r\n"
				+ "\\      /\r\n"
				+ "\"      \""
				+"O sapo está pulando para cima no sentido "+ sentido + " e na velocidade " + velocidade + "km/h";
	}
	public String somSapo() {
		return "kré-kré";
	}
	public String mostrarSapo() {
		return "    _    _\r\n"
				+ "   (o)--(o)\r\n"
				+ "  /.______.\\\r\n"
				+ "  \\________/\r\n"
				+ " ./        \\.\r\n"
				+ "( .        , )\r\n"
				+ " \\ \\_\\\\//_/ /\r\n"
				+ "  ~~  ~~  ~~";
	}
}
