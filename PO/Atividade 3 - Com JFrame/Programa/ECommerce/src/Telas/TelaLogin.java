package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Cliente;
import model.Endereco;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {
	
	private static ArrayList<Cliente> clientes = new ArrayList();
	private static int logado;
	
	private JPanel contentPane;
	private JTextField txLogin;
	private JPasswordField PfSenha;

	public static Cliente getClienteLogado() {
		return clientes.get(logado);
	}
	public static void setclienteLogado(Cliente cliente) {
		clientes.get(logado).setCpf(cliente.getCpf());
		clientes.get(logado).setDataDeNascimento(cliente.getDataDeNascimento());
		clientes.get(logado).setEmail(cliente.getEmail());
		clientes.get(logado).setLogin(cliente.getLogin());
		clientes.get(logado).setNome(cliente.getNome());
		clientes.get(logado).setSenha(cliente.getSenha());
//		clientes.get(logado).setTelefone(cliente.getTelefone());
		clientes.get(logado).setArrEnderecos(cliente.getArrEnderecos());
		
	}
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 39));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(157, 23, 116, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbLogin.setForeground(Color.WHITE);
		lbLogin.setBounds(113, 99, 46, 20);
		contentPane.add(lbLogin);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setForeground(Color.WHITE);
		lbSenha.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbSenha.setBounds(108, 146, 80, 20);
		contentPane.add(lbSenha);
		
		txLogin = new JTextField();
		txLogin.setBounds(174, 101, 86, 20);
		contentPane.add(txLogin);
		txLogin.setColumns(10);
		
		PfSenha = new JPasswordField();
		PfSenha.setBounds(174, 149, 86, 20);
		contentPane.add(PfSenha);
		
		JButton btLogar = new JButton("Logar");
		btLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clientes = TelaCadastro.getArrClientes();
				
				 String login1 = txLogin.getText();
				 String senha1 = String.valueOf(PfSenha.getPassword());
				
				 String logar ="";
				 
				for(int i=0; i < clientes.size(); i++) {
					logar = clientes.get(i).logar(login1, senha1);
					if(logar.equals("A")){
						JOptionPane.showMessageDialog(null, "Seja Bem-Vindo "+clientes.get(i).getNome(), "Login Efetuado", JOptionPane.DEFAULT_OPTION);
						logado = i;
						dispose();
						TelaPrincipal TelaPrincipal = new TelaPrincipal();
						TelaPrincipal.setVisible(true);
					}
				}
				
				if(logar.equals("N")) {
					JOptionPane.showMessageDialog(null, "Coloque um login valido!!", "Erro!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btLogar.setBackground(Color.WHITE);
		btLogar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btLogar.setBounds(171, 213, 89, 23);
		contentPane.add(btLogar);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setBackground(Color.WHITE);
		btVoltar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btVoltar.setBounds(339, 35, 70, 20);
		contentPane.add(btVoltar);
		
		JLabel lbLogoLogar = new JLabel("");
		lbLogoLogar.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\POO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\imgLogin.png"));
		lbLogoLogar.setBounds(319, 85, 105, 105);
		contentPane.add(lbLogoLogar);
	}
}
