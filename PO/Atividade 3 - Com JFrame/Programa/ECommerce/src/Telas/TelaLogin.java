package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txLogin;
	private JPasswordField PfSenha;

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
		lbSenha.setBounds(113, 147, 46, 20);
		contentPane.add(lbSenha);
		
		txLogin = new JTextField();
		txLogin.setBounds(174, 101, 86, 20);
		contentPane.add(txLogin);
		txLogin.setColumns(10);
		
		PfSenha = new JPasswordField();
		PfSenha.setBounds(174, 149, 86, 20);
		contentPane.add(PfSenha);
		
		JButton btLogar = new JButton("Logar");
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
		lbLogoLogar.setIcon(new ImageIcon("C:\\Users\\kaue_s_andrade\\Downloads\\image-removebg-preview (1).png"));
		lbLogoLogar.setBounds(319, 85, 105, 105);
		contentPane.add(lbLogoLogar);
	}
}
