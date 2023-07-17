package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
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
		
		JLabel lbUsuario = new JLabel("Ne");
		lbUsuario.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lbUsuario.setBounds(10, 11, 296, 195);
		perfil.add(lbUsuario);
		
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
