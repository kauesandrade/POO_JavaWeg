package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Cliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;



public class TelaCadastro extends JFrame {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txLogin;
	private JTextField txEmail;
	private JPasswordField pfSenha;

	public static ArrayList<Cliente> getArrClientes() {
		return clientes;
	}
	public static ArrayList<Cliente> setArrClientes() {
		return clientes;
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Cadastro");
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setBackground(Color.WHITE);
		lbTitulo.setBounds(162, 10, 97, 28);
		lbTitulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 22));
		contentPane.add(lbTitulo);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setBackground(Color.WHITE);
		btVoltar.setBounds(325, 15, 89, 23);
		contentPane.add(btVoltar);
		
		txNome = new JTextField();
		txNome.setBounds(162, 49, 106, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setForeground(Color.WHITE);
		lbNome.setBounds(101, 52, 46, 14);
		contentPane.add(lbNome);
		
		txLogin = new JTextField();
		txLogin.setColumns(10);
		txLogin.setBounds(162, 80, 106, 20);
		contentPane.add(txLogin);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setForeground(Color.WHITE);
		lbLogin.setBounds(101, 83, 46, 14);
		contentPane.add(lbLogin);
		
		txEmail = new JTextField();
		txEmail.setColumns(10);
		txEmail.setBounds(162, 142, 106, 20);
		contentPane.add(txEmail);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setForeground(Color.WHITE);
		lbSenha.setBounds(101, 114, 46, 14);
		contentPane.add(lbSenha);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setForeground(Color.WHITE);
		lbEmail.setBounds(101, 145, 46, 14);
		contentPane.add(lbEmail);
		
		JLabel lbCpf = new JLabel("CPF");
		lbCpf.setForeground(Color.WHITE);
		lbCpf.setBounds(101, 176, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lbDataNas = new JLabel("Data de Nascimento");
		lbDataNas.setForeground(Color.WHITE);
		lbDataNas.setBounds(21, 207, 97, 14);
		contentPane.add(lbDataNas);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kaue_s_andrade\\Downloads\\748137 (1).png"));
		lblNewLabel.setBounds(309, 95, 105, 106);
		contentPane.add(lblNewLabel);
		
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		mascaraCpf.setPlaceholderCharacter('_');
		MaskFormatter mascaraDataNas = new MaskFormatter( "##/##/####");
		mascaraDataNas.setPlaceholderCharacter('_');
		
		JFormattedTextField ftCpf = new JFormattedTextField(mascaraCpf);
		ftCpf.setBounds(162, 173, 106, 20);
		contentPane.add(ftCpf);
		
		JFormattedTextField ftDataNas = new JFormattedTextField(mascaraDataNas);
		ftDataNas.setBounds(162, 204, 106, 20);
		contentPane.add(ftDataNas);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
					 
				String nome = txNome.getText();
				String login = txLogin.getText();
				String senha = String.valueOf(pfSenha.getPassword());
				String email = txEmail.getText();
				String cpf = ftCpf.getText();
				String dataNas = ftDataNas.getText().toString();
					
					 
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				 	Date data = null;
					try {
						data = formato.parse(dataNas);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				String cadastrar = cliente.cadastrar(nome, login, senha, cpf, data, email);
				
					if(cadastrar != "A") {
						JOptionPane.showMessageDialog(null, cadastrar, "Erro", JOptionPane.DEFAULT_OPTION);
					}
					else if(cadastrar.equals("A")){
						JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Confirmado", JOptionPane.DEFAULT_OPTION);
						clientes.add(cliente);
						dispose();
							
				}
			}
		});
		btSalvar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btSalvar.setBackground(Color.WHITE);
		btSalvar.setBounds(170, 235, 89, 23);
		contentPane.add(btSalvar);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(162, 111, 106, 20);
		contentPane.add(pfSenha);
	}
}
