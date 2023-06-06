package model;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Mainteste {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Cliente cliente = new Cliente();
	Date data = new Date()
	
//	cadastro -----------------------------------
		
		String logar;
	
		do {
			SimpleDateFormat formato = new SimpleDateFormat("dataB");
			 
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Login: ");
			String login = sc.next();
			System.out.println("Senha: ");
			String senha = sc.next();
			System.out.println("email: ");
			String email = sc.next();
			System.out.println("cpf: ");
			String cpf = sc.next();
			System.out.println("Data de nascimento: ");
			String dataB = sc.next();
			Date data = formato.parse(dataB);
			
			
			
			
			logar = cliente.cadastrar(nome, login, senha, cpf, data, email);
			
			if(logar == "N") {
				System.out.println("Digite uma parametor melhor");
			}
			
		}while(logar == "N");
		
		//Login ------------------------------------
		
		logar = "";
		
		do {
			
			System.out.println("Login: ");
			String login = sc.next();
			System.out.println("Senha: ");
			String senha = sc.next();
			
			logar = cliente.logar(login, senha);
			
			if(logar == "N") {
				System.out.println("Coloque um login valido!!");
			}
		}while(logar != "A");
	
	}

}
