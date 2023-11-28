import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Produto> produtosPedido;
	private static ArrayList<Integer> quantidades;

	public static void main(String[] args) {
		telaPrincipal();

	}

	public static void telaPrincipal() {

		System.out.println("==========Bem vindo, O que deseja fazer ?==========" + "\n[1] Produtos" + "\n[2] Clientes");

		int opcoes = sc.nextInt();

		switch (opcoes) {
		case 1:
			telaProdutos();
			break;
		case 2:
			telaClientes();
			break;
		}
	}

	private static void telaProdutos() {

		System.out.println("==========Produtos==========" + "\n[1] Ver Produtos" + "\n[2] Add Produto"
				+ "\n[3] Editar Produto" + "\n[0] Voltar");

		int opcoes = sc.nextInt();

		switch (opcoes) {
		case 1:
			for (Produto p : produtos) {
				System.out.println(
						"Nome: " + p.getNome() + " | Preco: " + p.getPreco() + " | Estoque: " + p.getEstoque());
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

			System.out.println("Seu produto foi adicionado!!!");

			telaProdutos();
			break;

		case 3:
			for (int i = 0; i < produtos.size(); i++) {

				System.out.println(i + 1 + "- " + "Nome: " + produtos.get(i).getNome() + " | Preco: "
						+ produtos.get(i).getPreco() + " | Estoque: " + produtos.get(i).getEstoque());
			}
			if (produtos.size() > 0) {

				System.out.println("Digite o número do item que deseja editar ou 0 para voltar: ");

				int item = sc.nextInt() - 1;

				if (item == -1) {
					telaProdutos();
				} else {
					System.out.println("Digite o nome do produto: " + produtos.get(item).getNome());
					String nome1 = sc.next();

					System.out.println("Digite o preço do produto: " + produtos.get(item).getPreco());
					Double preco1 = sc.nextDouble();

					System.out.println("Digite a quantidade em estoque do produto: " + produtos.get(item).getEstoque());
					int quantidade1 = sc.nextInt();

					produtos.get(item).setNome(nome1);
					produtos.get(item).setEstoque(quantidade1);
					produtos.get(item).setPreco(preco1);

					System.out.println("Seu produto foi editado!!!");
				}

			} else {
				System.out.println("Você não tem produtos adicionados");
			}

			telaProdutos();

			break;

		case 0:
			telaPrincipal();
		}
	}

	private static void telaClientes() {

		System.out.println(
				"==========Clientes==========" + "\n[1] Ver Clientes" + "\n[2] Add Clientes" + "\n[3] Editar Clientes"
						+ "\n[4] Add Pedido no Cliente" + "\n[5] Remover Pedido do Cliente" + "\n[0] Voltar");

		int opcoes = sc.nextInt();

		switch (opcoes) {
		case 1:
			for (Cliente c : clientes) {
				System.out.println("Nome: " + c.getNome() + " | CPF: " + c.getCpf() + " | Email: " + c.getEmail());
			}
			telaClientes();
			break;

		case 2:
			System.out.println("Digite o nome do cliente: ");
			String nome = sc.next();

			System.out.println("Digite o cpf do cliente: ");
			String cpf = sc.next();

			System.out.println("Digite o email do cliente: ");
			String email = sc.next();

			clientes.add(new Cliente(nome, cpf, email));

			System.out.println("Seu cliente foi adicionado!!!");

			telaClientes();
			break;

		case 3:
			for (int i = 0; i < clientes.size(); i++) {

				System.out.println(i + 1 + "- " + "Nome: " + clientes.get(i).getNome() + " | CPF: "
						+ clientes.get(i).getCpf() + " | Email: " + clientes.get(i).getEmail());
			}
			if (produtos.size() > 0) {

				System.out.println("Digite o número do cliente que deseja editar ou 0 para voltar: ");

				int item = sc.nextInt() - 1;

				if (item == -1) {
					telaClientes();
				} else {
					System.out.println("Digite o nome do cliente: " + clientes.get(item).getNome());
					String nome1 = sc.next();

					System.out.println("Digite o cpf do cliente: " + clientes.get(item).getCpf());
					String cpf1 = sc.next();

					System.out.println("Digite o email do cliente: " + clientes.get(item).getEmail());
					String email1 = sc.next();

					clientes.get(item).setNome(nome1);
					clientes.get(item).setCpf(cpf1);
					;
					clientes.get(item).setEmail(email1);

					System.out.println("Seu clientes foi editado!!!");
				}

			} else {
				System.out.println("Você não tem clientes adicionados");
			}

			telaClientes();

			break;

		case 4:

			for (int i = 0; i < clientes.size(); i++) {

				System.out.println(i + 1 + "- " + "Nome: " + clientes.get(i).getNome() + " | CPF: "
						+ clientes.get(i).getCpf() + " | Email: " + clientes.get(i).getEmail());
			}

			if (produtos.size() > 0) {

				System.out.println("Digite o número do cliente que deseja add o pedido ou 0 para voltar: ");

				int cliente = sc.nextInt() - 1;

				if (cliente == -1) {
					telaClientes();
				} else {

					System.out.println("Digite o numero do pedido: ");
					int pedidoNum = sc.nextInt();

					System.out.println("Digite o cep do envio: ");
					String cep = sc.next();
					System.out.println("Digite o enderço do envio: ");
					String endereco = sc.next();
					System.out.println("Digite o transportadora do envio: ");
					String transportadora = sc.next();

					System.out.println("Digite o valor do pagamento: ");
					Double valor = sc.nextDouble();
					System.out.println("Digite o metodo de pagamento: ");
					String metodoPagamento = sc.next();
					System.out.println("Digite quantas parcelas foi o pagamento: ");
					int parcelas = sc.nextInt();

					produtosPedido = new ArrayList<Produto>();
					quantidades = new ArrayList<Integer>();

					addItensPedido();

					clientes.get(cliente).addCompra(new Pedido(pedidoNum, new Envio(cep, endereco, transportadora),
									new Pagamento(valor, metodoPagamento, parcelas), clientes.get(cliente),
									produtosPedido, quantidades));

					System.out.println("O pedido foi add no cliente!!");
				}

			} else {
				System.out.println("Você não tem clientes adicionados");
			}

			telaClientes();
			break;

		case 5:
			
			for (int i = 0; i < clientes.size(); i++) {

				System.out.println(i + 1 + "- " + "Nome: " + clientes.get(i).getNome() + " | CPF: "
						+ clientes.get(i).getCpf() + " | Email: " + clientes.get(i).getEmail());
			}

			if (produtos.size() > 0) {

				System.out.println("Digite o número do cliente que deseja remover o pedido ou 0 para voltar: ");

				int cliente = sc.nextInt() - 1;

				if (cliente == -1) {
					telaClientes();
				} else {
					
					for (int i = 0; i < clientes.get(i).getHistoricoPedido().size(); i++) {

						System.out.println(i + 1 + "- " + "Número do pedido: " + clientes.get(i).getHistoricoPedido().get(i).getNumeroPedido());
					}
					
					System.out.println("Digite o pedido que deseja remover do cliente: ");
					int pedido = sc.nextInt();

					clientes.get(cliente).rmvCompra(pedido);

					System.out.println("O pedido foi removido no cliente!!");
				}

			} else {
				System.out.println("Você não tem pedidos adicionados nessse cliente");
			}

			telaClientes();
			break;

		case 0:
			telaPrincipal();
		}

	}

	private static void addItensPedido() {

		for (int i = 0; i < produtos.size(); i++) {

			System.out.println(i + 1 + "- " + "Nome: " + produtos.get(i).getNome() + " | Preco: "
					+ produtos.get(i).getPreco() + " | Estoque: " + produtos.get(i).getEstoque());
		}

		System.out.println("Digite o número do item que deseja add no pedido ou 0 para continuar: ");

		int item = sc.nextInt() - 1;

		if (item > -1) {

			System.out.println("Digite a quantidade que deseja adicionar: " + produtos.get(item).getEstoque());
			int quantidadeP = sc.nextInt();

			if (quantidadeP > produtos.get(item).getEstoque()) {
				System.out.println("Quantidade acima do estoque!");
				addItensPedido();
			} else {
				produtos.get(item).setEstoque(produtos.get(item).getEstoque() - quantidadeP);
				produtosPedido.add(produtos.get(item));
				quantidades.add(quantidadeP);

				addItensPedido();
			}

		}
	}
}
