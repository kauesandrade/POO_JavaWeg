package Telas;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Cliente;
import model.Endereco;
import model.Produto;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TelaNotaFiscal extends JFrame {

private ArrayList<Produto> carrinhoProdutos = new ArrayList <Produto>();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNotaFiscal frame = new TelaNotaFiscal();
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
	public TelaNotaFiscal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Cliente clienteLogado = TelaLogin.getClienteLogado();
		Endereco endereco = TelasFinalizarCompra.getEdereco();
		
		
		JLabel lblNewLabel = new JLabel("Nota Fiscal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 25));
		lblNewLabel.setBounds(153, 10, 174, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lbNome = new JLabel("Nome: "+clienteLogado.getNome());
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNome.setBounds(10, 68, 187, 25);
		contentPane.add(lbNome);
		
		JLabel lbCpf = new JLabel("CPF: "+clienteLogado.getCpf());
		lbCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCpf.setBounds(10, 103, 187, 25);
		contentPane.add(lbCpf);
		
		JLabel lbCep = new JLabel("CEP: "+endereco.getCep());
		lbCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCep.setBounds(10, 138, 187, 25);
		contentPane.add(lbCep);
		
		JLabel lbRua = new JLabel("Rua: "+endereco.getRua());
		lbRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbRua.setBounds(10, 173, 187, 25);
		contentPane.add(lbRua);
		
		JLabel lbBairro = new JLabel("Bairro: "+endereco.getBairro());
		lbBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbBairro.setBounds(10, 208, 187, 25);
		contentPane.add(lbBairro);
		
		JLabel lbMinucipioEstado = new JLabel("Municipio/Estado: "+endereco.getCidade()+" - "+endereco.getUf());
		lbMinucipioEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbMinucipioEstado.setBounds(10, 243, 317, 25);
		contentPane.add(lbMinucipioEstado);
		
		JList listFormaPagamento = new JList();
		listFormaPagamento.setBounds(207, 49, 219, 173);
		contentPane.add(listFormaPagamento);
		
		JScrollPane scrollPane = new JScrollPane(listFormaPagamento);
		scrollPane.setBounds(207, 49, 219, 173);
		contentPane.add(scrollPane);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btSair.setBounds(337, 17, 85, 21);
		contentPane.add(btSair);
		
		DefaultListModel<String> modeloFormaProdutos = new DefaultListModel<>();
		carrinhoProdutos = TelaPrincipal.getCarrinhoProdutos();
		
		for(Produto p : carrinhoProdutos) {
			
			modeloFormaProdutos.addElement("Nome: "+p.getNome()+"        "+"Preço: "+p.getPreco());
			modeloFormaProdutos.addElement("Quantidade: "+p.getQuantidadeCarrinho());
			
			listFormaPagamento.setModel(modeloFormaProdutos);
			
		}
		
		
	}
}
