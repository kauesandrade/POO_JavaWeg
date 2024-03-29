package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Cliente;
import model.Endereco;
import model.Produto;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFormattedTextField;

public class TelasFinalizarCompra extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdCartao;
	private JRadioButton rdPix;
	private JRadioButton rdBoleto;
	private ArrayList<Double> parcelas = new ArrayList();
	private ArrayList<Produto> carrinhoProdutos = new ArrayList <Produto>();
	private static String enderecoEscolhido;
	private Double valor = 0.0;
	private String formaPagamento;
	private JLabel lbNomeEndereco;
	private JTextField txNome;
	private JTextField txLogradouro;
	private JTextField txBairro;
	private JTextField txComplemento;
	private JTextField txNumCartao;
	private JTextField txNomeTitular;
	private JTextField txCodSeguranca;
	private JTextField txNumero;
	private JComboBox cbEnderecos;

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
	 * @throws ParseException 
	 */
	public TelasFinalizarCompra() throws ParseException {
		
		carrinhoProdutos = TelaPrincipal.getCarrinhoProdutos();
		
		for (Produto a : carrinhoProdutos) {
			System.out.println(a.getNome());
		}
		
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
		Endereco.setLayout(null);
		
		lbNomeEndereco = new JLabel("Nome:");
		lbNomeEndereco.setBounds(10, 1, 62, 23);
		Endereco.add(lbNomeEndereco);
		
		txNome = new JTextField();
		txNome.setBounds(10, 19, 148, 20);
		Endereco.add(txNome);
		txNome.setColumns(10);
		
		JLabel lbCep = new JLabel("CEP:");
		lbCep.setBounds(10, 47, 62, 23);
		Endereco.add(lbCep);
		
		txLogradouro = new JTextField();
		txLogradouro.setColumns(10);
		txLogradouro.setBounds(10, 114, 148, 20);
		Endereco.add(txLogradouro);
		
		JLabel lbLogradouro = new JLabel("Logradouro:");
		lbLogradouro.setBounds(10, 96, 62, 23);
		Endereco.add(lbLogradouro);
		
		txBairro = new JTextField();
		txBairro.setColumns(10);
		txBairro.setBounds(10, 163, 148, 20);
		Endereco.add(txBairro);
		
		JLabel lbBairro = new JLabel("Bairro:");
		lbBairro.setBounds(10, 145, 62, 23);
		Endereco.add(lbBairro);
		
		JComboBox cbPais = new JComboBox();
		cbPais.setModel(new DefaultComboBoxModel(new String[] {"Brasil", "EUA"}));
		cbPais.setBounds(271, 17, 148, 22);
		Endereco.add(cbPais);
		
		JLabel lbPais = new JLabel("País:");
		lbPais.setBounds(271, 0, 62, 23);
		Endereco.add(lbPais);
		
		JComboBox cbEstado = new JComboBox();
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"SC", "PR", "RS"}));
		cbEstado.setBounds(271, 63, 148, 22);
		Endereco.add(cbEstado);
		
		JLabel lbEstado = new JLabel("Estado:");
		lbEstado.setBounds(271, 46, 62, 23);
		Endereco.add(lbEstado);
		
		JComboBox cbCidade = new JComboBox();
		cbCidade.setModel(new DefaultComboBoxModel(new String[] {"JOINVILLE", "JARAGUA"}));
		cbCidade.setBounds(271, 112, 148, 22);
		Endereco.add(cbCidade);
		
		JLabel lbCidade = new JLabel("Cidade:");
		lbCidade.setBounds(271, 95, 62, 23);
		Endereco.add(lbCidade);
		
		txComplemento = new JTextField();
		txComplemento.setHorizontalAlignment(SwingConstants.LEFT);
		txComplemento.setColumns(10);
		txComplemento.setBounds(271, 163, 148, 59);
		Endereco.add(txComplemento);
		
		JLabel lbComplemento = new JLabel("Complemento:");
		lbComplemento.setBounds(271, 145, 113, 23);
		Endereco.add(lbComplemento);
		
		txNumero = new JTextField();
		txNumero.setColumns(10);
		txNumero.setBounds(10, 202, 148, 20);
		Endereco.add(txNumero);
		
		JLabel lbNumero = new JLabel("Número:");
		lbNumero.setBounds(10, 184, 62, 23);
		Endereco.add(lbNumero);
		
		MaskFormatter mascaraCep = new MaskFormatter("##.###-###");
		mascaraCep.setPlaceholderCharacter('_');
		
		JFormattedTextField ftCep = new JFormattedTextField(mascaraCep);
		ftCep.setBounds(10, 64, 150, 21);
		Endereco.add(ftCep);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Endereco endereco = new Endereco(txNome.getText(), ftCep.getText(), txLogradouro.getText(), Integer.parseInt(txNumero.getText()),
	    				cbPais.getSelectedItem().toString(), cbEstado.getSelectedItem().toString(), cbCidade.getSelectedItem().toString(),
	    				txComplemento.getText(), txBairro.getText());
				
	    		Cliente clienteLogado = TelaLogin.getClienteLogado();
	    		
	    		Boolean i = false;

	    			for(Endereco ende : clienteLogado.getArrEnderecos()) {
						if(ende.getCep().equals(ftCep.getText()) || ende.getIdentificacao().equals(txNome.getText())) {
							JOptionPane.showMessageDialog(null, "Você já adicionou esse endereço!!!", "Endereço já existente", JOptionPane.DEFAULT_OPTION);
							i = true;
				    		break;
						}
				}
					if(i==false) {
			    		clienteLogado.setEnderecos(endereco);
			    		TelaLogin.setclienteLogado(clienteLogado);
			    		JOptionPane.showMessageDialog(null, "Endereco cadastrado!!", "Sucesso!!", JOptionPane.DEFAULT_OPTION);

				}
			}
		});
		btSalvar.setBounds(180, 201, 79, 23);
		Endereco.add(btSalvar);		
		
		
		JPanel Valor = new JPanel();
		tabbedPane.addTab("Forma de Pagamento", null, Valor, null);
		Valor.setLayout(null);
		
		JList listValores = new JList();
		listValores.setBounds(304, 11, 120, 55);
		Valor.add(listValores);
		
		JLabel lbFormaPagamento = new JLabel("Forma de Pagamento");
		lbFormaPagamento.setBounds(313, 98, 111, 14);
		lbFormaPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		Valor.add(lbFormaPagamento);
		
		JComboBox cbParcela = new JComboBox();
		cbParcela.setBounds(170, 199, 111, 23);
		Valor.add(cbParcela);
		
		JLabel lbParcelas = new JLabel("Parcelas");
		lbParcelas.setBounds(170, 183, 110, 14);
		lbParcelas.setHorizontalAlignment(SwingConstants.CENTER);
		Valor.add(lbParcelas);
		
		rdCartao = new JRadioButton("Cartão de Crédito");
		rdCartao.setBounds(315, 119, 109, 23);
		rdCartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdCartao.isSelected()) {
					rdPix.setSelected(false);
					rdBoleto.setSelected(false);
					
					formaPagamento = "Cartão de Crédito";
					
					parcelas.clear();
					cbParcela.removeAllItems();
					
					for (int i = 0; i < 10; i++) {
						
						parcelas.add(valor/(i+1));
						
						cbParcela.addItem((i+1)+" X "+parcelas.get(i));
					}
					
					
				}

			}
		});
		Valor.add(rdCartao);
		
		rdPix = new JRadioButton("Pix");
		rdPix.setBounds(315, 145, 109, 23);
		rdPix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdPix.isSelected()) {
					rdCartao.setSelected(false);
					rdBoleto.setSelected(false);
					
					formaPagamento = "Pix";
					
					parcelas.clear();
					cbParcela.removeAllItems();
					
					cbParcela.addItem("1 X "+valor);
					
				}
			}
		});
		Valor.add(rdPix);
		
		rdBoleto = new JRadioButton("Boleto");
		rdBoleto.setBounds(315, 171, 109, 23);
		rdBoleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdBoleto.isSelected()) {
					rdCartao.setSelected(false);
					rdPix.setSelected(false);
					
					formaPagamento = "Boleto";
					
					parcelas.clear();
					cbParcela.removeAllItems();
					
					for (int i = 0; i < 5; i++) {
						
						parcelas.add(valor/(i+1));
						
						cbParcela.addItem((i+1)+" X "+parcelas.get(i));
					}
				}
			}
		});
		Valor.add(rdBoleto);
		
		JList listFormaPagamento = new JList();
		listFormaPagamento.setBounds(10, 11, 288, 162);
		Valor.add(listFormaPagamento);
		
		JScrollPane spFormaPagamento = new JScrollPane();
		spFormaPagamento.setBounds(10, 11, 288, 162);
		Valor.add(spFormaPagamento);
		
		
		DefaultListModel<String> modeloFormaProdutos = new DefaultListModel<>();
		DefaultListModel<String> modeloValores = new DefaultListModel<>();
		
		tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
		    public void stateChanged(javax.swing.event.ChangeEvent e) {
		    	if(tabbedPane.getSelectedComponent() == Valor ) {
		    		
		    		listFormaPagamento.removeAll();
		    		modeloFormaProdutos.removeAllElements();
		    		
		    		Double valorParcial = 0.0;
		    		
		    		for(Produto p : carrinhoProdutos) {
		    			
		    			modeloFormaProdutos.addElement("Nome: "+p.getNome()+"        "+"Preço: "+p.getPreco());
		    			modeloFormaProdutos.addElement("Quantidade: "+p.getQuantidadeCarrinho());
		    			
		    			valorParcial += p.getPreco() * p.getQuantidadeCarrinho();
		    			
		    			listFormaPagamento.setModel(modeloFormaProdutos);
		    			
		    		}
		    		
		    		valor = valorParcial;
		    		
		    		modeloValores.addElement("Valor: "+valorParcial);
		    		if(valorParcial*0.1 >=100) {
			    		modeloValores.addElement("Frete: Grátis");
		    		}else {
			    		modeloValores.addElement("Frete: "+valorParcial*0.1);
			    		valor += valorParcial*0.1;
		    		}
		    		modeloValores.addElement("Valor Total: "+valor);
		    		listValores.setModel(modeloValores);
		    		
		    		
		    	}
		    	
		    }
		});
		
		JButton btProximoPagamento = new JButton("Continuar");
		btProximoPagamento.setBounds(10, 199, 111, 23);
		btProximoPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdBoleto.isSelected() || rdPix.isSelected() || rdCartao.isSelected()) {
				
				JPanel Conclusao = new JPanel();
				tabbedPane.addTab("Conclusão", null, Conclusao, null);
				Conclusao.setLayout(null);
				
				JList listItensConclusao = new JList();
				listItensConclusao.setBounds(10, 11, 278, 192);
				Conclusao.add(listItensConclusao);
				
				JScrollPane scItensConclusao = new JScrollPane(listItensConclusao, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				scItensConclusao.setBounds(10, 11, 278, 192);
				Conclusao.add(scItensConclusao);
				
				JList listValoreConclusao = new JList();
				listValoreConclusao.setBounds(294, 11, 125, 73);
				Conclusao.add(listValoreConclusao);
				
				JList listInfoEndereco = new JList();
				listInfoEndereco.setBounds(294, 130, 125, 73);
				Conclusao.add(listInfoEndereco);
				
				DefaultListModel<String> modeloEnderecoConclusao = new DefaultListModel<>();
				
				cbEnderecos = new JComboBox();
				cbEnderecos.addActionListener(new ActionListener() {
					@SuppressWarnings("unlikely-arg-type")
					public void actionPerformed(ActionEvent e) {
						
						listInfoEndereco.removeAll();
						modeloEnderecoConclusao.removeAllElements();
						
						ArrayList<Endereco> enderecos = new ArrayList<>();
						TelaLogin.getClienteLogado();
						enderecos = Cliente.getArrEnderecos();
						
						for (Endereco endere : enderecos) {
							if(endere.getIdentificacao().equals(cbEnderecos)) {
								modeloEnderecoConclusao.addElement("CEP: "+endere.getCep());
								modeloEnderecoConclusao.addElement(endere.getRua()+", "+endere.getNumero());
								
								listInfoEndereco.setModel(modeloEnderecoConclusao);
							}
							
						}
						
					}
				});
				cbEnderecos.setBounds(294, 103, 125, 22);
				Conclusao.add(cbEnderecos);
				
				JLabel lbEndereco = new JLabel("Endereço:");
				lbEndereco.setBounds(298, 89, 88, 14);
				Conclusao.add(lbEndereco);
				
				tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
			    public void stateChanged(javax.swing.event.ChangeEvent e) {
			    	if(tabbedPane.getSelectedComponent() == Conclusao) {
			    		
			    		DefaultListModel<String> modeloProdutosConclusao = new DefaultListModel<>();
			    		DefaultListModel<String> modeloValoresConclusao = new DefaultListModel<>();
			    		DefaultListModel<String> modeloEnderecoConclusao = new DefaultListModel<>();
			    		
			    		listItensConclusao.removeAll();
			    		listValoreConclusao.removeAll();
			    		cbEnderecos.removeAllItems();
			    		
			    		for(Produto p : carrinhoProdutos) {
			    			
			    			modeloProdutosConclusao.addElement("Nome: "+p.getNome()+"       "+"Quantidade: "+p.getQuantidadeCarrinho());
			    			modeloProdutosConclusao.addElement("Preço Total: "+(p.getPreco()*p.getQuantidadeCarrinho()));
			    			
			    			listItensConclusao.setModel(modeloProdutosConclusao);
			    		}
			    		
			    		modeloValoresConclusao.addElement("Valor Total: "+valor);
			    		modeloValoresConclusao.addElement("Forma Pagamento: ");
			    		modeloValoresConclusao.addElement(formaPagamento);
			    		modeloValoresConclusao.addElement("Parcelas: "+cbParcela.getSelectedItem().toString());
			    		
			    		listValoreConclusao.setModel(modeloValoresConclusao);
			    		
			    		
						ArrayList<Endereco> enderecos = new ArrayList<>();
						
						enderecos = TelaLogin.getClienteLogado().getArrEnderecos();
						
						for (Endereco endereco : enderecos) {
							cbEnderecos.addItem(endereco.getIdentificacao());
						}
			    	}
			    }
			});
			
				JPanel Pagamento = new JPanel();
				tabbedPane.addTab("Pagamento", null, Pagamento, null);
				Pagamento.setLayout(null);
				
				
				
				
				tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
				    public void stateChanged(javax.swing.event.ChangeEvent e) {
				    	if(tabbedPane.getSelectedComponent() == Pagamento ) {
				    		
						
				    		if(rdCartao.isSelected()) {
								Pagamento.removeAll();
								
								JButton btProximoConclusao = new JButton("Continuar");
								btProximoConclusao.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
						
										ArrayList<Endereco> enderecos = new ArrayList<>();
										
										enderecos = TelaLogin.getClienteLogado().getArrEnderecos();
										
										if(enderecos.size() > 0  && txNumCartao.getText() != null && txNomeTitular.getText() != null && txCodSeguranca.getText() != null) {
											enderecoEscolhido = cbEnderecos.getSelectedItem().toString();
											TelaNotaFiscal TelaNotaFiscal = new TelaNotaFiscal();
											TelaNotaFiscal.setVisible(true);
											dispose();
										}else {
											JOptionPane.showMessageDialog(null, "Erro ao finalizar", "Erro", JOptionPane.DEFAULT_OPTION);
										}
										
									}
								});
								btProximoConclusao.setBounds(330, 199, 89, 23);
								Pagamento.add(btProximoConclusao);
								
								JLabel lbTitulo = new JLabel("Adicione um Cartão");
								lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
								lbTitulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
								lbTitulo.setBounds(139, 7, 165, 23);
								Pagamento.add(lbTitulo);
								
								txNumCartao = new JTextField();
								txNumCartao.setForeground(new Color(114, 114, 114));
								txNumCartao.setBounds(10, 43, 409, 29);
								Pagamento.add(txNumCartao);
								txNumCartao.setColumns(10);
								
								txNomeTitular = new JTextField();
								txNomeTitular.setForeground(new Color(114, 114, 114));
								txNomeTitular.setColumns(10);
								txNomeTitular.setBounds(10, 95, 409, 29);
								Pagamento.add(txNomeTitular);
								
								txCodSeguranca = new JTextField();
								txCodSeguranca.setForeground(new Color(114, 114, 114));
								txCodSeguranca.setColumns(10);
								txCodSeguranca.setBounds(10, 147, 119, 29);
								Pagamento.add(txCodSeguranca);
								
								JFormattedTextField ftDataValidade = new JFormattedTextField();
								ftDataValidade.setBounds(10, 199, 119, 23);
								Pagamento.add(ftDataValidade);
								
								JLabel lbNumCartao = new JLabel("Número do Cartão ( Apenas números):");
								lbNumCartao.setBounds(10, 29, 206, 14);
								Pagamento.add(lbNumCartao);
								
								JLabel lbNomeTitular = new JLabel("Digite o nome do titular:");
								lbNomeTitular.setToolTipText("");
								lbNomeTitular.setBounds(10, 83, 206, 14);
								Pagamento.add(lbNomeTitular);
								
								JLabel lbCodSeguranca = new JLabel("Código de segurança:");
								lbCodSeguranca.setBounds(10, 133, 206, 14);
								Pagamento.add(lbCodSeguranca);
								
								JLabel lbDataValidade = new JLabel("Data Validade:");
								lbDataValidade.setBounds(10, 187, 206, 14);
								Pagamento.add(lbDataValidade);
								
								JButton btSalvar = new JButton("Salvar");
								btSalvar.setBounds(226, 199, 89, 23);
								Pagamento.add(btSalvar);
								
								
								
								Pagamento.validate();
							}if(rdPix.isSelected()) {
								Pagamento.removeAll();
								
								
								JButton btProximoConclusao = new JButton("Comprar");
								btProximoConclusao.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										
										ArrayList<Endereco> enderecos = new ArrayList<>();
										
										enderecos = TelaLogin.getClienteLogado().getArrEnderecos();
										
										if(enderecos.size() > 0) {
											enderecoEscolhido = cbEnderecos.getSelectedItem().toString();
											TelaNotaFiscal TelaNotaFiscal = new TelaNotaFiscal();
											TelaNotaFiscal.setVisible(true);
											dispose();
										}else {
											JOptionPane.showMessageDialog(null, "Erro ao finalizar", "Erro", JOptionPane.DEFAULT_OPTION);
										}
									}
								});
								btProximoConclusao.setBounds(330, 199, 89, 23);
								Pagamento.add(btProximoConclusao);
								
								JLabel lbTitulo = new JLabel("PIX");
								lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
								lbTitulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
								lbTitulo.setBounds(136, 11, 165, 23);
								Pagamento.add(lbTitulo);
								
								JLabel lbQR = new JLabel("FOTO DO QR");
								lbQR.setBounds(146, 45, 151, 143);
								Pagamento.add(lbQR);
								
								
								Pagamento.validate();
							}
							
							if(rdBoleto.isSelected()) {
								Pagamento.removeAll();
								
								
								JButton btProximoConclusao = new JButton("Continuar");
								btProximoConclusao.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										ArrayList<Endereco> enderecos = new ArrayList<>();
										
										enderecos = TelaLogin.getClienteLogado().getArrEnderecos();
										
										if(enderecos.size() > 0) {
											enderecoEscolhido = cbEnderecos.getSelectedItem().toString();
											TelaNotaFiscal TelaNotaFiscal = new TelaNotaFiscal();
											TelaNotaFiscal.setVisible(true);
											dispose();
										}else {
											JOptionPane.showMessageDialog(null, "Erro ao finalizar", "Erro", JOptionPane.DEFAULT_OPTION);
										}
									}
								});
								btProximoConclusao.setBounds(330, 199, 89, 23);
								Pagamento.add(btProximoConclusao);
								
								JLabel lbTitulo = new JLabel("Boleto");
								lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
								lbTitulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
								lbTitulo.setBounds(136, 11, 165, 23);
								Pagamento.add(lbTitulo);
								
								JLabel lbBoleto = new JLabel("FOTO BOLETO");
								lbBoleto.setBounds(146, 45, 151, 143);
								Pagamento.add(lbBoleto);
								
								
								Pagamento.validate();
							}
				    		
				    	
				    	}
				    }
				});
				
				Valor.remove(btProximoPagamento);
				
				}
			}
		});
		Valor.add(btProximoPagamento);
		

	}
	
	public static Endereco getEdereco() {
		

		ArrayList<Endereco> enderecos = new ArrayList<>();
		
		enderecos = TelaLogin.getClienteLogado().getArrEnderecos();
	
		for(Endereco ender : enderecos) {
			if(ender.getIdentificacao().equals(enderecoEscolhido)) {
				return ender;
			}
		}
		return null;
	}

}
