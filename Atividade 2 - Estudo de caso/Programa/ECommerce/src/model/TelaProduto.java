package model;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

public class TelaProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> ListaProduto = new ArrayList<Produto>();
		
		JLabel lbNome = new JLabel("Nome: ");
		JLabel lbPreco = new JLabel("Preço: ");
		JLabel lbCategoria = new JLabel("Categoria: ");
		JLabel lbAvaliacao = new JLabel("Avaliação: ");
		JTextField txNome = new JTextField();
		JTextField txPreco = new JTextField();
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Esportes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		JTable tabelaProdutos = new JTable(new Object[][] {"Batada", "1.95"},
											new Object[] {"Nome", "Preço"});
		
		Object[] componentes = {lbNome, txNome, lbPreco, txPreco, lbCategoria, cbCategoria};
		
		JOptionPane.showMessageDialog(null, componentes, "Cadastrar Produto", JOptionPane.DEFAULT_OPTION);
		
		Produto p = new Produto();
		p.setNome(txNome.getText());
		p.setPreco(Double.parseDouble(txPreco.getText()));
//		p.setCategoria(String.substring(cbCategoria.getSelectedItem()));
		
		ListaProduto.add(p);
		
//		JList
//		JTable
		
		for(int i = 0; i < ListaProduto.size(); i++) {
			System.out.println("\nNome: "+ListaProduto.get(i).getNome()
					+"\nPreço: "+ListaProduto.get(i).getPreco());	
		}
		
		//for reduzido
		for(Produto p1: ListaProduto) {
			System.out.println("\nNome: "+p1.getNome()
					+"\nPreço: "+p1.getPreco());	
		}
		
	}

}
