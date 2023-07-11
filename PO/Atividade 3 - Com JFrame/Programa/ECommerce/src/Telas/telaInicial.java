package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class telaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	public telaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(109, 152, 186));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btSair = new JButton("Sair");
		btSair.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btSair.setForeground(new Color(64, 0, 64));
		btSair.setBackground(Color.WHITE);
		btSair.setBounds(192, 227, 65, 23);
		contentPane.add(btSair);
		
		JButton btCadastro = new JButton("Cadastrar");
		btCadastro.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btCadastro.setForeground(new Color(64, 0, 64));
		btCadastro.setBackground(Color.WHITE);
		btCadastro.setBounds(152, 88, 143, 38);
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro TelaCadastro = null;
				try {
					TelaCadastro = new TelaCadastro();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				TelaCadastro.setVisible(true);
				
			}
		});
		contentPane.add(btCadastro);
		
		JButton btLogin = new JButton("Login");
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin TelaLogin = new TelaLogin();
				TelaLogin.setVisible(true);
			}
		});
		btLogin.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btLogin.setForeground(new Color(64, 0, 64));
		btLogin.setBackground(Color.WHITE);
		btLogin.setBounds(152, 137, 144, 38);
		contentPane.add(btLogin);
		
		JLabel lbLogo = new JLabel("KAUE SHOP");
		lbLogo.setIcon(new ImageIcon("C:\\Users\\kaue_s_andrade\\Downloads\\5903430 (1).png"));
		lbLogo.setForeground(new Color(255, 255, 255));
		lbLogo.setBackground(new Color(255, 255, 255));
		lbLogo.setBounds(137, 31, 165, 56);
		lbLogo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		contentPane.add(lbLogo);
	}
}
