package model;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mainteste {
	
	private static ArrayList<Cliente> clientes = new ArrayList();
	private static JComboBox<String> cbProdutos = new JComboBox<String>();
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static JComboBox<String> cbCategorias = new JComboBox<String>();
	private static Cliente cliente = new Cliente();
	private static ArrayList<Produto> carrinhoProdutos = new ArrayList<Produto>();
	private static int logado;
	private static int selecProduto = 0;
	
	public static void main(String[] args) {
	
	// !!!________PARA FAZER_______!!!
	 // !!!!!!!!!!!!!!!!!!! SE O CLIENTE CLICAR NA OPCCAO DE ESCREVER, REMOVER PARA ELE ESCREVER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//------------------!!!!!!!!!!Mudar para que n selecione uma opcao que n tenha nd_______ metodo comprar!!!!!!!!!!!!!!
		
	 //--------------Tela Inicio-----------
		
		cliente.setLogin("kaue");
		cliente.setSenha("123123");
		clientes.add(cliente);
		
		cbCategorias.addItem("Esportes");
		cbCategorias.addItem("Infantil");
		cbCategorias.addItem("Tecnologia");
		cbCategorias.addItem("Lazer");
		cbCategorias.addItem("Cozinha");
		
		telaInicial();
		
		
	}
		


	public static void telaPrincipal() {
		JButton btComprar = new JButton("Comprar");
		JButton btCarrinho = new JButton("Carrinho");
		JButton btProduto = new JButton("Produto");
		Object[] layoutTelaPrincipal = {btComprar, btCarrinho, btProduto};
		
	
	btComprar.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			comprar();
		}
	});
	
	btCarrinho.addActionListener((ActionListener) new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			carrinho();
		}
	});
	
	btProduto.addActionListener((ActionListener) new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			produto();
		}
	});
	
	
	int opcao = JOptionPane.showInternalConfirmDialog(null, layoutTelaPrincipal, "Tela Principal", JOptionPane.CLOSED_OPTION);
	
	if(opcao == -1){
		
	}
	
	}
	
	public static void telaInicial() {
		JButton btCadastro = new JButton("Cadastrar");
		JButton btLogin = new JButton("Login");
		JButton btSair = new JButton("Sair");
		Object[] layoutTelaP = { btCadastro, btLogin, btSair};
		
		
		btCadastro.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					cadastro();
				} catch (ParseException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		btLogin.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Boolean retorno = login();
				
				if (retorno == true) {
					telaPrincipal();
				}
			
			}
		});
		
		btSair.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JOptionPane.showMessageDialog(null, layoutTelaP, "Schaefer's SHOP", JOptionPane.CLOSED_OPTION);
	}
	
	public static void cadastro() throws ParseException {
		
		JLabel lbNome = new JLabel("Nome:");
		JLabel lbLogin = new JLabel("Login:");
		JLabel lbSenha = new JLabel("Senha:");
		JLabel lbEmail = new JLabel("Email:");
		JLabel lbCpf = new JLabel("CPF:");
		JLabel lbDataNas = new JLabel("Data de Nascimento:");

		JTextField txNome = new JTextField();
		JTextField txLogin = new JTextField();
		JPasswordField txSenha = new JPasswordField();
		JTextField txEmail = new JTextField();
		JTextField txCpf = new JTextField();
		JTextField txDataNas = new JTextField();
		Object[]layoutCadastro = {lbNome, txNome, lbLogin, txLogin, lbSenha, txSenha, lbEmail, txEmail, lbCpf, txCpf, lbDataNas, txDataNas};
		 
		int opcao = JOptionPane.showInternalConfirmDialog(null, layoutCadastro, "Cadastro", JOptionPane.OK_CANCEL_OPTION);

		String nome = txNome.getText();
		String login = txLogin.getText();
		String senha = String.valueOf(txSenha.getPassword());
		String email = txEmail.getText();
		String cpf = txCpf.getText();
		String dataNas = txDataNas.getText();
			
			 
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse(dataNas);
			
		String cadastrar = cliente.cadastrar(nome, login, senha, cpf, data, email);
		
		if(opcao == -1) {
			
		}
		else {
			if(cadastrar != "A") {
				JOptionPane.showMessageDialog(null, cadastrar, "Erro", JOptionPane.DEFAULT_OPTION);
				cadastro();
			}
			else if(cadastrar.equals("A")){
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Confirmado", JOptionPane.DEFAULT_OPTION);
				clientes.add(cliente);
					
			}
		}
		
			
	}
	
	public static Boolean login(){
		
	 JLabel lblogin = new JLabel("Login");
	 JLabel lbsenha = new JLabel("Senha");
	 JTextField login = new JTextField("kaue");
	 JPasswordField senha = new JPasswordField("123123");
	 
	 
	 Object[] layoutLogin = {lblogin, login, lbsenha, senha};
		
	 String logar = "";
		
			
			 int opcao = JOptionPane.showInternalConfirmDialog(null, layoutLogin, "Login", JOptionPane.OK_CANCEL_OPTION);
			 
			 String login1 = login.getText();
			 String senha1 = String.valueOf(senha.getPassword());
			
			logar = "";
			
			if(opcao == -1) {
				
			}else {
				for(int i=0; i < clientes.size(); i++) {
					logar = clientes.get(i).logar(login1, senha1);
					if(logar.equals("A")){
						JOptionPane.showMessageDialog(null, "Seja Bem-Vindo "+clientes.get(i).getNome(), "Login Efetuado", JOptionPane.DEFAULT_OPTION);
						telaPrincipal();
						logado = i;
						return true;
						
					}
				}
				
				if(logar.equals("N")) {
					JOptionPane.showMessageDialog(null, "Coloque um login valido!!", "Erro!!", JOptionPane.ERROR_MESSAGE);
					login();
				}
			}
			return false;
			
	}
	
	public static void comprar() {
		
		JLabel lbCategoria = new JLabel("Categoria: ");
		
		
		Object[] layoutComprar = {lbCategoria, cbCategorias};
		int opcao = JOptionPane.showInternalConfirmDialog(null, layoutComprar, "Categoria", JOptionPane.DEFAULT_OPTION);
		
		
		String categoria = cbCategorias.getSelectedItem().toString();
		JComboBox<String> cbArr = new JComboBox<String>();
		
		for(int i = 0; i < produtos.size(); i++) {
			
			if(produtos.get(i).getCategoria().equals(categoria)) {
				cbArr.addItem(produtos.get(i).getNome());
			}
		}
		
		String selecNomeProduto = "N";

		if( produtos.size() > 0) {
			JOptionPane.showMessageDialog(null, cbArr, ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
			selecNomeProduto = cbArr.getSelectedItem().toString();
			}
		else if(opcao == 0) {
			JOptionPane.showMessageDialog(null, "Não há Produtos nessa categoria", ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
			comprar();
		}
		else if(opcao == -1)   {
			
			}

		if(selecNomeProduto != "N") {
			for(int i = 0; i < produtos.size(); i++) {
				if(produtos.get(i).getNome().equals(selecNomeProduto)) {
					selecProduto = i;
				}
			}
			mostrarProduto();
			
		}
			
		}
		
	public static void carrinho() {
		
		String produtosCarrinhoInfo = "";
		
		for(int i = 0; i < carrinhoProdutos.size(); i++) {
			
			produtosCarrinhoInfo += "\nNome: "+ carrinhoProdutos.get(i).getNome() +
					"\nPreço: "+ carrinhoProdutos.get(i).getPreco() +
					"\nQuantidade: 1\n";
		}
		
		JButton btFinalizarCompra = new JButton("Finalizar compra");
		JButton btRemover = new JButton("Remover itens");
		JButton btVoltar = new JButton("Voltar");
		
		Object[] layoutCarrinho = {produtosCarrinhoInfo.toString(), btFinalizarCompra, btRemover, btVoltar};
		
		btFinalizarCompra.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btRemover.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				removerDoCarrinho();
			}
		});
		btVoltar.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				telaPrincipal();
			}
		});
		
		JOptionPane.showInternalConfirmDialog(null, layoutCarrinho, "Carrinho", JOptionPane.DEFAULT_OPTION);
		
		
	}
		
	public static void produto() {
		
		JButton btEditProduto = new JButton("Editar Produto");
		JButton btCadastrarProduto = new JButton("Cadastrar Produto");
		
		Object[] layoutPoduto = {btCadastrarProduto, btEditProduto}; 
		
		btEditProduto.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			editProduto();
		}
	});
	
		btCadastrarProduto.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				cadastrarProduto();
		}
	});
		
	JOptionPane.showInternalConfirmDialog(null, layoutPoduto, "Produto", JOptionPane.DEFAULT_OPTION);
		
	}
		
	
	public static void editProduto() {
		
		JComboBox<String> cbArr = new JComboBox<String>();
		
		for(int i = 0; i < carrinhoProdutos.size(); i++) {
			cbArr.addItem(carrinhoProdutos.get(i).getNome());
		}
		
		JOptionPane.showInternalConfirmDialog(null, cbArr, "Produto", JOptionPane.DEFAULT_OPTION);
		String produtoSelecionado = cbArr.getSelectedItem().toString();
		
		
		
		
		
	}
	
	public static void cadastrarProduto() {
		
		JLabel lbNome = new JLabel("Nome do produto");
		JLabel lbPreco = new JLabel("Preço");
		JLabel lbCategoria = new JLabel("Categoria");
		JLabel lbModelo = new JLabel("Modelo");
		JLabel lbMarca = new JLabel("Marca");
		JLabel lbCor = new JLabel("Cor");
		JLabel lbDescricao = new JLabel("Descrição");
		JLabel lbLimite = new JLabel("Limite de comprar por pessoa");
		JLabel lbQuantidade = new JLabel("Quantidade no estoque");
		
		JTextField txNome = new JTextField("Camisa");
		JTextField txPreco = new JTextField("10");
		JTextField txModelo = new JTextField("1");
		JTextField txMarca = new JTextField("1");
		JTextField txCor = new JTextField("1");
		JTextField txDescricao = new JTextField("1");
		JTextField txLimite = new JTextField("1");
		JTextField txQuantidade = new JTextField("1");
		Object[] layoutCadastrarProduto = {lbNome, txNome, lbPreco, txPreco, lbCategoria, cbCategorias,lbModelo,
				txModelo,lbMarca, txMarca, lbCor, txCor, lbDescricao, txDescricao, lbLimite, txLimite, lbQuantidade, txQuantidade};
		
		int opcao = JOptionPane.showConfirmDialog(null, layoutCadastrarProduto, "Cadastro de Produto", JOptionPane.CANCEL_OPTION);
		
		Produto produto = new Produto();
		
		String nome = txNome.getText();
		Double preco = Double.parseDouble(txPreco.getText());
		String categoria = cbCategorias.getSelectedItem().toString();
		String modelo = txModelo.getText();
		String marca = txMarca.getText();
		String cor = txCor.getText();
		String descricao = txDescricao.getText();
		int limite = Integer.parseInt(txLimite.getText());
		int quantidade = Integer.parseInt(txQuantidade.getText());
		
		String cadasProduto = produto.CadastrarProduto( nome, preco, categoria, modelo,
				marca, cor, descricao, limite, quantidade);
		
		if(opcao == -1){
			
		}else {
			if(cadasProduto.equals("A")) {
				produtos.add(produto);
				JOptionPane.showConfirmDialog(null, "Produto Cadastrado!!!", "Confirmado", JOptionPane.CANCEL_OPTION);
			}
			else if(cadasProduto != "A") {
				JOptionPane.showConfirmDialog(null, cadasProduto, "Erro", JOptionPane.CANCEL_OPTION);
				cadastrarProduto();
			}
		}
		
	}
	
	public static void mostrarProduto() {
		
		JLabel lbNome = new JLabel("Nome: "+produtos.get(selecProduto).getNome());
		JLabel lbPreco = new JLabel("Preço: "+produtos.get(selecProduto).getPreco());
		JLabel lbModelo = new JLabel("Modelo: "+produtos.get(selecProduto).getModelo());
		JLabel lbMarca = new JLabel("Marca: "+produtos.get(selecProduto).getMarca());
		JLabel lbCor = new JLabel("Cor: "+produtos.get(selecProduto).getCor());
		JLabel lbDescricao = new JLabel("Descrição: "+produtos.get(selecProduto).getDescricao());
		JButton btComprar = new JButton("Comprar");
		
		Object[] layoutInfoProduto = {lbNome, lbPreco, lbModelo, lbMarca, lbCor, lbDescricao, btComprar};
		
		btComprar.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarQuantidade();
			}
		});
		
		JOptionPane.showMessageDialog(null, layoutInfoProduto, "Produto", JOptionPane.DEFAULT_OPTION);
		
		

	}
	
	public static void mostrarQuantidade() {
		JLabel lbQuantideLimite = new JLabel("Quantidade limite: "+produtos.get(selecProduto).getLimiteDeCompras());
		JLabel lbQuantidadeEstoque = new JLabel("Quantiade no estoque: "+produtos.get(selecProduto).getQuantidadeEstoque());
		JLabel lbQuantidade = new JLabel("Digite a quantidade que deseja");
		JTextField txQuantidade = new JTextField("1");
		Object[] layoutQuantidadeCompra = {lbQuantideLimite, lbQuantidadeEstoque, lbQuantidade, txQuantidade};
		
		int opcao = JOptionPane.showInternalConfirmDialog(null, layoutQuantidadeCompra, "Quantidade", JOptionPane.CLOSED_OPTION);
		
		int quantidade = Integer.parseInt(txQuantidade.getText()); 
		
		if(opcao == -1) {
			
		}else {
				if(quantidade <= produtos.get(selecProduto).getQuantidadeEstoque()&& quantidade <= produtos.get(selecProduto).getLimiteDeCompras()) {
					produtos.get(selecProduto).setQuantidadeEstoque(produtos.get(selecProduto).getQuantidadeEstoque() - quantidade);
					JOptionPane.showMessageDialog(null, "Produto adicionado no seu carrinho!!!", "Confirmado", JOptionPane.DEFAULT_OPTION);
					carrinhoProdutos.add(produtos.get(selecProduto));
				}else {
					if(quantidade > produtos.get(selecProduto).getQuantidadeEstoque()){
						JOptionPane.showMessageDialog(null, "Não temos essa quantidade no estoque!!!", "Erro", JOptionPane.ERROR_MESSAGE);
						mostrarQuantidade();
					}else if(quantidade > produtos.get(selecProduto).getLimiteDeCompras()) {
						JOptionPane.showMessageDialog(null, "Digite uma quantidade menor ou igual ao limite de compra!!!", "Erro", JOptionPane.ERROR_MESSAGE);
						mostrarQuantidade();
					}
				}
			
		}
	}
	
	private static void removerDoCarrinho() {
		JComboBox<String> cbArr = new JComboBox<String>();
		
		for(int i = 0; i < carrinhoProdutos.size(); i++) {
			cbArr.addItem(carrinhoProdutos.get(i).getNome());
		}
		JLabel titulo = new JLabel("Escolha um para remover");
		
		Object[] layoutRemoverDoCarrinho = {cbArr, titulo};
		
		JOptionPane.showConfirmDialog(null, layoutRemoverDoCarrinho, "Remover", JOptionPane.DEFAULT_OPTION );
		
		String nomeProduto = cbArr.getSelectedItem().toString();
		
		for(int i = 0; i < carrinhoProdutos.size(); i++) {
			
			if(carrinhoProdutos.get(i).getNome().equals(nomeProduto)){
				carrinhoProdutos.remove(i);
			}
		}
	}

	
	}

	
	
	
	
	
	

	
