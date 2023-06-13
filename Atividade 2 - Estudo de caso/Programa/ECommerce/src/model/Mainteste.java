package model;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mainteste {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Cliente> clientes = new ArrayList();
	private static  Cliente cliente = new Cliente();
	
	public static void main(String[] args) {

		
	
	 
	 //--------------Tela Inicio-----------
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

			
			 
//			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//			Date data = formato.parse("23/04/2005");
//			
			
			logar = cliente.cadastrar(nome, login, senha, cpf, dataNas, email);
			
			if(logar == "N") {
				System.out.println("Digite uma parametro melhor");
			}else {
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
	 
	 JOptionPane.showMessageDialog(null, co, "Login", JOptionPane.OK_CANCEL_OPTION);
		
		
		
		
		
		
		String logar = "";
		
		do {
	
			
			for(int i=0; i < clientes.size(); i++) {
				logar = cliente.logar(login, senha);
				if(logar == "A"){
					break;
				}
			}
			
			if(logar == "N") {
				System.out.println("Coloque um login valido!!");
			}
			
		}while(logar != "A");
	}
	
	
	
	
	
	
	
	
}
	
