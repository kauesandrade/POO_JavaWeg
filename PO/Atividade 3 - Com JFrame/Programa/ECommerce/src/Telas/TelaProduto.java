package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Produto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txQuantidade;
	private int selecProduto;
	private ArrayList<Produto> produtos = new ArrayList <Produto>();

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
		
		selecProduto = TelaPrincipal.selecProduto();
		produtos = CadastrarProduto.produtos();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbQuantidadeP = new JLabel("Quantidade:");
		lbQuantidadeP.setForeground(new Color(255, 255, 255));
		lbQuantidadeP.setBackground(new Color(255, 255, 255));
		lbQuantidadeP.setHorizontalAlignment(SwingConstants.LEFT);
		lbQuantidadeP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lbQuantidadeP.setBounds(275, 176, 121, 24);
		contentPane.add(lbQuantidadeP);
		
		txQuantidade = new JTextField();
		txQuantidade.setBounds(275, 200, 121, 20);
		contentPane.add(txQuantidade);
		txQuantidade.setColumns(10);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int quantidade = Integer.parseInt(txQuantidade.getText());
				
				if( quantidade <= produtos.get(selecProduto).getQuantidadeEstoque() && quantidade <= produtos.get(selecProduto).getLimiteDeCompras()) {
					
					produtos.get(selecProduto).setQuantidadeCarrinho(quantidade);
					produtos.get(selecProduto).setQuantidadeEstoque(produtos.get(selecProduto).getQuantidadeEstoque() - quantidade);
					dispose();
				}
				else if (quantidade > produtos.get(selecProduto).getQuantidadeEstoque()) {
					JOptionPane.showMessageDialog(null, "Quantidade escolhida maior que a do estoque atual!!", "ERRO!", JOptionPane.DEFAULT_OPTION);
				}
				else if (quantidade > produtos.get(selecProduto).getLimiteDeCompras()){
					JOptionPane.showMessageDialog(null, "Quantidade escolhida maior que a do limite de compra atual!!", "ERRO!", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
		btComprar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btComprar.setBounds(275, 225, 122, 23);
		contentPane.add(btComprar);
		
		JLabel lbIconProduto = new JLabel("");
		lbIconProduto.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\POO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\imgProduto.png"));
		lbIconProduto.setBounds(58, 47, 100, 94);
		contentPane.add(lbIconProduto);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btVoltar.setBounds(335, 11, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel lbNomeP = new JLabel(""+produtos.get(selecProduto).getNome());
		lbNomeP.setForeground(new Color(255, 255, 255));
		lbNomeP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbNomeP.setBounds(10, 15, 210, 33);
		contentPane.add(lbNomeP);
		
		JLabel lbPreco = new JLabel("Preço: R$"+produtos.get(selecProduto).getPreco());
		lbPreco.setForeground(new Color(255, 255, 255));
		lbPreco.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		lbPreco.setBounds(275, 153, 115, 24);
		contentPane.add(lbPreco);
		
		JLabel lbCor = new JLabel("Cor: "+produtos.get(selecProduto).getCor());
		lbCor.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbCor.setForeground(new Color(255, 255, 255));
		lbCor.setBounds(8, 149, 244, 24);
		contentPane.add(lbCor);
		
		JLabel lbModelo = new JLabel("Modelo: "+produtos.get(selecProduto).getModelo());
		lbModelo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbModelo.setForeground(new Color(255, 255, 255));
		lbModelo.setBounds(10, 196, 244, 24);
		contentPane.add(lbModelo);
		
		JLabel lbCategoria = new JLabel("Categoria: "+produtos.get(selecProduto).getCategoria());
		lbCategoria.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbCategoria.setForeground(new Color(255, 255, 255));
		lbCategoria.setBounds(8, 172, 244, 24);
		contentPane.add(lbCategoria);
		
		JLabel lblQuantidadeEstoque = new JLabel("Quantidade Estoque: "+produtos.get(selecProduto).getQuantidadeEstoque());
		lblQuantidadeEstoque.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lblQuantidadeEstoque.setForeground(new Color(255, 255, 255));
		lblQuantidadeEstoque.setBounds(279, 66, 145, 24);
		contentPane.add(lblQuantidadeEstoque);
		
		JLabel lbDescricaoP = new JLabel("Descriçao do Produto: "+produtos.get(selecProduto).getDescricao());
		lbDescricaoP.setForeground(new Color(255, 255, 255));
		lbDescricaoP.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbDescricaoP.setVerticalAlignment(SwingConstants.TOP);
		lbDescricaoP.setBounds(10, 229, 255, 24);
		contentPane.add(lbDescricaoP);
	}
}
