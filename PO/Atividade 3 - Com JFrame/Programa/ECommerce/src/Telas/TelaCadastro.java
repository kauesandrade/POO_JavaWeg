package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txLogin;
	private JTextField txSenha;
	private JTextField txEmail;

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
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(162, 111, 106, 20);
		contentPane.add(txSenha);
		
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
				
			}
		});
		btSalvar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btSalvar.setBackground(Color.WHITE);
		btSalvar.setBounds(170, 235, 89, 23);
		contentPane.add(btSalvar);
	}
}
