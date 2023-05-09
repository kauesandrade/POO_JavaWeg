package Secretaria;

public class teste {

	public static void main(String[] args) {
		// Public = todos
		// Privete = somente o objeto
		// Protected = todos do mesmo pacote
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Kauê Schaefer de Andrade");
		System.out.println(aluno1.getNome());
		aluno1.setCpf("123.456.789-12");
		System.out.println(aluno1.getCpf());
		aluno1.setDataNascimento("24/04/2006");
		System.out.println(aluno1.getDataNascimento());
		aluno1.setEmail("kauesandrade206@gmail.com");
		System.out.println(aluno1.getEmail());
		aluno1.setEndereco("Frederico barg, 85");
		System.out.println(aluno1.getEndereco());
		aluno1.setMatricula("1234555");
		System.out.println(aluno1.getMatricula());
		aluno1.setResponsavel("Carlor Roberto de Andrade");
		System.out.println(aluno1.getResponsavel());
		aluno1.setTelefone("(47)992907780");
		System.out.println(aluno1.getTelefone());
		
//		Curso programacao = new Curso();
//		
//		programacao.setCargaHoraria(2880);
//		System.out.println(programacao.getCargaHoraria());
//		programacao.setMateria("Programação java");
//		System.out.println(programacao.getMateria());
//		programacao.setNome("Programação de Sistemas");
//		System.out.println(programacao.getNome());
//		
//		Matricula matricula1 = new Matricula();
//	
//		matricula1.setCurso("Programação de Sistemas");
//		System.out.println(matricula1.getCurso());
//		matricula1.setNumero(1234);
//		System.out.println(matricula1.getNumero());
//		matricula1.setTurma("MI 73");
//		System.out.println(matricula1.getTurma());
//		
//		UnidadeCurricular java = new UnidadeCurricular();
//		
//		java.setAvaliacao("Prova 1");
//		System.out.println(java.getAvaliacao());
//		java.setFrequencia(100);
//		System.out.println(java.getFrequencia());
//		java.setProfessor("Rodrigo Willemann");
//		System.out.println(java.getProfessor());
//		
//		Avaliacao prova1 = new Avaliacao();
//		
//		prova1.setNotas("10");
//		System.out.println(prova1.getNotas());
//		
//		Professores professor = new Professores();
//		
//		professor.setNome("Rodrigo Willemann");
//		System.out.println(professor.getNome());
//		professor.setDataNascimento("19/03/1970");
//		System.out.println(professor.getDataNascimento());
//		professor.setCpf("123456789-12");
//		System.out.println(professor.getCpf());
//		professor.setEmail("rodrigowillemann@gmail.com");
//		System.out.println(professor.getEmail());
//		professor.setEndereco("Rua Lago das caldeiras 89");
//		System.out.println(professor.getEndereco());
//		professor.setMatricula("18976543");
//		System.out.println(professor.getMatricula());
//		professor.setTelefone("(47)992907780");
//		System.out.println(professor.getTelefone());
//		
		
		

	}

}
