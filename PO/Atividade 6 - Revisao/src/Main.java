import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		telaPrincipal();
		

	}
	
	public static void telaPrincipal() {
		int opcoes = 0;
		
		System.out.println("==========Bem vindo, O que deseja fazer ?=========="
				+ "\n[1] Produtos"
				+ "\n[2] Clientes"
				+ "\n[3] Pedidos");
		
		switch (opcoes) {
		case 1: telaProdutos();
		break;
		case 2: telaClientes();
		break;
		case 3: telaPedidos();
		}
	}

	private static void telaProdutos() {
		
		int opcao = -1;
		System.out.println("==========Produtos=========="
				+ "\n[1] Ver Produtos"
				+ "\n[2] Add Produto"
				+ "\n[3] Editra Produto"
				+ "\n[0] Voltar");
		
		switch(opcao) {
		case 1: 
			for(Produto p : produtos) {
				System.out.println("Nome: " + p.getNome() + " | Preco: " + p.getPreco() + " | Estoque: " + p.getEstoque());
			}
			telaProdutos();
			break;
			
		case 2: 
			System.out.println("Digite o nome do produto: ");
			String nome = sc.next();
			
			System.out.println("Digite o preço do produto: ");
			Double preco = sc.nextDouble();
			
			System.out.println("Digite a quantidade em estoque do produto: ");
			int quantidade = sc.nextInt();
			
			produtos.add(new Produto(nome, quantidade, preco));
		}
	}
	

	private static void telaClientes() {
		// TODO Auto-generated method stub
		
	}
	
	private static void telaPedidos() {
		// TODO Auto-generated method stub
		
	}


}
