package model;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JButton;
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
		
		JButton btCadastro = new JButton("Cadastrar");
		JButton btLogin = new JButton("Login");
		JButton btSair = new JButton("Sair");
		
		btCadastro.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				cadastro();
			}
		});
		
		btLogin.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		
		btSair.addActionListener( (ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		cadastro();
		login();
		System.out.println(clientes.get(0));
	
	
	}
	
	public static void cadastro() {
		
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
		
		do {
			 
			 Object[] co = {lbNome, nome, lbLogin, login, lbSenha, senha, lbEmail, email, lbCpf, cpf, lbDataNas, dataNas};
			 JOptionPane.showMessageDialog(null, co, "Login", JOptionPane.OK_CANCEL_OPTION);

			String nome1 = nome.getText();
			String login1 = login.getText();
			String senha1 = String.valueOf(senha.getPassword());
			String email1 = email.getText();
			String cpf1 = cpf.getText();
			String dataNas1 = dataNas.getText();
			
			 
//			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//			Date data = formato.parse(dataNas1);
			
			logar = cliente.cadastrar(nome1, login1, senha1, cpf1, dataNas1, email1);
			
			if(logar.equals("N")) {
				System.out.println("Digite uma parametro melhor");
			}else {
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Confirmado", JOptionPane.DEFAULT_OPTION);
				clientes.add(cliente);
			}
			
		}while(logar == "N");
	}
	
	
	
	
	
	
	
	
	
	
	public static void login(){
		
	 JLabel lblogin = new JLabel("Login");
	 JLabel lbsenha = new JLabel("Senha");
	 JTextField login = new JTextField();
	 JPasswordField senha = new JPasswordField();
	 
	 Object[] co = {lblogin, login, lbsenha, senha};
		
	 String logar = "";
		
		do {
			
			 JOptionPane.showMessageDialog(null, co, "Login", JOptionPane.OK_CANCEL_OPTION);
			 
			 String login1 = login.getText();
			 String senha1 = String.valueOf(senha.getPassword());
			
			logar = "";
			
			for(int i=0; i < clientes.size(); i++) {
				logar = clientes.get(i).logar(login1, senha1);
				if(logar.equals("A")){
					// fazer um seja bem vindo
					clientela = i;
					break;
				}
			}
			
			if(logar.equals("N")) {
				System.out.println("Coloque um login valido!!");
			}
			
		}while(logar != "A");
	}
	
	
	
	
	
	
	
	
}
	
