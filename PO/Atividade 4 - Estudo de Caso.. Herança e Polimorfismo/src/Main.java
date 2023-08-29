import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static WEG weg = new WEG();

	/**
	 * Método principal que inicia a interação com o usuário.
	 *
	 * @param args Os argumentos de linha de comando.
	 */

	public static void main(String[] args) {

		comeco();

	}

	/**
	 * Método que fará a interação inicial com o usuário e iniciará os outros métodos
	 * 
	 */
	
	public static void comeco() {

		int opcao = 0;

		System.out.println("!===========Bem Vindo a WEG!!===========!");
		System.out.println("O que deseja fazer? " + "\n 1 - Adicionar um novo produto" + "\n 2 - Remover produto"
				+ "\n 3 - Ver Produtos" + "\n 4 - Adicionar serviço de manutenção" + "\n 5 - Ver serviços de manutenção"
				+ "\n 0 - Sair" );

		opcao = sc.nextInt();

		switch (opcao) {
		case 0:
			break;
		case 1:
			addProduto();
			break;
		case 2:
			rmvProduto();
			break;
		case 3:
			verProdutos();
			break;
		case 4:
			addManutencao();
			break;
		case 5:
			verServicosManutencao();
			break;
		}

	}
	
	/**
	 * Método para adicionar um novo produto
	 * 
	 */

	public static void addProduto() {

		int opcao = 0;
		System.out.println("\n!==========================!");
		System.out.println("O que deseja adicionar?" + "\n 1 - Motor Eletrico" + "\n 2 - Inversor de Frequência"
				+ "\n 3 - Gerador" + "\n 0 - Voltar");

		opcao = sc.nextInt();

		String codigo = "";
		String tipo = "";
		float potencia = 0;
		float tensao = 0;
		String capacidade = "";
		float preco = 0;

		switch (opcao) {
		case 0:
			comeco();
			break;

		case 1:
			System.out.println("\nDigite o código do motor eletrico: ");
			codigo = sc.next();
			System.out.println("\nDigite o tipo / nome do motor eletrico: ");
			tipo = sc.next();
			System.out.println("\nDigite a potência do motor eletrico: ");
			potencia = sc.nextFloat();
			System.out.println("\nDigite a tensão do motor eletrico: ");
			tensao = sc.nextFloat();
			System.out.println("\nDigite a capacidade do motor eletrico: ");
			capacidade = sc.next();
			System.out.println("\nDigite o preço do motor eletrico: ");
			preco = sc.nextFloat();
			System.out.println("\nDigite o tipo de enrolamento do motor eletrico: ");
			String enrolamento = sc.next();
			System.out.println("\nDigite a eficiencia do motor eletrico: ");
			String eficiencia = sc.next();

			MotorEletrico ME = new MotorEletrico(codigo, tipo, potencia, tensao, capacidade, preco, null, enrolamento,
					eficiencia);

			weg.addProdutoDisponivel(ME);
			System.out.println("\n!!! Produto Adicionar com sucesso !!!\n");
			comeco();
			break;

		case 2:
			System.out.println("\nDigite o código do inversor de frequência: ");
			codigo = sc.next();
			System.out.println("\nDigite o tipo / nome do inversor de frequência: ");
			tipo = sc.next();
			System.out.println("\nDigite a potência do inversor de frequência: ");
			potencia = sc.nextFloat();
			System.out.println("\nDigite a tensão do inversor de frequência: ");
			tensao = sc.nextFloat();
			System.out.println("\nDigite a capacidade do inversor de frequência: ");
			capacidade = sc.next();
			System.out.println("\nDigite o preço do inversor de frequência: ");
			preco = sc.nextFloat();
			System.out.println("\nDigite a capacidade de frequência do inversor de frequência: ");
			String capacidadeFrequencia = sc.next();
			System.out.println("\nDigite o número de fases do inversor de frequência: ");
			float numFases = sc.nextFloat();

			InversorFrequencia FE = new InversorFrequencia(codigo, tipo, potencia, tensao, capacidade, preco, null,
					capacidadeFrequencia, numFases);

			weg.addProdutoDisponivel(FE);
			System.out.println("\n!!! Produto Adicionar com sucesso !!!\n");
			comeco();
			break;

		case 3:
			System.out.println("\nDigite o código do gerador: ");
			codigo = sc.next();
			System.out.println("\nDigite o tipo / nome do gerador: ");
			tipo = sc.next();
			System.out.println("\nDigite a potência do gerador: ");
			potencia = sc.nextFloat();
			System.out.println("\nDigite a tensão do gerador: ");
			tensao = sc.nextFloat();
			System.out.println("\nDigite a capacidade do gerador: ");
			capacidade = sc.next();
			System.out.println("\nDigite o preço do gerador: ");
			preco = sc.nextFloat();
			System.out.println("\nDigite o tipo de combustível do gerador: ");
			String tipoDeCombustivel = sc.next();
			System.out.println("\nDigite a autonomia do gerador: ");
			String autonomia = sc.next();

			Gerador GE = new Gerador(codigo, tipo, potencia, tensao, capacidade, preco, null, tipoDeCombustivel,
					autonomia);

			weg.addProdutoDisponivel(GE);

			System.out.println("\n!!! Produto Adicionar com sucesso !!!\n");
			comeco();
			break;
		}

	}
	
	/**
	 * Método que removerá um produto já adicionado
	 * 
	 */

	public static void rmvProduto() {
		System.out.println("\n!===========================!");
		System.out.println("Qual produto deseja remover: ");
		System.out.println(weg.listarProdutosDisponiveis());
		System.out.println("0 - Voltar");

		int opcao = 0;

		opcao = sc.nextInt();

		if (opcao == 0) {
			comeco();
		} else if (opcao > 0 && opcao <= weg.getArrListaProdutosDisponiveis().size()) {

			System.out.println("\nVocê tem certeza?");
			System.out.println("1 - Sim / 2 - Não");

			int certeza = sc.nextInt();

			if (certeza == 1) {
				weg.rmvProduto(opcao);
				System.out.println("\n!!! Produto Removido com Sucesso!!!\n");
				comeco();
			} else {
				rmvProduto();
			}

		}

	}
	
	/**
	 * Método que adicionara um serviço de manutenção ao produto
	 * 
	 */

	public static void addManutencao() {
		
		System.out.println("\n!========================================!");
		System.out.println("Qual produto deseja adicionar Manuteção: ");
		System.out.println(weg.listarProdutosDisponiveis());

		if (weg.getArrListaProdutosDisponiveis().size()!=0) {
			System.out.println("0 - Voltar");
			int opcao = 0;

			opcao = sc.nextInt();

			if (opcao == 0) {
				comeco();
			} else {
				System.out.println("\nDigite o custo da manutenção: ");
				float custo = sc.nextFloat();
				System.out.println("\nDigite a descrição da manutenção: ");
				String manutencao = sc.next();

				ServicoManutencao SM = new ServicoManutencao(custo, manutencao);

				weg.addServicoManutencao(SM, opcao);

				System.out.println("\nServiço de manutenção adicionado com sucesso!!!\n");
				comeco();
			}
		}else {
			comeco();
		}
		
	}
	
	/**
	 * Método para ver os serviços de manutenção existentes
	 * 
	 */

	public static void verServicosManutencao() {
		System.out.println("\n!====================================!");
		System.out.println("Os serviços de manutenção disponíveis: ");
		System.out.println(weg.listarServicosManutencao() + "\n");
		comeco();
	}
	
	/**
	 * Método para ver os produtos existentes
	 * 
	 */

	public static void verProdutos() {
		
		System.out.println("\n!======================!");
		System.out.println("Aqui estão os produtos: ");
		System.out.println(weg.listarProdutosDisponiveis() + "\n");
		comeco();
	}

}
