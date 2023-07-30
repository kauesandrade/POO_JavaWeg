package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class TelaFinalizarCompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinalizarCompra frame = new TelaFinalizarCompra();
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
	public TelaFinalizarCompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.setBounds(313, 227, 111, 23);
		contentPane.add(btComprar);
		
		JButton btnNewButton = new JButton("Endereço");
		btnNewButton.setBounds(10, 227, 111, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(313, 134, 111, 23);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(313, 193, 111, 23);
		contentPane.add(comboBox_1);
		
		JLabel lbFormaPagamento = new JLabel("Forma de Pagamento");
		lbFormaPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		lbFormaPagamento.setBounds(313, 109, 111, 14);
		contentPane.add(lbFormaPagamento);
		
		JLabel lbParcelas = new JLabel("Parcelas");
		lbParcelas.setHorizontalAlignment(SwingConstants.CENTER);
		lbParcelas.setBounds(314, 168, 110, 14);
		contentPane.add(lbParcelas);
		
		JList listFinalizar = new JList();
		listFinalizar.setBounds(10, 14, 293, 193);
		contentPane.add(listFinalizar);
		
		JScrollPane scrollPane = new JScrollPane(listFinalizar);
		scrollPane.setBounds(10, 11, 293, 199);
		contentPane.add(scrollPane);
		
		JList listValores = new JList();
		listValores.setBounds(313, 11, 111, 87);
		contentPane.add(listValores);
	}
}
