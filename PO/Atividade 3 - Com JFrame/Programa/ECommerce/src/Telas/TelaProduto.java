package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TelaProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txQuatidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbQuantidadeP = new JLabel("Quantidade");
		lbQuantidadeP.setForeground(new Color(255, 255, 255));
		lbQuantidadeP.setBackground(new Color(255, 255, 255));
		lbQuantidadeP.setHorizontalAlignment(SwingConstants.LEFT);
		lbQuantidadeP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lbQuantidadeP.setBounds(275, 176, 121, 24);
		contentPane.add(lbQuantidadeP);
		
		txQuatidade = new JTextField();
		txQuatidade.setBounds(275, 200, 121, 20);
		contentPane.add(txQuatidade);
		txQuatidade.setColumns(10);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btComprar.setBounds(275, 225, 122, 23);
		contentPane.add(btComprar);
		
		JLabel lbIconProduto = new JLabel("Imagem Produto");
		lbIconProduto.setBounds(10, 45, 210, 155);
		contentPane.add(lbIconProduto);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btVoltar.setBounds(335, 11, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel lbNomeP = new JLabel("Nome Produto");
		lbNomeP.setForeground(new Color(255, 255, 255));
		lbNomeP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbNomeP.setBounds(10, 15, 210, 33);
		contentPane.add(lbNomeP);
		
		JLabel lbPreco = new JLabel("Preço:");
		lbPreco.setForeground(new Color(255, 255, 255));
		lbPreco.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbPreco.setBounds(275, 153, 115, 24);
		contentPane.add(lbPreco);
		
		JLabel lbCor = new JLabel("Cor:");
		lbCor.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbCor.setForeground(new Color(255, 255, 255));
		lbCor.setBounds(10, 194, 89, 24);
		contentPane.add(lbCor);
		
		JLabel lbModelo = new JLabel("Modelo:");
		lbModelo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbModelo.setForeground(new Color(255, 255, 255));
		lbModelo.setBounds(10, 225, 89, 24);
		contentPane.add(lbModelo);
		
		JLabel lbCategoria = new JLabel("Categoria:");
		lbCategoria.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbCategoria.setForeground(new Color(255, 255, 255));
		lbCategoria.setBounds(109, 224, 89, 24);
		contentPane.add(lbCategoria);
		
		JLabel lblQuantidadeEstoque = new JLabel("Quantidade Estoque:");
		lblQuantidadeEstoque.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lblQuantidadeEstoque.setForeground(new Color(255, 255, 255));
		lblQuantidadeEstoque.setBounds(107, 194, 145, 24);
		contentPane.add(lblQuantidadeEstoque);
		
		JLabel lbDescricaoP = new JLabel("Descriçao do Produto: ");
		lbDescricaoP.setForeground(new Color(255, 255, 255));
		lbDescricaoP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbDescricaoP.setVerticalAlignment(SwingConstants.TOP);
		lbDescricaoP.setBounds(275, 45, 149, 109);
		contentPane.add(lbDescricaoP);
	}
}
