package Secretaria;

public class Teste {

	public static void main(String[] args) {
		// Public = todos
		// Privete = somente o objeto
		// Protected = todos do mesmo pacote
		
		Aluno aluno1 = new Aluno("Kauê Schaefer de Andrade");
		Curso curso1 = new Curso("Programação de Sistema");
		UnidadeCurricular unidadeCurricular1 = new UnidadeCurricular("Programação Orientada a Objeto",curso1);
		Matricula matricula1 = new Matricula(aluno1, unidadeCurricular1);
		Avaliacao avaliacao1 = new Avaliacao("JAVA",unidadeCurricular1);
		Notas notas1 = new Notas(aluno1, avaliacao1, (float) 8.6);
		
		//______________TESTE DA CLASSE ALUNOS______________\\
		
		System.out.println("Classe Aluno!!:");
		
		System.out.println("Nome: "+aluno1.getNome());
		
		aluno1.setCpf("123.456.789-12");
		System.out.println("CPF: "+aluno1.getCpf());
		
		aluno1.setDataNascimento("24/04/2006");
		System.out.println("Data de Nascimento: "+aluno1.getDataNascimento());
		
		aluno1.setEmail("kauesandrade206@gmail.com");
		System.out.println("Email: "+aluno1.getEmail());
		
		aluno1.setEndereco("Frederico barg, 85");
		System.out.println("Endereço: "+aluno1.getEndereco());
		
		aluno1.setResponsavel("Carlor Roberto de Andrade");
		System.out.println("Responsável: "+aluno1.getResponsavel());
		
		aluno1.setTelefone("(47)992907780");
		System.out.println("Telefone: "+aluno1.getTelefone());
		
		//______________TESTE DA CLASSE MATRICULA______________\\
		
		System.out.println("\nClasse Matricula!!:");
		
		matricula1.setCodigo("S12345");
		System.out.println("Código: "+matricula1.getCodigo());
		System.out.println("Nome do aluno: "+matricula1.getAluno().getNome());
		System.out.println("Nome da Unidade curricular: "+matricula1.getUnidadeCurricular().getNome());
		
		
		//______________TESTE DA CLASSE CURSO______________\\
		
		System.out.println("\nClasse Curso!!:");
		
		System.out.println("Nome do curso: "+curso1.getNome());
		
		//______________TESTE DA CLASSE UNIDADE CURRICULAR______________\\
		
		System.out.println("\nClasse UnidadeCurricular!!:");
		
		System.out.println("Nome da Unidade curricular: "+unidadeCurricular1.getNome());
		System.out.println("Nome do curso: "+unidadeCurricular1.getCurso().getNome());
		
		//______________TESTE DA CLASSE AVALIACAO______________\\
		
		System.out.println("\nClasse Avaliacao!!:");
		
		System.out.println("Nome da avaliação: "+avaliacao1.getNome());
		System.out.println("Nome da Unidade curricular: "+avaliacao1.getUnidadeCurricular().getNome());
		
		
		//______________TESTE DA CLASSE NOTAS______________\\
		
		System.out.println("\nClasse Notas!!:");
		
		System.out.println("Nota: "+notas1.getNota());
		System.out.println("Nome do aluno: "+notas1.getAluno().getNome());
		System.out.println("Nome da avalção: "+notas1.getAvaliacao().getNome());
		

		
		
		

	}

}
