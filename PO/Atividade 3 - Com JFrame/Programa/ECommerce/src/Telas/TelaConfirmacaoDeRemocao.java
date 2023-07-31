package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaConfirmacaoDeRemocao extends JFrame {

	private JPanel contentPane;
	private static String opcao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirmacaoDeRemocao frame = new TelaConfirmacaoDeRemocao();
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
	public TelaConfirmacaoDeRemocao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Você deseja remover o item do carrinho?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 17));
		lblNewLabel.setBounds(41, 21, 360, 50);
		contentPane.add(lblNewLabel);
		
		JButton btRemover = new JButton("Remover");
		btRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcao = "R";
				dispose();
			}
		});
		btRemover.setBounds(117, 174, 204, 39);
		contentPane.add(btRemover);
		
		JButton btNaoRemover = new JButton("Continuar Com o item");
		btNaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcao = "C";
				dispose();
			}
		});
		btNaoRemover.setBounds(117, 106, 204, 39);
		contentPane.add(btNaoRemover);
	}
	static String opcao() {
		return opcao;
		
	}
}

