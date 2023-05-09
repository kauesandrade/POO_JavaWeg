package Secretaria;

public class Avaliacao {
	private String notas;

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		if (notas.length() > 0) {
			this.notas = notas;
		}else {
			System.out.println("Nota invalida");
		}
		
	}

}
