package Secretaria;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Carlos");
		aluno1.setCpf("11855307979");
		aluno1.setEmail("carlosbolzanell@gmail.com");
		aluno1.setEndereco("Frederico barg 85");
		aluno1.setMatricula("1234");
		aluno1.setResponsavel("Roseli de Souza Ortiz");
		aluno1.setTelefone("47997718238");
		
		Curso programacao = new Curso();
		
		programacao.setCargaHoraria(2880);
		programacao.setMateria("Programação java");
		programacao.setNome("Programação de Sistemas");
		
		Matricula matricula1 = new Matricula();
		
		matricula1.setCurso("Programação de Sistemas");
		matricula1.setNumero(1234);
		matricula1.setTurma("MI 73");
		
		UnidadeCurricular java = new UnidadeCurricular();
		
		java.setAvaliacao("Prova 1");
		java.setFrequencia(100);
		java.setProfessor("Rodrigo Willemann");
		
		Avaliacao prova1 = new Avaliacao();
		
		prova1.setNotas("10");
		
		Professores professor = new Professores();
		
		professor.setNome("Rodrigo Willemann");
		professor.setDataNascimento("19/03/1970");
		professor.setCpf("07907907979");
		professor.setEmail("rodrigowillemann@gmail.com");
		professor.setEndereco("Rua Lago das caldeiras 89");
		professor.setMatricula("18976543");
		professor.setTelefone("4789087639");
		
		
		

	}

}
