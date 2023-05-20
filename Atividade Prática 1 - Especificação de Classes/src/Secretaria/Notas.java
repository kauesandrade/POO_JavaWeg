package Secretaria;

public class Notas {

	private Aluno aluno;
	private Avaliacao avaliacao;
	private float Nota;
	
	public Notas(Aluno aluno, Avaliacao avaliacao, float nota) {
		setAluno(aluno);
		setAvaliacao(avaliacao);
		setNota(nota);
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		if(aluno.getNome() != null) {
			this.aluno = aluno;
		}else {
			System.out.println("Não existe aluno!!!");
		}
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		if(avaliacao.getNome() != null) {
			this.avaliacao = avaliacao;
		}else {
			System.out.println("Não existe avaliação!!!");
		}
	}

	public float getNota() {
		return Nota;
	}

	public void setNota(float nota) {
		if(nota >= 0.0 && nota <= 10.0) {
			Nota = nota;
		}else {
			System.out.println("Nota invalida");
		}
	}
	
}
