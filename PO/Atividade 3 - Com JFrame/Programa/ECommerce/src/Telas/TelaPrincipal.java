package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Cliente;
import model.Produto;

import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;

public class TelaPrincipal extends JFrame {
	
	/**
	 * Launch the application.
	 */
	
	private ArrayList<Produto> produtos = new ArrayList <Produto>();
	private static ArrayList<Produto> carrinhoProdutos = new ArrayList <Produto>();
	private static JComboBox<String> cbCategorias = new JComboBox<String>();
	private static int selecProduto;
	private String dados;

	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setBounds(100, 100, 450, 300);
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
		tabbedPane.setBounds(0, 10, 434, 261);
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
		
		JList<String> listProdutos = new JList<String>();
		listProdutos.setBounds(10, 11, 278, 177);
		telaPricipal.add(listProdutos);
		
		JScrollPane spProdutos = new JScrollPane(listProdutos, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		spProdutos.setBounds(10, 11, 278, 177);
		telaPricipal.add(spProdutos);
		
		JButton btProcurar = new JButton("Procurar");
		btProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cbProdutos.removeAllItems();
				listProdutos.removeAll();
				
				dados = "";
				
				produtos = CadastrarProduto.produtos();
				
				String categoria = cbCategorias.getSelectedItem().toString();
				
				DefaultListModel<String> modeloProdutos = new DefaultListModel<>();
				
				for(int i = 0; i < produtos.size(); i++) {
					
					if(produtos.get(i).getCategoria().equals(categoria) && produtos.get(i).getQuantidadeEstoque() > 0) {
						cbProdutos.addItem(produtos.get(i).getNome());
						
						System.out.println(dados);
						
						modeloProdutos.addElement("Produto: "+produtos.get(i).getNome()+"      "+"Avaliacao: "+produtos.get(i).getAvaliacao() );
						modeloProdutos.addElement("Preço: "+produtos.get(i).getPreco()+"       "+"Marca: "+produtos.get(i).getMarca());
						modeloProdutos.addElement(" ");
						
						listProdutos.setModel(modeloProdutos);
						
						
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
				listProdutos.removeAll();

				if( produtos.size() > 0) {
					selecNomeProduto = cbProdutos.getSelectedItem().toString();
					}

				if(selecNomeProduto != "N") {
					for(int i = 0; i < produtos.size(); i++) {
						if(produtos.get(i).getNome().equals(selecNomeProduto)) {
							selecProduto = i;
						}
					}
					
				}
				TelaProduto telaProduto = new TelaProduto();
				telaProduto.setVisible(true);
				
				
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
		btCadastraProduto.setBounds(10, 199, 178, 23);
		telaPricipal.add(btCadastraProduto);
		
		JPanel carrinho = new JPanel();
		tabbedPane.addTab("Carrinho", null, carrinho, null);
		carrinho.setLayout(null);
		
		JButton btFinalizarCompra = new JButton("Finalizar Compra");
		btFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Produto prod : produtos) {
				carrinhoProdutos.add(prod);
			}
				
				TelasFinalizarCompra TelasFinalizarCompra = null;
				try {
					TelasFinalizarCompra = new TelasFinalizarCompra();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				TelasFinalizarCompra.setVisible(true);		
				
			}
		});
		btFinalizarCompra.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btFinalizarCompra.setBounds(120, 198, 155, 23);
		carrinho.add(btFinalizarCompra);
		
		JLabel lbIconCarrinho = new JLabel("");
		lbIconCarrinho.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\POO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\imgCarrinho.png"));
		lbIconCarrinho.setBounds(301, 37, 128, 120);
		carrinho.add(lbIconCarrinho);
		
		JTable tbCarrinho = new JTable(new DefaultTableModel(null, new Object[]{"Produto","Preco","Adicionar","Quatidade","Remover"}));
		
		DefaultTableModel model = (DefaultTableModel)tbCarrinho.getModel();
		
		tbCarrinho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectRow = tbCarrinho.getSelectedRow();
				int selectColumn = tbCarrinho.getSelectedColumn();
					
