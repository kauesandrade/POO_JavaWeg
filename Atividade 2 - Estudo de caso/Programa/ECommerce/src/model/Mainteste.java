package model;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mainteste {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Cliente> clientes = new ArrayList();
	private static  Cliente cliente = new Cliente();
	private static int logado;
	
	public static void main(String[] args) {
	
	 
	 //--------------Tela Inicio-----------
		
		cliente.setLogin("kaue");
		cliente.setSenha("123123");
		clientes.add(cliente);
		
		telaInicial();
		
		
	}
		


	public static void telaPrincipal() {
		JButton btComprar = new JButton("Comprar");
		JButton btCarrinho = new JButton("Carrinho");
		JButton btProduto = new JButton("Produto");
		Object[] LayoutTelaPrincipal = {btComprar, btCarrinho, btProduto};
		
	
	btComprar.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			comprar();
		}
	});
	
	btCarrinho.addActionListener((ActionListener) new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	
	btProduto.addActionListener((ActionListener) new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	
	
	int opcao = JOptionPane.showInternalConfirmDialog(null, LayoutTelaPrincipal, "Tela Principal", JOptionPane.DEFAULT_OPTION);
	
	if(opcao == -1){
		
	}else {
		
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

		JTextField nome = new JTextField();
		JTextField login = new JTextField();
		JPasswordField senha = new JPasswordField();
		JTextField email = new JTextField();
		JTextField cpf = new JTextField();
		JTextField dataNas = new JTextField();
		Object[]layoutCadastro = {lbNome, nome, lbLogin, login, lbSenha, senha, lbEmail, email, lbCpf, cpf, lbDataNas, dataNas};
		 
		String logar;
		 
		int opcao = JOptionPane.showInternalConfirmDialog(null, layoutCadastro, "Cadastro", JOptionPane.OK_CANCEL_OPTION);

		String nome1 = nome.getText();
		String login1 = login.getText();
		String senha1 = String.valueOf(senha.getPassword());
		String email1 = email.getText();
		String cpf1 = cpf.getText();
		String dataNas1 = dataNas.getText();
			
			 
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse(dataNas1);
			
		logar = cliente.cadastrar(nome1, login1, senha1, cpf1, data, email1);
		
		if(opcao == -1) {
			
		}
		else {
			if(logar != "A") {
				JOptionPane.showMessageDialog(null, logar, "Erro", JOptionPane.DEFAULT_OPTION);
			}
			else if(logar.equals("A")){
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Confirmado", JOptionPane.DEFAULT_OPTION);
				clientes.add(cliente);
					
			}
		}
		
			
	}
	
	public static Boolean login(){
		
	 JLabel lblogin = new JLabel("Login");
	 JLabel lbsenha = new JLabel("Senha");
	 JTextField login = new JTextField();
	 JPasswordField senha = new JPasswordField();
	 
	 
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
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Esportes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		
		
		Object[] componentes = {lbCategoria, cbCategoria};
		int opcao = JOptionPane.showInternalConfirmDialog(null, componentes, "Categoria", JOptionPane.DEFAULT_OPTION);
		
		
		String categoria = cbCategoria.getSelectedItem().toString();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		JComboBox<String> comboBox1 = new JComboBox<String>();
		
		for(int i = 0; i < produtos.size(); i++) {
			if(Produto.getCategoria().equals(categoria)) {
				comboBox1.addItem(produtos.get(i).getNome());
			}
		}
		
//		System.out.println(opcao);
		
		if( produtos.size() > 0) {
			JOptionPane.showMessageDialog(null, comboBox1, ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
			}
		else if(opcao == 0) {
			JOptionPane.showMessageDialog(null, "Não há Produtos nessa categoria", ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
			comprar();
		}
		else if(opcao == -1)   {
			
			}
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
