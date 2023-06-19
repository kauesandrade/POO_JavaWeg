package Secretaria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadAluno { // Interface (MVC)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Componentes:
		JLabel nome = new JLabel("Digite seu nome: ");
		JTextField txNome = new JTextField();
		Object[] componentes = { nome, txNome };
		JOptionPane.showMessageDialog(null, componentes, "Eu sou uma janela", JOptionPane.DEFAULT_OPTION);

	}

}