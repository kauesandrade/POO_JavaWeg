package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
public class CadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txNomeP;
	private JTextField txModeloP;
	private JTextField txPrecoP;
	private JTextField txCorP;
	private JTextField textField;
	private JTextField txLimiteCompraP;
	private JTextField txQuantidadeEstoqueP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProduto frame = new CadastrarProduto();
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
	public CadastrarProduto() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Cadastro Produto");
		lbTitulo.setForeground(new Color(255, 255, 255));
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lbTitulo.setBounds(119, 0, 167, 37);
		contentPane.add(lbTitulo);
		
		JLabel lbNomeP = new JLabel("Nome Produto");
		lbNomeP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbNomeP.setForeground(new Color(255, 255, 255));
		lbNomeP.setBounds(10, 39, 73, 14);
		contentPane.add(lbNomeP);
		
		txNomeP = new JTextField();
		txNomeP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txNomeP.setBounds(10, 53, 157, 20);
		contentPane.add(txNomeP);
		txNomeP.setColumns(10);
		
		JLabel lbPrecoP = new JLabel("Preço");
		lbPrecoP.setForeground(Color.WHITE);
		lbPrecoP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbPrecoP.setBounds(10, 78, 56, 14);
		contentPane.add(lbPrecoP);
		
		txModeloP = new JTextField();
		txModeloP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txModeloP.setColumns(10);
		txModeloP.setBounds(10, 169, 157, 20);
		contentPane.add(txModeloP);
		
		JComboBox cbCategoriaP = new JComboBox();
		cbCategoriaP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		cbCategoriaP.setBounds(9, 129, 157, 22);
		contentPane.add(cbCategoriaP);
		
		JLabel lbCategoriaP = new JLabel("Categoria");
		lbCategoriaP.setForeground(Color.WHITE);
		lbCategoriaP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbCategoriaP.setBounds(9, 116, 56, 14);
		contentPane.add(lbCategoriaP);
		
		JLabel lbModeloP = new JLabel("Modelo");
		lbModeloP.setForeground(Color.WHITE);
		lbModeloP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbModeloP.setBounds(10, 155, 73, 14);
		contentPane.add(lbModeloP);
		
		txPrecoP = new JTextField();
		txPrecoP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txPrecoP.setBounds(10, 92, 95, 20);
		contentPane.add(txPrecoP);
		txPrecoP.setColumns(10);
		
		txCorP = new JTextField();
		txCorP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txCorP.setColumns(10);
		txCorP.setBounds(10, 209, 157, 20);
		contentPane.add(txCorP);
		
		JLabel lbCorP = new JLabel("Cor");
		lbCorP.setForeground(Color.WHITE);
		lbCorP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbCorP.setBounds(10, 195, 73, 14);
		contentPane.add(lbCorP);
		
		textField = new JTextField();
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(197, 64, 191, 56);
		contentPane.add(textField);
		
		JLabel lbDescricaoP = new JLabel("Descricao");
		lbDescricaoP.setForeground(Color.WHITE);
		lbDescricaoP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbDescricaoP.setBounds(197, 39, 89, 34);
		contentPane.add(lbDescricaoP);
		
		JLabel lbLimiteCompraP = new JLabel("Limite de compra por pessoa");
		lbLimiteCompraP.setForeground(Color.WHITE);
		lbLimiteCompraP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbLimiteCompraP.setBounds(197, 128, 130, 14);
		contentPane.add(lbLimiteCompraP);
		
		txLimiteCompraP = new JTextField();
		txLimiteCompraP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txLimiteCompraP.setColumns(10);
		txLimiteCompraP.setBounds(197, 143, 37, 20);
		contentPane.add(txLimiteCompraP);
		
		JLabel lbQuantidadeEstoqueP = new JLabel("Quantidade existente no estoque");
		lbQuantidadeEstoqueP.setForeground(Color.WHITE);
		lbQuantidadeEstoqueP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbQuantidadeEstoqueP.setBounds(197, 169, 157, 14);
		contentPane.add(lbQuantidadeEstoqueP);
		
		txQuantidadeEstoqueP = new JTextField();
		txQuantidadeEstoqueP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txQuantidadeEstoqueP.setColumns(10);
		txQuantidadeEstoqueP.setBounds(197, 184, 37, 20);
		contentPane.add(txQuantidadeEstoqueP);
	}
}
