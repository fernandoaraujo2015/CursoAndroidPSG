package br.senec.pi;


import javax.swing.JOptionPane;

public class Janela {

	public static void main(String[] args){
		
		String nome = null;
				int resposta;
				nome = JOptionPane.showInputDialog("Qual � o seu nome?");
				resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + "?");
				if (resposta == JOptionPane.YES_OPTION) {
				// verifica se o usu�rio clicou no bot�o YES
				JOptionPane.showMessageDialog(null, "Seu nome � " + nome);
				} else {
				JOptionPane.showMessageDialog(null, "Seu nome n�o � " + nome);
				}
	}

}