				for(int j = 0; j < produtos.size(); j++) {
				for(int i = 0; i < tbCarrinho.getRowHeight(); i++) {
					if(selectColumn == 4 && produtos.get(j).getRow() == selectRow) {
						if(produtos.get(j).getQuantidadeCarrinho() >=2) {
							produtos.get(j).setQuantidadeCarrinho(produtos.get(j).getQuantidadeCarrinho() - 1);	
							produtos.get(j).setQuantidadeEstoque(produtos.get(j).getQuantidadeEstoque() + 1);
						model.setValueAt(produtos.get(j).getQuantidadeCarrinho(), selectRow, 3);
						break;
						}else {
	
							produtos.get(j).setQuantidadeCarrinho(0);	
							model.removeRow(selectRow);
							break;
						}

						}	
					
					else if(selectColumn == 2 && produtos.get(j).getRow() == selectRow) {
						if(produtos.get(j).getQuantidadeCarrinho() < produtos.get(j).getLimiteDeCompras()) {
							produtos.get(j).setQuantidadeCarrinho(produtos.get(j).getQuantidadeCarrinho() + 1);	
							produtos.get(j).setQuantidadeEstoque(produtos.get(j).getQuantidadeEstoque() - 1);
							model.setValueAt(produtos.get(j).getQuantidadeCarrinho(), selectRow, 3);
							break;
						}else {
							JOptionPane.showMessageDialog(null, "Você não pode adicionar mais quantidades desse mesmo produto no seu carrinho, Limite atingido!!!", "Limite Atingido", JOptionPane.DEFAULT_OPTION);
							break;
						}
					}
					
					
					
					
					
					
					}
				}
			}
		});
		
		
		
		tbCarrinho.setToolTipText("");
		tbCarrinho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbCarrinho.setFillsViewportHeight(true);
		tbCarrinho.setCellSelectionEnabled(true);
		tbCarrinho.setBounds(10, 11, 286, 177);
		carrinho.add(tbCarrinho);
		tbCarrinho.setDefaultEditor(Object.class, null);
		
		tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
		    public void stateChanged(javax.swing.event.ChangeEvent e) {
		    	if(tabbedPane.getSelectedComponent() == carrinho) {
		    		
		    		model.setRowCount(0);
		    		
		    		for(int i = 0; i < produtos.size(); i++) {
		    			if(produtos.get(i).getQuantidadeCarrinho() > 0) {
		    				
		    				produtos.get(i).setRow(i);
		    				model.addRow(new Object[] {produtos.get(i).getNome(),"R$ "+produtos.get(i).getPreco(),"+",produtos.get(i).getQuantidadeCarrinho(),"-"});
		    				
		    				
		    			}
		    		}
		    		
		    	}
		    }
		});
		
		JPanel perfil = new JPanel();
		tabbedPane.addTab("Perfil", null, perfil, null);
		tabbedPane.setBackgroundAt(2, new Color(0, 128, 128));
		perfil.setLayout(null);
		
		JButton btnNewButton = new JButton("Editir Perfil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaEditCadastro TelaEditCadastro = null;
				try {
					TelaEditCadastro = new TelaEditCadastro();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				TelaEditCadastro.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		btnNewButton.setBounds(301, 199, 118, 23);
		perfil.add(btnNewButton);
		
		JLabel lbIconPerfil = new JLabel("");
		lbIconPerfil.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\POO_Java\\PO\\Atividade 3 - Com JFrame\\assets\\imgLogin.png"));
		lbIconPerfil.setBounds(316, 44, 103, 127);
		perfil.add(lbIconPerfil);
		
		
		
		tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
		    public void stateChanged(javax.swing.event.ChangeEvent e) {
		    	if(tabbedPane.getSelectedComponent() == perfil) {
		    		
		    		

		    		Cliente clienteLogado = TelaLogin.getClienteLogado();
		    		
		    		JLabel lbUsuarioNome = new JLabel(""+clienteLogado.getLogin());
		    		lbUsuarioNome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 30));
		    		lbUsuarioNome.setBounds(10, 11, 235, 31);
		    		perfil.add(lbUsuarioNome);
		    		
		    		JLabel lbNome = new JLabel("Nome: "+clienteLogado.getNome());
		    		lbNome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		    		lbNome.setBounds(10, 64, 270, 23);
		    		perfil.add(lbNome);
		    		
		    		JLabel lbCpf = new JLabel("CPF: "+clienteLogado.getCpf());
		    		lbCpf.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		    		lbCpf.setBounds(10, 98, 207, 23);
		    		perfil.add(lbCpf);
		    		
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					String data = formato.format(clienteLogado.getDataDeNascimento());
		    		
		    		JLabel lbDataNasc = new JLabel("Data de nascimento: "+data);
		    		lbDataNasc.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		    		lbDataNasc.setBounds(10, 132, 270, 23);
		    		perfil.add(lbDataNasc);
		    		
		    		JLabel lbEmail = new JLabel("Email: "+clienteLogado.getEmail());
		    		lbEmail.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		    		lbEmail.setBounds(10, 166, 270, 23);
		    		perfil.add(lbEmail);
		    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    		setBounds(100, 100, 450, 300);
		    		
		    	}
		    }
		});
		
		
		
		
	
	}
	
	static int selecProduto() {
		return selecProduto;
	}

	public static ArrayList<Produto> getCarrinhoProdutos() {
		return carrinhoProdutos;
	}
	
}
