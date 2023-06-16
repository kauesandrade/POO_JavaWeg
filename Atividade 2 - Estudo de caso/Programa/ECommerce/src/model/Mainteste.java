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
	private static int clientela;
	
	public static void main(String[] args) {
	
	 
	 //--------------Tela Inicio-----------
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		comprar();
		
//		telaInicial();
	
	}
	
	public static void telaInicial() {
		JButton btCadastro = new JButton("Cadastrar");
		JButton btLogin = new JButton("Login");
		JButton btSair = new JButton("Sair");
		
		btCadastro.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					cadastro();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btLogin.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				boolean loginConfirmado = login();
				if(loginConfirmado == true) {
					//fazer um break para a tela inicial
				}else {
					
				}
			}
		});
		
		btSair.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		Object[] layoutTelaP = { btCadastro, btLogin, btSair};
		
		JOptionPane.showMessageDialog(null, layoutTelaP, "LOJA IRADA", JOptionPane.CLOSED_OPTION);
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
		
		String logar;
	
//		do {
			 
			 Object[]layoutCadastro = {lbNome, nome, lbLogin, login, lbSenha, senha, lbEmail, email, lbCpf, cpf, lbDataNas, dataNas};
			 JOptionPane.showMessageDialog(null, layoutCadastro, "Cadastro", JOptionPane.OK_CANCEL_OPTION);

			String nome1 = nome.getText();
			String login1 = login.getText();
			String senha1 = String.valueOf(senha.getPassword());
			String email1 = email.getText();
			String cpf1 = cpf.getText();
			String dataNas1 = dataNas.getText();
			
			 
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date data = formato.parse(dataNas1);
			
			logar = cliente.cadastrar(nome1, login1, senha1, cpf1, data, email1);
			
			if(logar.equals("N")) {
				System. exit(0);
			}
			else if(logar.equals("A")){
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Confirmado", JOptionPane.DEFAULT_OPTION);
				clientes.add(cliente);
				
			}
			
//		}while(logar == "N");
	}
	
	public static boolean login(){
		
	 JLabel lblogin = new JLabel("Login");
	 JLabel lbsenha = new JLabel("Senha");
	 JTextField login = new JTextField();
	 JPasswordField senha = new JPasswordField();
	 
	 
	 Object[] layoutLogin = {lblogin, login, lbsenha, senha};
		
	 String logar = "";
		
	 do {
			
			 JOptionPane.showMessageDialog(null, layoutLogin, "Login", JOptionPane.OK_CANCEL_OPTION);
			 
			 String login1 = login.getText();
			 String senha1 = String.valueOf(senha.getPassword());
			
			logar = "";
			
			for(int i=0; i < clientes.size(); i++) {
				logar = clientes.get(i).logar(login1, senha1);
				if(logar.equals("A")){
					JOptionPane.showMessageDialog(null, "Seja Bem-Vindo "+clientes.get(i).getNome(), "Login Efetuado", JOptionPane.DEFAULT_OPTION);
					clientela = i;
					break;
				}
			}
			
			if(logar.equals("N")) {
				JOptionPane.showMessageDialog(null, "Coloque um login valido!!", "Erro!!", JOptionPane.ERROR_MESSAGE);
				login();
				return false;
			}
			return true;
			
	}while(logar != "A");
	}
	
	public static void comprar() {
		
		JLabel lbCategoria = new JLabel("Categoria: ");
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Esportes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		
//		
//		Object[] componentes = {lbCategoria, cbCategoria};
//		String resultado = JOptionPane.showInputDialog(null, componentes, "Categoria", JOptionPane.DEFAULT_OPTION);
//		
//		if(resultado == JOptionPane.CLOSED_OPTION) {
//			
//		}
//		
		
//		Fazer como fechar |||S
		
		String categoria = cbCategoria.getSelectedItem().toString();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		JComboBox<String> comboBox1 = new JComboBox<String>();
		
		for(int i = 0; i < produtos.size(); i++) {
			if(Produto.getCategoria().equals(categoria)) {
				comboBox1.addItem(produtos.get(i).getNome());
			}
		}
		
		if(produtos.size() > 0) {
			JOptionPane.showMessageDialog(null, comboBox1, ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
			}
		else {
			JOptionPane.showMessageDialog(null, "Não há Produtos nessa categoria", ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
			comprar();
			}
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
