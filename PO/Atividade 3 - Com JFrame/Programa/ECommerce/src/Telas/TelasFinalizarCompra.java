package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelasFinalizarCompra extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdCartao;
	private JRadioButton rdPix;
	private JRadioButton rdBoleto;
	private ArrayList<Double> parcelas = new ArrayList();
	private Double valor = 100.0; // PASSAR VALOR DA COMPRA PELO CARRINHO

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasFinalizarCompra frame = new TelasFinalizarCompra();
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
	public TelasFinalizarCompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		JPanel Endereco = new JPanel();
		tabbedPane.addTab("Endereço", null, Endereco, null);
		
		JPanel Valor = new JPanel();
		tabbedPane.addTab("Forma de Pagamento", null, Valor, null);
		Valor.setLayout(null);
		
		JList listValores = new JList();
		listValores.setBounds(313, 11, 111, 80);
		Valor.add(listValores);
		
		JLabel lbFormaPagamento = new JLabel("Forma de Pagamento");
		lbFormaPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		lbFormaPagamento.setBounds(313, 98, 111, 14);
		Valor.add(lbFormaPagamento);
		
		JComboBox cbParcela = new JComboBox();
		cbParcela.setBounds(170, 199, 111, 23);
		Valor.add(cbParcela);
		
		JLabel lbParcelas = new JLabel("Parcelas");
		lbParcelas.setHorizontalAlignment(SwingConstants.CENTER);
		lbParcelas.setBounds(170, 183, 110, 14);
		Valor.add(lbParcelas);
		
		rdCartao = new JRadioButton("Cartão de Crédito");
		rdCartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdCartao.isSelected()) {
					rdPix.setSelected(false);
					rdBoleto.setSelected(false);
					
					parcelas.clear();
					cbParcela.removeAllItems();
					
					for (int i = 0; i < 10; i++) {
						
						parcelas.add(valor/(i+1));
						
						System.out.println(parcelas.get(i));
						
						cbParcela.addItem((i+1)+" X "+parcelas.get(i));
					}
					
					
				}
				
				
				
				
				
				
			}
		});
		rdCartao.setBounds(315, 119, 109, 23);
		Valor.add(rdCartao);
		
		rdPix = new JRadioButton("Pix");
		rdPix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdPix.isSelected()) {
					rdCartao.setSelected(false);
					rdBoleto.setSelected(false);
					
					parcelas.clear();
					cbParcela.removeAllItems();
					
					cbParcela.addItem("1 X "+valor);
					
				}
			}
		});
		rdPix.setBounds(315, 145, 109, 23);
		Valor.add(rdPix);
		
		rdBoleto = new JRadioButton("Boleto");
		rdBoleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdBoleto.isSelected()) {
					rdCartao.setSelected(false);
					rdPix.setSelected(false);
					
					parcelas.clear();
					cbParcela.removeAllItems();
					
					for (int i = 0; i < 10; i++) {
						
						parcelas.add(valor/(i+1));
						
						System.out.println(parcelas.get(i));
						
						cbParcela.addItem((i+1)+" X "+parcelas.get(i));
					}
				}
			}
		});
		rdBoleto.setBounds(315, 171, 109, 23);
		Valor.add(rdBoleto);
		
		JList listFormaPagamento = new JList();
		listFormaPagamento.setBounds(10, 11, 288, 162);
		Valor.add(listFormaPagamento);
		
		JScrollPane spFormaPagamento = new JScrollPane();
		spFormaPagamento.setBounds(10, 11, 288, 162);
		Valor.add(spFormaPagamento);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel Pagemento = new JPanel();
				tabbedPane.addTab("Pagamento", null, Pagemento, null);
				Pagemento.setLayout(null);
				
				JButton btnNewButton = new JButton("New button");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel Conclusao = new JPanel();
						tabbedPane.addTab("Conclusão", null, Conclusao, null);
					}
				});
				btnNewButton.setBounds(141, 81, 89, 23);
				Pagemento.add(btnNewButton);
			}
		});
		btComprar.setBounds(10, 199, 111, 23);
		Valor.add(btComprar);
		
		

		

	}
}
