package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Produto;

import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class TelaPrincipal extends JFrame {
	
	/**
	 * Launch the application.
	 */
	
	private ArrayList<Produto> produtos = new ArrayList <Produto>();
	private static JComboBox<String> cbCategorias = new JComboBox<String>();
	private static int selecProduto;
	private String dados;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		getContentPane().setBackground(new Color(0, 128, 128));
		getContentPane().setForeground(new Color(0, 128, 192));
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		getContentPane().add(tabbedPane);
		
		JPanel telaPricipal = new JPanel();
		tabbedPane.addTab("Tela Principal", null, telaPricipal, null);
		telaPricipal.setLayout(null);
		
		cbCategorias.addItem("Esportes");
		cbCategorias.addItem("Infantil");
		cbCategorias.addItem("Tecnologia");
		cbCategorias.addItem("Lazer");
		cbCategorias.addItem("Cozinha");
		
		cbCategorias.setBounds(298, 11, 121, 23);
		telaPricipal.add(cbCategorias);
		
		JComboBox<String> cbProdutos = new JComboBox<String>();
		cbProdutos.setBounds(298, 95, 121, 22);
		telaPricipal.add(cbProdutos);
		
		JButton btProcurar = new JButton("Procurar");
		btProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cbProdutos.removeAllItems();
				dados = "";
				
				produtos = CadastrarProduto.produtos();
				
				String categoria = cbCategorias.getSelectedItem().toString();
				
				for(int i = 0; i < produtos.size(); i++) {
					
					if(produtos.get(i).getCategoria().equals(categoria)) {
						cbProdutos.addItem(produtos.get(i).getNome());
						
						dados += produtos.get(i).getTudo();
						
						System.out.println(dados);
						
						JLabel lbMostrarProdutos = new JLabel("cudemacho"+dados);
						lbMostrarProdutos.setBounds(10, 15, 270, 173);
						telaPricipal.add(lbMostrarProdutos);
						
					}

				}
					
				}
		});

		btProcurar.setBounds(319, 45, 89, 23);
		telaPricipal.add(btProcurar);
		
		JButton btSelecionarProduto = new JButton("Selecionar");
		btSelecionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecNomeProduto = "N";

				if( produtos.size() > 0) {
					selecNomeProduto = cbProdutos.getSelectedItem().toString();
					}
				
				else if(produtos.size() == 0) {
//					JOptionPane.showMessageDialog(null, "Não há Produtos nessa categoria", ("Categoira: "+categoria), JOptionPane.DEFAULT_OPTION);
				}

				if(selecNomeProduto != "N") {
					for(int i = 0; i < produtos.size(); i++) {
						if(produtos.get(i).getNome().equals(selecNomeProduto)) {
							selecProduto = i;
						}
					}
					
				}
			}
		});
		btSelecionarProduto.setBounds(319, 128, 89, 23);
		telaPricipal.add(btSelecionarProduto);
		
		JButton btCadastraProduto = new JButton("Cadastrar Produto");
		btCadastraProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarProduto cadastrarProduto = null;
				try {
					cadastrarProduto = new CadastrarProduto();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				cadastrarProduto.setVisible(true);
			}
		});
		btCadastraProduto.setBounds(10, 199, 121, 23);
		telaPricipal.add(btCadastraProduto);
		
		JPanel carrinho = new JPanel();
		tabbedPane.addTab("Carrinho", null, carrinho, null);
		carrinho.setLayout(null);
		
		JButton btRemoverItens = new JButton("Remover Itens");
		btRemoverItens.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btRemoverItens.setBounds(60, 199, 155, 23);
		carrinho.add(btRemoverItens);
		
		JButton btFinalizarCompra = new JButton("Finalizar Compra");
		btFinalizarCompra.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btFinalizarCompra.setBounds(225, 199, 155, 23);
		carrinho.add(btFinalizarCompra);
		
		JLabel lbCarrinho = new JLabel("a");
		lbCarrinho.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbCarrinho.setBounds(21, 11, 267, 177);
		carrinho.add(lbCarrinho);
		
		JLabel lbIconCarrinho = new JLabel("");
		lbIconCarrinho.setIcon(new ImageIcon("C:\\Users\\kaue_s_andrade\\Documents\\GitHub\\PO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\carrinho-de-compras.png"));
		lbIconCarrinho.setBounds(274, 23, 131, 150);
		carrinho.add(lbIconCarrinho);
		
		JPanel perfil = new JPanel();
		tabbedPane.addTab("Perfil", null, perfil, null);
		tabbedPane.setBackgroundAt(2, new Color(0, 128, 128));
		perfil.setLayout(null);
		
		JLabel lbUsuarioInfo = new JLabel("Ne");
		lbUsuarioInfo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbUsuarioInfo.setBounds(10, 53, 296, 153);
		perfil.add(lbUsuarioInfo);
		
		JButton btnNewButton = new JButton("Editir Perfil");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btnNewButton.setBounds(301, 199, 118, 23);
		perfil.add(btnNewButton);
		
		JLabel lbIconPerfil = new JLabel("");
		lbIconPerfil.setIcon(new ImageIcon("C:\\Users\\kaue_s_andrade\\Documents\\GitHub\\PO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\image-removebg-preview (1).png"));
		lbIconPerfil.setBounds(316, 44, 103, 127);
		perfil.add(lbIconPerfil);
		
		JLabel lbUsuarioNome = new JLabel("User");
		lbUsuarioNome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbUsuarioNome.setBounds(10, 11, 162, 31);
		perfil.add(lbUsuarioNome);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
	
	private static int selecProduto() {
		return selecProduto;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
