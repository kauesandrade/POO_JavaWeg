package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Cliente;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaEditCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txEmail;
	private JPasswordField pfSenha;
	private JTextField txLogin;
	private JTextField txNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEditCadastro frame = new TelaEditCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaEditCadastro() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Cliente cliente = TelaLogin.getClienteLogado();
		
		
		
		txEmail = new JTextField(cliente.getEmail());
		txEmail.setColumns(10);
		txEmail.setBounds(172, 132, 106, 20);
		contentPane.add(txEmail);
		
		pfSenha = new JPasswordField(cliente.getSenha());
		pfSenha.setBounds(172, 101, 106, 20);
		contentPane.add(pfSenha);
		
		txLogin = new JTextField(cliente.getLogin());
		txLogin.setColumns(10);
		txLogin.setBounds(172, 70, 106, 20);
		contentPane.add(txLogin);
		
		txNome = new JTextField(cliente.getNome());
		txNome.setColumns(10);
		txNome.setBounds(172, 39, 106, 20);
		contentPane.add(txNome);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btVoltar.setBackground(Color.WHITE);
		btVoltar.setBounds(335, 5, 89, 23);
		contentPane.add(btVoltar);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txNome.getText();
				String login = txLogin.getText();
				String senha = String.valueOf(pfSenha.getPassword());
				String email = txEmail.getText();
				
				String opcao = cliente.editDados(nome, login, senha, email);
					
				if (opcao.equals("A")) {
					JOptionPane.showMessageDialog(null, "Cadastro Atualizado!!!", "Sucesso!!", JOptionPane.DEFAULT_OPTION);
					TelaLogin.setclienteLogado(cliente);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, opcao+"!!!", "Erro", JOptionPane.DEFAULT_OPTION);
				}
				
				
			}
		});
		btSalvar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btSalvar.setBackground(Color.WHITE);
		btSalvar.setBounds(175, 185, 89, 23);
		contentPane.add(btSalvar);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setBounds(111, 135, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(0, 0, 0));
		lblSenha.setBounds(111, 104, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(new Color(0, 0, 0));
		lblLogin.setBounds(111, 73, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 0, 0));
		lblNome.setBounds(111, 42, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lbTitulo = new JLabel("Editar Cadastro");
		lbTitulo.setForeground(new Color(0, 0, 0));
		lbTitulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 22));
		lbTitulo.setBackground(Color.WHITE);
		lbTitulo.setBounds(142, 0, 170, 28);
		contentPane.add(lbTitulo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\POO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\imgLogin.png"));
		lblNewLabel.setBounds(319, 85, 105, 106);
		contentPane.add(lblNewLabel);
	}
}
