package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Produto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CadastrarProduto extends JFrame {
	
	private static ArrayList<Produto> produtos = new ArrayList();
	private JComboBox <String> cbCategoriaP = new JComboBox<String>();

	private JPanel contentPane;
	private JTextField txNomeP;
	private JTextField txModeloP;
	private JTextField txPrecoP;
	private JTextField txCorP;
	private JTextField txDescricaoP;
	private JTextField txLimiteCompraP;
	private JTextField txQuantidadeEstoqueP;
	private JTextField txMarcaP;

	/**
	 * Launch the application.
	 */
	
	
//	public static void addInfo() {
//		
//	}
	
	
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
		
//		cbCategoriaP = TelaPrincipal.categorias();
		
		cbCategoriaP.addItem("Esportes");
		cbCategoriaP.addItem("Infantil");
		cbCategoriaP.addItem("Tecnologia");
		cbCategoriaP.addItem("Lazer");
		cbCategoriaP.addItem("Cozinha");
		
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
		
		txDescricaoP = new JTextField();
		txDescricaoP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txDescricaoP.setColumns(10);
		txDescricaoP.setBounds(196, 89, 191, 56);
		contentPane.add(txDescricaoP);
		
		JLabel lbDescricaoP = new JLabel("Descricao");
		lbDescricaoP.setForeground(Color.WHITE);
		lbDescricaoP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbDescricaoP.setBounds(196, 64, 89, 34);
		contentPane.add(lbDescricaoP);
		
		JLabel lbLimiteCompraP = new JLabel("Limite de compra por pessoa");
		lbLimiteCompraP.setForeground(Color.WHITE);
		lbLimiteCompraP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbLimiteCompraP.setBounds(196, 153, 130, 14);
		contentPane.add(lbLimiteCompraP);
		
		txLimiteCompraP = new JTextField();
		txLimiteCompraP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txLimiteCompraP.setColumns(10);
		txLimiteCompraP.setBounds(196, 168, 37, 20);
		contentPane.add(txLimiteCompraP);
		
		JLabel lbQuantidadeEstoqueP = new JLabel("Quantidade existente no estoque");
		lbQuantidadeEstoqueP.setForeground(Color.WHITE);
		lbQuantidadeEstoqueP.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbQuantidadeEstoqueP.setBounds(196, 194, 157, 14);
		contentPane.add(lbQuantidadeEstoqueP);
		
		txQuantidadeEstoqueP = new JTextField();
		txQuantidadeEstoqueP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txQuantidadeEstoqueP.setColumns(10);
		txQuantidadeEstoqueP.setBounds(196, 209, 37, 20);
		contentPane.add(txQuantidadeEstoqueP);
		
		txMarcaP = new JTextField();
		txMarcaP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txMarcaP.setColumns(10);
		txMarcaP.setBounds(196, 53, 157, 20);
		contentPane.add(txMarcaP);
		
		JLabel lbMarca = new JLabel("Marca");
		lbMarca.setForeground(Color.WHITE);
		lbMarca.setFont(new Font("MS PGothic", Font.PLAIN, 11));
		lbMarca.setBounds(196, 39, 73, 14);
		contentPane.add(lbMarca);
		
		JButton btCadastrarP = new JButton("Cadastrar");
		btCadastrarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				
				String nome = txNomeP.getText();
				Double preco = Double.parseDouble(txPrecoP.getText());
				String categoria = cbCategoriaP.getSelectedItem().toString();
				String modelo = txModeloP.getText();
				String marca = txMarcaP.getText();
				String cor = txCorP.getText();
				String descricao = txDescricaoP.getText();
				int limite = Integer.parseInt(txLimiteCompraP.getText());
				int quantidade = Integer.parseInt(txQuantidadeEstoqueP.getText());
				
				String cadasProduto = produto.CadastrarProduto( nome, preco, categoria, modelo,
						marca, cor, descricao, limite, quantidade);
				
					if(cadasProduto.equals("A")) {
						produtos.add(produto);
						JOptionPane.showConfirmDialog(null, "Produto Cadastrado!!!", "Confirmado", JOptionPane.CANCEL_OPTION);
						dispose();
					}
					else if(cadasProduto != "A") {
						JOptionPane.showConfirmDialog(null, cadasProduto, "Erro", JOptionPane.CANCEL_OPTION);
					}
				}
		});
		btCadastrarP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btCadastrarP.setBounds(312, 227, 112, 23);
		contentPane.add(btCadastrarP);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btVoltar.setBounds(312, 11, 112, 23);
		contentPane.add(btVoltar);
		
	}
	public static ArrayList<Produto> produtos() {	
		return produtos;
}
}
