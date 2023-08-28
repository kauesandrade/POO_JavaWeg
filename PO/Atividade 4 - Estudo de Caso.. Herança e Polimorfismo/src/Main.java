import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static WEG weg = new WEG();
	
	public static void main(String[] args) {
		
		comeco();
		
		
		

	}
	
	public static void comeco() {
		
		int opcao = 0;
		
		System.out.println("!===========Bem Vindo a WEG!!===========!");
		System.out.println("O que deseja fazer? "
							+ "\n 1 - Adicionar um novo produto"
							+ "\n 2 - Remover produto"
							+ "\n 3 - Editar produto"
							+ "\n 4 - Realizar manutenção"
							+ "\n 5 - Ver Produtos"
							+ "\n 0 - Sair");
		
		opcao = sc.nextInt();
		
		switch (opcao){
		case 0 :
			break;
		case 1 :
			addProduto();
			break;
		case 2 :
			rmvProduto();
			break;
		case 3 :
			edtProduto();
			break;
		case 4 :
			realizarManutencao();
			break;
		case 5 :
			verProdutos();
			break;
		}
		
	}
	
	public static void addProduto(){
		
		int opcao = 0;
		System.out.println("O que deseja adicionar?"
				+"\n 1 - Motor Eletrico"
				+"\n 2 - Inversor de Frequência"
				+"\n 3 - Gerador"
				+"\n 0 - Voltar");
		
		opcao = sc.nextInt();
		
		String codigo = "";
		String tipo = "";
		float potencia = 0;
		float tensao = 0;
		String capacidade = "";
		float preco = 0;
		
		switch(opcao) {
		case 0 :
			comeco();
			break;
		
		case 1 :
			System.out.println("Digite o código do motor eletrico: ");
			codigo = sc.next();
			System.out.println("Digite o tipo / nome do motor eletrico: ");
			tipo = sc.next();
			System.out.println("Digite a potência do motor eletrico: ");
			potencia = sc.nextFloat();
			System.out.println("Digite a tensão do motor eletrico: ");
			tensao = sc.nextFloat();
			System.out.println("Digite a capacidade do motor eletrico: ");
			capacidade = sc.next();
			System.out.println("Digite o preço do motor eletrico: ");
			preco = sc.nextFloat();
			System.out.println("Digite o tipo de enrolamento do motor eletrico: ");
			String enrolamento = sc.next();
			System.out.println("Digite a eficiencia do motor eletrico: ");
			String eficiencia = sc.next();
			
			MotorEletrico ME = new MotorEletrico(codigo, tipo, potencia, tensao, capacidade, preco, null, enrolamento, eficiencia);
			
			weg.addProdutoDisponivel(ME);
			System.out.println("\n!!! Produto Adicionar com sucesso !!!\n");
			comeco();
			break;
			
		case 2 :
			System.out.println("Digite o código do inversor de frequência: ");
			codigo = sc.next();
			System.out.println("Digite o tipo / nome do inversor de frequência: ");
			tipo = sc.next();
			System.out.println("Digite a potência do inversor de frequência: ");
			potencia = sc.nextFloat();
			System.out.println("Digite a tensão do inversor de frequência: ");
			tensao = sc.nextFloat();
			System.out.println("Digite a capacidade do inversor de frequência: ");
			capacidade = sc.next();
			System.out.println("Digite o preço do inversor de frequência: ");
			preco = sc.nextFloat();
			System.out.println("Digite a capacidade de frequência do inversor de frequência: ");
			String capacidadeFrequencia = sc.next();
			System.out.println("Digite o número de fases do inversor de frequência: ");
			float numFases = sc.nextFloat();
			
			InversorFrequencia FE = new InversorFrequencia(codigo, tipo, potencia, tensao, capacidade, preco, null, capacidadeFrequencia, numFases);
			
			weg.addProdutoDisponivel(FE);
			System.out.println("\n!!! Produto Adicionar com sucesso !!!\n");
			comeco();
			break;
			
		case 3 : 
			System.out.println("Digite o código do gerador: ");
			codigo = sc.next();
			System.out.println("Digite o tipo / nome do gerador: ");
			tipo = sc.next();
			System.out.println("Digite a potência do gerador: ");
			potencia = sc.nextFloat();
			System.out.println("Digite a tensão do gerador: ");
			tensao = sc.nextFloat();
			System.out.println("Digite a capacidade do gerador: ");
			capacidade = sc.next();
			System.out.println("Digite o preço do gerador: ");
			preco = sc.nextFloat();
			System.out.println("Digite o tipo de combustível do gerador: ");
			String tipoDeCombustivel = sc.next();
			System.out.println("Digite a autonomia do gerador: ");
			String autonomia = sc.next();
			
			Gerador GE = new Gerador(codigo, tipo, potencia, tensao, capacidade, preco, null, tipoDeCombustivel, autonomia);
			
			weg.addProdutoDisponivel(GE);
			
			System.out.println("\n!!! Produto Adicionar com sucesso !!!\n");
			comeco();
			break;
		}
		
		
		
		
		
	}
	public static void rmvProduto() {
		System.out.println("Qual produto deseja remover: ");
		System.out.println(weg.listarProdutosDisponiveis());
		System.out.println("0 - Voltar");
		
		int opcao = 0;
		
		opcao = sc.nextInt();
		
		if(opcao == 0) {
			comeco();
		}else if (opcao > 0 && opcao <= weg.ArrListaProdutosDisponiveis().size()){
			
			System.out.println("Você tem certeza?");
			System.out.println("1 - Sim / 2 - Não");
			
			int certeza = sc.nextInt();
			
			if(certeza == 1) {
				weg.rmvProduto(opcao);
				System.out.println("\n!!! Produto Removido com Sucesso!!!\n");
			}else {
				rmvProduto();
			}
			
		}
		
	}
	public static void edtProduto() {
		
	}
	public static void realizarManutencao() {
		
	}
	public static void verProdutos() {
		System.out.println("Aqui estão os produtos: ");
		System.out.println(weg.listarProdutosDisponiveis()+"\n");
		comeco();
	}

}
