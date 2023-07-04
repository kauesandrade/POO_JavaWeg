package window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class telaProduto extends JFrame {
	// Conjunto de componenetes;
	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txPreco;
	private JTextField txCor;
	private JTextField txModelo;
	private JTextField txDescricao;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaProduto frame = new telaProduto();
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
	public telaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 409);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txNome = new JTextField();
		txNome.setBounds(162, 11, 180, 28);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(103, 13, 50, 25);
		contentPane.add(lbNome);
		
		
		JLabel lbPreco = new JLabel("Preço");
		lbPreco.setBounds(103, 49, 50, 25);
		contentPane.add(lbPreco);
		
		JLabel lbCor = new JLabel("Cor");
		lbCor.setBounds(103, 85, 50, 25);
		contentPane.add(lbCor);
		
		JLabel lbModelo = new JLabel("Modelo");
		lbModelo.setBounds(103, 121, 50, 25);
		contentPane.add(lbModelo);
		
		JLabel lbDescricao = new JLabel("Descricao");
		lbDescricao.setBounds(103, 219, 50, 25);
		contentPane.add(lbDescricao);
		
		txPreco = new JTextField();
		txPreco.setColumns(10);
		txPreco.setBounds(162, 50, 180, 28);
		contentPane.add(txPreco);
		
		txCor = new JTextField();
		txCor.setColumns(10);
		txCor.setBounds(162, 87, 180, 28);
		contentPane.add(txCor);
		
		txModelo = new JTextField();
		txModelo.setColumns(10);
		txModelo.setBounds(162, 123, 180, 28);
		contentPane.add(txModelo);
		
		txDescricao = new JTextField();
		txDescricao.setColumns(10);
		txDescricao.setBounds(162, 217, 180, 28);
		contentPane.add(txDescricao);
		
		JComboBox CbxCategoria = new JComboBox();
		CbxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Esporte", "Casa", "Roupa", "Calçados", "Tecnologia"}));
		CbxCategoria.setBounds(162, 162, 180, 44);
		contentPane.add(CbxCategoria);
		
		JLabel lbCategoria = new JLabel("Categoira");
		lbCategoria.setBounds(103, 177, 50, 25);
		contentPane.add(lbCategoria);
	
	
	// Cria um objeto Jbuttton
	JButton btSlavar = new JButton("Salvar");
	//Cria um evento ActionListener
	btSlavar.addActionListener(new ActionListener() {

		//Método actionPerformed
		public void actionPerformed(ActionEvent e) {
			
			Produto p = new Produto();
			
			p.setNome(txNome.getText());
			p.setCor(txCor.getText());
			p.setPreco(Double.parseDouble(txPreco.getText()));
			p.setModelo(txModelo.getText());
			p.setDescricao(txDescricao.getText());
			p.setCategoria(CbxCategoria.getSelectedItem().toString());
			
			
			JOptionPane.showMessageDialog(null, "Produto Cadastrado: "+p.getTudo());
			
		}
		
		
	});
	btSlavar.setBounds(357, 287, 139, 50);
	contentPane.add(btSlavar);
}
}
